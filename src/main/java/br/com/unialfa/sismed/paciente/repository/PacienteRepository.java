package br.com.unialfa.sismed.paciente.repository;

import br.com.unialfa.sismed.paciente.domain.Paciente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "pacientes")
public interface PacienteRepository extends CrudRepository<Paciente, Long> {

    @Override
    @RestResource(exported = false)
    void deleteById(Long id);

    @Override
    @RestResource(exported = false)
    Paciente save(Paciente paciente);
}
