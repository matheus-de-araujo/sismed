package br.com.unialfa.sismed.convenio.domain;

import br.com.unialfa.sismed.paciente.domain.Paciente;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Convenio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String registroAns;
    private String telefone;

    @OneToMany
    List<Paciente> pacientes;

}
