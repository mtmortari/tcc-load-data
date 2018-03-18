package main.entity;

import java.time.Period;

public class LinhaOnibus extends BaseEntity {

	private static final long serialVersionUID = 1L;

	private Long linhaId;
	private String nome;
	private Period duration;
	private String operator;
	private Long originParadaId;
	private Long destinationParadaId;

	public Long getLinhaId() {
		return linhaId;
	}

	public void setLinhaId(Long linhaId) {
		this.linhaId = linhaId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Period getDuration() {
		return duration;
	}

	public void setDuration(Period duration) {
		this.duration = duration;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Long getOriginParadaId() {
		return originParadaId;
	}

	public void setOriginParadaId(Long originParadaId) {
		this.originParadaId = originParadaId;
	}

	public Long getDestinationParadaId() {
		return destinationParadaId;
	}

	public void setDestinationParadaId(Long destinationParadaId) {
		this.destinationParadaId = destinationParadaId;
	}

	@Override
	public Long getId() {
		return this.linhaId;
	}

}
