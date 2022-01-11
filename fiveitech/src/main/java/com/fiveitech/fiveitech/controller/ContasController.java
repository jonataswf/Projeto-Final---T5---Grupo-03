package com.fiveitech.fiveitech.controller;

import java.util.List;
import java.util.Optional;

import com.fiveitech.fiveitech.dao.ClienteDao;
import com.fiveitech.fiveitech.dao.ContasDao;
import com.fiveitech.fiveitech.model.Cliente;
import com.fiveitech.fiveitech.model.Contas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContasController {

	@Autowired
	private ClienteDao clienteDao;
	private ContasDao contasDao;

	// link de contas de cadastrar novo
	@GetMapping("cliente/contas/novos/{id}")
	public ModelAndView cadastrar(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ContasCadastrar");
		mv.addObject("contas", new Contas());
		mv.addObject("cliente", new Cliente());
		return mv;
	}

	@GetMapping("cliente/contas/salvar/{id}")
	public ModelAndView alterar(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView();
		Optional<Contas> contas = contasDao.findById(id);
		
        if (contas.isPresent()) {
            return mv;
        }
		mv.setViewName("contas/alteracao");
		mv.addObject("contas", contas);
		return mv;
	}

	public ContasController(ClienteDao clienteDao, ContasDao contasDao) {
		this.clienteDao = clienteDao;
		this.contasDao = contasDao;
	}

	// link de contas de listagem
	@GetMapping("contas/listagem")
	public ModelAndView ListagemContas(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ListaContas");
		mv.addObject("cliente", new Cliente());
		mv.addObject("cliente", new Contas());
		mv.addObject("contasList", contasDao.findAll());
		mv.addObject("clienteList", clienteDao.findAll());
		return mv;
	}

	// link de contas de listagem
	@GetMapping("cliente/contas/listagem")
	public ModelAndView Listagems(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ListaContas");
		mv.addObject("contasList", contasDao.findAll());
		return mv;
	}

	// link de contas de listagem
	@GetMapping("cliente/contas/cadastrar")
	public ModelAndView Listagem(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ContasCadastrar");
		mv.addObject("cliente", new Cliente());
		mv.addObject("contasList", contasDao.findAll());
		return mv;
	}

	// link de contas de listagem
	@GetMapping("contas/cadastrar")
	public ModelAndView Listage(Contas contas, Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contas/ContasCadastrar");
		mv.addObject("cliente", new Cliente());
		mv.addObject("contasList", contasDao.findAll());
		return mv;
	}

	// link de contas de listagem para alterado id contas
	@GetMapping("contas/alterar/{id}")
	public ModelAndView alterarr(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView();
		Optional<Contas> contas = contasDao.findById(id);
		mv.setViewName("contas/alteracao");
		mv.addObject("contas", contas);
		return mv;
	}

	// link de contas form action alterar salvar
	@PostMapping("cliente/contas/novos/salvar")
	public ModelAndView alterar(Contas contas) {
		ModelAndView mv = new ModelAndView();
		contasDao.save(contas);
		mv.setViewName("redirect:/cliente/listagem");
		return mv;
	}

	// link de contas form action alterar salvar
	@PostMapping("contas/alterar/salvar")
	public ModelAndView altera(Contas contas) {
		ModelAndView mv = new ModelAndView();
		contasDao.save(contas);
		mv.setViewName("redirect:/contas/listagem");
		return mv;
	}

	// link de contas de listagem excluir para id contas
	@GetMapping("contas/excluir/{id}")
	public String excluirContas(@PathVariable("id") Long id) {
		contasDao.deleteById(id);
		return "redirect:/contas/listagem";
	}

	/* select option - clienteCadastrar */

	@RequestMapping("contas/cadastrar")
	public ModelAndView ContasCadastrar() {
		ModelAndView mv = new ModelAndView("contas/ContasCadastrar");
		Iterable<Cliente> cliente = clienteDao.findAll();
		mv.addObject("cliente", cliente);
		return mv;
	}

	 @GetMapping
    public ResponseEntity<List<Contas>> listAllAccounts() {
        List<Contas> listAllAccounts = (List<Contas>) contasDao.findAll();
        return ResponseEntity.ok(listAllAccounts);
    }

    @GetMapping("contas/listagem/{id}")
    public ResponseEntity<ContasDao> listAccountById(@PathVariable Long id) {
        Optional<Contas> contas = contasDao.findById(id);
        
        if (contas.isPresent()) {
            return ResponseEntity.ok(contasDao);
        }
        return ResponseEntity.notFound().build();
    }

	public ContasDao getContasDao() {
		return contasDao;
	}

	public void setContasDao(ContasDao contasDao) {
		this.contasDao = contasDao;
	}

}
