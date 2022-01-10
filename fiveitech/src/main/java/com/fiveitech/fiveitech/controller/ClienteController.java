package com.fiveitech.fiveitech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiveitech.fiveitech.dao.ClienteDao;
import com.fiveitech.fiveitech.model.Cliente;

@Controller
public class ClienteController {

	@Autowired
	private ClienteDao clienteRepo;

	// link de cliente de cadastrar novo
	@GetMapping("/cliente/cadastrar")
	public ModelAndView cadastrar(Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cliente/ClienteCadastrar");
		mv.addObject("cliente", new Cliente());
		return mv;
	}

	// link de cliente de action salvar
	@PostMapping("cliente/salvar")
	public ModelAndView ListaCliente(Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:/cliente/listagem");
		clienteRepo.save(cliente);
		return mv;
	}

	// link de cliente de listagem
	@GetMapping("cliente/listagem")
	public ModelAndView ListagemCliente() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cliente/ListaCliente");
		mv.addObject("clienteList", clienteRepo.findAll());
		return mv;
	}

	// link de cliente de listagem para alterado id cliente
	@GetMapping("cliente/alterar/{id}")
	public ModelAndView alterar(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView();
		Cliente cliente = clienteRepo.getOne(id);
		mv.setViewName("cliente/alteracao");
		mv.addObject("cliente", cliente);
		return mv;
	}

	// link de cliente form action alterar salvar
	@PostMapping("cliente/alterar/salvar")
	public ModelAndView alterar(Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		clienteRepo.save(cliente);
		mv.setViewName("redirect:/cliente/listagem");
		return mv;
	}

	// link de cliente de listagem excluir para id cliente
	@GetMapping("cliente/excluir/{id}")
	public String excluirCliente(@PathVariable("id") Integer id) {
		clienteRepo.deleteById(id);
		return "redirect:/cliente/listagem";
	}

}
