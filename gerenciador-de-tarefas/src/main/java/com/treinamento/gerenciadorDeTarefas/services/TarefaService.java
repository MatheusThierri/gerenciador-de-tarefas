package com.treinamento.gerenciadorDeTarefas.services;

import com.treinamento.gerenciadorDeTarefas.entities.Tarefa;
import com.treinamento.gerenciadorDeTarefas.repositories.TarefaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {
    @Autowired
    private TarefaRepository tarefaRepository;

    @Transactional(readOnly = true)
    public List<Tarefa> findAll() {
        List<Tarefa> tarefas = tarefaRepository.findAll();
        return tarefas;
    }

    public Tarefa save(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public void deleteById(Long id) {
        tarefaRepository.deleteById(id);
    }

}
