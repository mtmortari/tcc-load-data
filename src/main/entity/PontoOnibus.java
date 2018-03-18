package main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="bus_stop")
public class PontoOnibus extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id")
	private Long pontoOnibusId;

	@Column(name="description")
	private String descricao;

	@Column(name="lat")
	private Double latitude;
	
	@Column(name="lon")
	private Double longitude;

	@Column(name="setor_cen_id")
	private Long setorCensitarioId;

	public Long getPontoOnibusId() {
		return pontoOnibusId;
	}

	public void setPontoOnibusId(Long pontoOnibusId) {
		this.pontoOnibusId = pontoOnibusId;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Long getSetorCensitarioId() {
		return setorCensitarioId;
	}

	public void setSetorCensitarioId(Long setorCensitarioId) {
		this.setorCensitarioId = setorCensitarioId;
	}

	@Override
	public Long getId() {
		return this.pontoOnibusId;
	}
}