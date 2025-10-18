package trabalho.casa.local.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trabalho.casa.local.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
