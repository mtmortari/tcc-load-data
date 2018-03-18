package main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "itinerario")
public class Itinerario extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "itinerario_id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "itinerario_generator")
	@GeneratedValue(strategy=GenerationType.AUTO)
	//@SequenceGenerator(name="itinerario_generator", sequenceName = "itinerario_id_seq")
	private Long itinerarioId;

	@Column(name = "bus_id")
	private Long linhaId;

	@Column(name = "bus_stop_id")
	private Long paradaId;

	@Column(name = "sequence")
	private Integer sequence;

	public Long getItinerarioId() {
		return itinerarioId;
	}

	public void setItinerarioId(Long itinerarioId) {
		this.itinerarioId = itinerarioId;
	}

	public Long getLinhaId() {
		return linhaId;
	}

	public void setLinhaId(Long linhaId) {
		this.linhaId = linhaId;
	}

	public Long getParadaId() {
		return paradaId;
	}

	public void setParadaId(Long paradaId) {
		this.paradaId = paradaId;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	@Override
	public Long getId() {
		return this.itinerarioId;
	}

}
