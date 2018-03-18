package main.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "linha")
public class LinhaOnibus extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "bus_id")
	private Long linhaId;

	@Column(name = "number_id")
	private Integer numero;

	@Column(name = "name")
	private String nome;

	@Column(name = "duration")
	@Temporal(TemporalType.TIMESTAMP)
	private Date duration;

	@Column(name = "operator")
	private String operator;

	@Column(name = "origin")
	private Long originParadaId;

	@Column(name = "destination")
	private Long destinationParadaId;

	@Column(name = "origin_name")
	private String originName;

	@Column(name = "destination_name")
	private String destinationName;

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getOriginName() {
		return originName;
	}

	public void setOriginName(String originName) {
		this.originName = originName;
	}

	public String getDestinationName() {
		return destinationName;
	}

	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

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

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
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
