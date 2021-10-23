package tech.noetzold.api.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="TB_RELATORIO")
public class Relatorio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@NotNull
	private String nomeDoFuncionario;
	
	@NotNull
	private String relatorio;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}

	public void setNomeDoFuncionario(String nomeDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
	}

	public String getRelatorio() {
		return relatorio;
	}

	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}
}
