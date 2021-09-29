package br.com.unialfa.sismed.paciente.RestController;

import br.com.unialfa.sismed.paciente.domain.Paciente;
import br.com.unialfa.sismed.paciente.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RepositoryRestController
@RequestMapping(path = "pacientes")
public class PacienteController {

    private final PacienteService service;

    @Autowired
    public PacienteController(PacienteService pacienteService) {
        this.service = pacienteService;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/search/listPacientes")
    public @ResponseBody ResponseEntity<?> findAllPaciente(){
        Iterable<Paciente> pacientes = service.findAll();
        return ResponseEntity.ok(pacientes);
    }


    // @Autowired
    // PacienteRepository pacienteRepository;

    // @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    // public Iterable<Paciente> findAllPaciente(){
    //     return pacienteRepository.findAll();
    // }

    // @PostMapping(path = "/add")
    // public Paciente savePaciente(@RequestBody Paciente paciente){
    //     return pacienteRepository.save(paciente);
    // }

    // @PutMapping(path = "/edit")
    // public Paciente updatePaciente(@RequestBody Paciente paciente){
    //     return pacienteRepository.save(paciente);
    // }

    // @DeleteMapping(path = "/delete/{id}")
    // public void deletePaciente(@PathVariable(name = "id") Long id){
    //     pacienteRepository.deleteById(id);
    // }
}

