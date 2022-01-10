package com.fiveitech.fiveitech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiveitech.fiveitech.dao.ContasDao;
import com.fiveitech.fiveitech.dao.ClienteDao;
import com.fiveitech.fiveitech.model.Contas;
import com.fiveitech.fiveitech.model.Cliente;

@Controller
public class ContasController {

	@Autowired
	private ContasDao contasRepo;
	private ClienteDao clienteRepo;

	// link de contas de cadastrar novo
	@GetMapping("cliente/contas/alterar/{id}")
	public ModelAndView cadastrar(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ContasCadastrar");
		mv.addObject("contas", new Contas());
		mv.addObject("cliente", new Cliente());
		return mv;
	}

	@GetMapping("cliente/contas/salvar/{titular_conta}")
	public ModelAndView alterar(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		Contas contas = contasRepo.getOne(id);
		mv.setViewName("contas/alteracao");
		mv.addObject("contas", contas);
		return mv;
	}

	// link de contas de listagem
	@GetMapping("contas/listagem")
	public ModelAndView ListagemContas(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ListaContas");
		mv.addObject("cliente", new Cliente());
		mv.addObject("contasList", contasRepo.findAll());
		return mv;
	}

	// link de contas de listagem
	@GetMapping("cliente/contas/listagem")
	public ModelAndView Listagems(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ListaContas");
		mv.addObject("cliente", new Cliente());
		mv.addObject("contasList", contasRepo.findAll());
		return mv;
	}

	// link de contas de listagem
	@GetMapping("cliente/contas/cadastrar")
	public ModelAndView Listagem(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ContasCadastrar");
		mv.addObject("cliente", new Cliente());
		mv.addObject("contasList", contasRepo.findAll());
		return mv;
	}

	// link de contas de listagem
	@GetMapping("contas/cadastrar")
	public ModelAndView Listage(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ContasCadastrar");
		mv.addObject("cliente", new Cliente());
		mv.addObject("contasList", contasRepo.findAll());
		return mv;
	}

	// link de contas de listagem para alterado id contas
	@GetMapping("contas/alterar/{id}")
	public ModelAndView alterarr(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		Contas contas = contasRepo.getOne(id);
		mv.setViewName("contas/alteracao");
		mv.addObject("contas", contas);
		return mv;
	}

	// link de contas form action alterar salvar
	@PostMapping("cliente/contas/alterar/salvar")
	public ModelAndView alterar(Contas contas) {
		ModelAndView mv = new ModelAndView();
		contasRepo.save(contas);
		mv.setViewName("redirect:/cliente/listagem");
		return mv;
	}

	// link de contas form action alterar salvar
	@PostMapping("contas/alterar/salvar")
	public ModelAndView altera(Contas contas) {
		ModelAndView mv = new ModelAndView();
		contasRepo.save(contas);
		mv.setViewName("redirect:/contas/listagem");
		return mv;
	}

	// link de contas de listagem excluir para id contas
	@GetMapping("contas/excluir/{id}")
	public String excluirContas(@PathVariable("id") Integer id) {
		contasRepo.deleteById(id);
		return "redirect:/contas/listagem";
	}

	/* select option - clienteCadastrar */

	@RequestMapping("contas/cadastrar")
	public ModelAndView ContasCadastrar() {
		ModelAndView mv = new ModelAndView("contas/ContasCadastrar");
		Iterable<Cliente> cliente = clienteRepo.findAll();
		mv.addObject("cliente", cliente);
		return mv;
	}

}
