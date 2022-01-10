package com.fiveitech.fiveitech.controller;

import java.util.List;
import java.util.Optional;

import com.fiveitech.fiveitech.dao.ContRepository;
import com.fiveitech.fiveitech.model.Cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conta")
public class ContController {

    @Autowired
    ContRepository ContaRepo;

    @GetMapping
    public ResponseEntity<List<Cont>> listAllAccounts() {
        List<Cont> listAllAccounts = (List<Cont>) ContaRepo.findAll();
        return ResponseEntity.ok(listAllAccounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Cont>> listAccountById(@PathVariable Long id) {
        Optional<Cont> conta = ContaRepo.findById(id);

        if (conta.isPresent()) {
            return ResponseEntity.ok(conta);
        }
        return ResponseEntity.notFound().build();
    }

    public ContRepository getContaRepo() {
        return ContaRepo;
    }

    public void setContaRepo(ContRepository contaRepo) {
        ContaRepo = contaRepo;
    }
}
