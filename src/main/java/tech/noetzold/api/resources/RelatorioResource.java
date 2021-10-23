package tech.noetzold.api.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.noetzold.api.models.Relatorio;
import tech.noetzold.api.repository.RelatorioRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Relatorios")
public class RelatorioResource {
	
	@Autowired
	RelatorioRepository relatorioRepository;
	
	@ApiOperation(value="Retorna uma lista de Relatorios")
	@GetMapping("/relatorio")
	public List<Relatorio> listaRelatorios(){
		return relatorioRepository.findAll();
	}
	
	@ApiOperation(value="Retorna um relatorio unico")
	@GetMapping("/relatorio/{id}")
	public Relatorio listaRelatorioUnico(@PathVariable(value="id") long id){
		return relatorioRepository.findById(id);
	}
	
	@ApiOperation(value="Salva um relatorio")
	@PostMapping("/relatorio")
	public Relatorio salvaRelatorio(@RequestBody @Valid Relatorio relatorio) {
		return relatorioRepository.save(relatorio);
	}
	
	@ApiOperation(value="Deleta um relatorio")
	@DeleteMapping("/relatorio")
	public void deletaRelatorio(@RequestBody @Valid Relatorio relatorio) {
		relatorioRepository.delete(relatorio);
	}
	
	@ApiOperation(value="Atualiza um relatorio")
	@PutMapping("/relatorio")
	public Relatorio atualizaRelatorio(@RequestBody @Valid Relatorio relatorio) {
		return relatorioRepository.save(relatorio);
	}
	 

}
