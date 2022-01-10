package com.fiveitech.fiveitech.controller;

import java.util.List;
import java.util.Optional;

import com.fiveitech.fiveitech.dao.ClientRepository;
import com.fiveitech.fiveitech.model.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository clientRepos;

    
    @GetMapping
    public ResponseEntity<List<Client>> listAllClients() {
        List<Client> listAllClients = (List<Client>) clientRepos.findAll();
        return ResponseEntity.ok(listAllClients);
    }

    @GetMapping("/{cod}")
    public ResponseEntity<Optional<Client>> listClientById(@PathVariable Long cod) {
        Optional<Client> client = clientRepos.findById(cod);

        if (client.isPresent()) {
            return ResponseEntity.ok(client);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Client> registerClient(@RequestBody Client client) {
        Client register = clientRepos.save(client);
        return ResponseEntity.status(HttpStatus.OK).body(register);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Client> updateClient(@RequestBody Client clientes) {
        if (clientes.getCod() > 0) {
            Client update = clientRepos.save(clientes);
            return ResponseEntity.status(HttpStatus.OK).body(update);
        }
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @DeleteMapping("/deletar/{cod}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long cod) {
        Client delete = clientRepos.findById(cod).orElse(null);
        if (delete != null) {
            try {
                clientRepos.deleteById(cod);
                return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
