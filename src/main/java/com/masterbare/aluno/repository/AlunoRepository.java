package com.masterbare.aluno.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.masterbare.aluno.model.Aluno;

@Repository
public class AlunoRepository {
    
    // Simulando um banco de dados em memória
    private List<Aluno> alunos = new ArrayList<Aluno>();
    private Long ultimoId = 0L;

    /**
     * Método para retornar uma lista de alunos
     * @return Lista dos alunos
     */
    public List<Aluno> obterTodos() {
        return alunos;
    }

    /**
     * Método que retorna o aluno encontrado pelo seu id.
     * @param id do aluno que será localizado. 
     * @return Retorna um aluno caso seja encontrado.
     */
    public Optional<Aluno> obterPorId(Long id) {
        return alunos
                .stream()
                .filter(aluno -> aluno.getId() == id)
                .findFirst();
    }

    /**
     * Método para adicionar aluno na lista.
     * @param aluno que será adicionado.
     * @return Retorna o aluno que foi adicionado na lista.
     */
    public Aluno adicionar(Aluno aluno) {
       
        ultimoId++;

        aluno.setId(ultimoId);
        alunos.add(aluno);

        return aluno;
    }

    /**
     * Método para deletar o aluno por id.
     * @param id do aluno a ser deletado.
     */
    public void deletar(Long id) {
        alunos.removeIf(aluno -> aluno.getId() == id);
    }

    /**
     * Método para atualizar o aluno na lista.
     * @param aluno que será atualizado.
     * @return Retorna o aluno após atualizar a lista.
     */
    public Aluno atualizar(Aluno aluno) {
        // Encontrar o aluno na lista
        Optional<Aluno> alunoEncontrado = obterPorId(aluno.getId());

        if(alunoEncontrado.isEmpty()){
            throw new InputMismatchException("Aluno não encontrado");
        } 

        // Eu tenho que remover o aluno antigo da lista
        deletar(aluno.getId());
        // Depois adicionar o aluno atualizado na lista.
        alunos.add(aluno);

        return aluno;

    }

}
