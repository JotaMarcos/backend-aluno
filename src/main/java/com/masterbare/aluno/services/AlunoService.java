package com.masterbare.aluno.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.masterbare.aluno.model.Aluno;
import com.masterbare.aluno.repository.AlunoRepository;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;
    
    /**
     * Método para retornar uma lista de alunos
     * @return Lista dos alunos
     */
    public List<Aluno> obterTodos() {
        // Colocar regra aqui caso tenha ...
        return alunoRepository.obterTodos();
    }

    /**
     * Método que retorna o aluno encontrado pelo seu id.
     * @param id do aluno que será localizado. 
     * @return Retorna um aluno caso seja encontrado.
     */
    public Optional<Aluno> obterPorId(Long id) {
        return alunoRepository.obterPorId(id);
    }

     /**
     * Método para adicionar aluno na lista.
     * @param aluno que será adicionado.
     * @return Retorna o aluno que foi adicionado na lista.
     */
    public Aluno adicionar(Aluno aluno) {
        // Poderia ter alguma regra de negócio para validar o aluno.
        return alunoRepository.adicionar(aluno);
    }

    /**
     * Método para deletar o produto por id.
     * @param id do aluno a ser deletado.
     */
    public void deletar(Long id) {
        // Aqui poderia ter alguma lógica de validação.
        alunoRepository.deletar(id);
    }

    /**
     * Método para atualizar o produto na lista.
     * @param produto que será atualizado.
     * @param id do produto.
     * @return Retorna o produto após atualizar a lista.
     */
    public Aluno atualizar(Long id, Aluno aluno) {
       
        // Ter alguma validação no ID.
        aluno.setId(id);

        return alunoRepository.atualizar(aluno);
    }

}
