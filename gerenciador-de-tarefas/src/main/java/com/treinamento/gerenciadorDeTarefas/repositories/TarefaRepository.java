package com.treinamento.gerenciadorDeTarefas.repositories;

import com.treinamento.gerenciadorDeTarefas.entities.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

}
