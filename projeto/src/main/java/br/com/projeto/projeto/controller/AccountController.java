package br.com.projeto.projeto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.projeto.model.Account;
import br.com.projeto.projeto.repository.AccountRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/contas")
public class AccountController {

    @Autowired
    AccountRepository accountRepo;

    @GetMapping
    public ResponseEntity<List<Account>> listAllAccounts() {
        List<Account> listAllAccounts = (List<Account>) accountRepo.findAll();
        return ResponseEntity.ok(listAllAccounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Account>> listAccountById(@PathVariable Long id) {
        Optional<Account> account = accountRepo.findById(id);

        if (account.isPresent()) {
            return ResponseEntity.ok(account);
        }
        return ResponseEntity.notFound().build();
    }
}
