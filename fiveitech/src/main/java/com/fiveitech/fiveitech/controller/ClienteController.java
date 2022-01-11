package com.fiveitech.fiveitech.controller;

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
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

	@Autowired
	private ClienteDao clienteRepo;
	private ContasDao contasDao;
	private Optional<Cliente> cliente;
	public ClienteController(ClienteDao clienteRepo, ContasDao contasDao, Optional<Cliente> cliente,
			Optional<Contas> contas) {
		this.clienteRepo = clienteRepo;
		this.contasDao = contasDao;
		this.setCliente(cliente);
		this.setContas(contas);
	}

	public Optional<Contas> getContas() {
		return contas;
	}

	public void setContas(Optional<Contas> contas) {
		this.contas = contas;
	}

	public Optional<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(Optional<Cliente> cliente) {
		this.cliente = cliente;
	}

	private Optional<Contas> contas;

	// link de cliente de cadastrar novo
	@GetMapping("/cliente/cadastrar")
	public ModelAndView cadastrar(Cliente cliente) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("cliente/ClienteCadastrar");
		mv.addObject("cliente", new Cliente());
		return mv;
	}

	public ContasDao getContasDao() {
		return contasDao;
	}

	public void setContasDao(ContasDao contasDao) {
		this.contasDao = contasDao;
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
	public ModelAndView alterar(@PathVariable("id") Long id) {
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
	public String excluirCliente(@PathVariable("id") Long id) {
		clienteRepo.deleteById(id);
		return "redirect:/cliente/listagem";
	}

	@GetMapping("clientea/listagems/{id}")
    public ResponseEntity<Optional<Cliente>> listClientByIds(@PathVariable Long id) {
        Optional<Cliente> cliente = clienteRepo.findById(id);

        if (cliente.isPresent()) {
            return ResponseEntity.ok(cliente);
        }
        return ResponseEntity.notFound().build();
    }

		@GetMapping("clientez/listagem/{id}")
		public ModelAndView ConsultarCliente(@PathVariable Long id) {
		ModelAndView mv = new ModelAndView();
		setCliente(clienteRepo.findById(id));
		setContas(contasDao.findById(id));
		mv.setViewName("contas/ConsultarCliente");
		mv.addObject("clienteList", clienteRepo.findAll());
		mv.addObject("contasListList", contasDao.findAll());
		return mv;
	} 

	// link de cliente de listagem para alterado id cliente
	@GetMapping("cliente/listagem/{id}")
	public ModelAndView listClientById(@PathVariable("id") Long id) {
		ModelAndView mv = new ModelAndView(); 
		Optional<Cliente> cliente = clienteRepo.findById(id);
		Optional<Contas> contas = contasDao.findById(id);
		mv.setViewName("contas/ConsultarCliente");
		mv.addObject("clienteList", cliente);
		mv.addObject("contasList", contas);
		return mv;
	}


}
