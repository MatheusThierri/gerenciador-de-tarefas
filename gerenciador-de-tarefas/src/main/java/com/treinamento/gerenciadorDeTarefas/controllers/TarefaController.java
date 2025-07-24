package com.treinamento.gerenciadorDeTarefas.controllers;

import com.treinamento.gerenciadorDeTarefas.entities.Tarefa;
import com.treinamento.gerenciadorDeTarefas.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefaController {
    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefa> findAll() {
        return tarefaService.findAll();
    }

    @PostMapping
    public Tarefa create(@RequestBody Tarefa tarefa) {
        return tarefaService.save(tarefa);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tarefaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
