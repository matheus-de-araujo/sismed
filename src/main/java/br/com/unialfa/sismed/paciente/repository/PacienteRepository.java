package br.com.unialfa.sismed.paciente.repository;

import org.springframework.data.repository.CrudRepository;
import br.com.unialfa.sismed.paciente.domain.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Long> {

}
