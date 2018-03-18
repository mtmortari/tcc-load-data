package main.entity;

public class Itinerario extends BaseEntity{
	
	private static final long serialVersionUID = 1L;
	
	private Long itinerarioId;
	
	private Long linhaId;
	
	private Long paradaId;
	
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
