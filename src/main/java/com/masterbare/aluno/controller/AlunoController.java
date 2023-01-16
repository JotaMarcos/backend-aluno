package com.masterbare.aluno.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.masterbare.aluno.model.Aluno;
import com.masterbare.aluno.services.AlunoService;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    @GetMapping
    public List<Aluno> obterTodos() {
        return alunoService.obterTodos();
    }

    @GetMapping("/{id}")
    public Optional<Aluno> obterPorId(@PathVariable Long id) {
        return alunoService.obterPorId(id);
    }

    @PostMapping
    public Aluno adicionar(@RequestBody Aluno aluno) {
        return alunoService.adicionar(aluno);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        alunoService.deletar(id);
        return "Aluno com id:" + id + " foi deletado com sucesso!";
    }
    
    @PutMapping("/{id}")
    public Aluno atualizar(@RequestBody Aluno aluno, @PathVariable long id) {

        return alunoService.atualizar(id, aluno);
    }
}
