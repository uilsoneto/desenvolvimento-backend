package trabalho.casa.local.model;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDate;

@Entity
@Data
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataEntrega;
    
    private String responsavel;
}
