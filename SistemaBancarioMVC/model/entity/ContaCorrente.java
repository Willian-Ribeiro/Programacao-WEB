package br.edu.ufabc.SistemaBancarioMVC.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table(name = "contacorrente")
public class ContaCorrente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="numero", nullable=false)
	private String numero;
	@Column(name = "agencia", nullable = false)
	private String agencia;
	@Column(name = "descricao", nullable = false)
	private String descricao;
	@Column(name = "ativa", nullable = false)
	private boolean ativa;
	@Column(name = "variacao", nullable = false)
	private int variacao;
	
	
	public String toString()
	{
		String tostring =
				"Id: " + String.valueOf(id)
				+ " Numero: " + numero
				+ " Agencia: " + agencia
				+ " Descricao: " + descricao
				+ " Ativa: " + String.valueOf(ativa)
				+ " Variacao: " + String.valueOf(variacao);
				
		return tostring;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	public int getVariacao() {
		return variacao;
	}
	public void setVariacao(int variacao) {
		this.variacao = variacao;
	}
}
