package br.com.unialfa.sismed.convenio.repository;

import br.com.unialfa.sismed.convenio.domain.Convenio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource(path = "convenios")
public interface ConvenioRepository extends CrudRepository<Convenio, Long> {

    List<Convenio> findByNome(String nome);
}
