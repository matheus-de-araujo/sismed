package br.com.unialfa.sismed.paciente.domain;

import br.com.unialfa.sismed.convenio.domain.Convenio;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Paciente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String telefone;
    private String sexo;
    private String rg;

    @ManyToOne(fetch = FetchType.EAGER)
    private Convenio convenio;
}
