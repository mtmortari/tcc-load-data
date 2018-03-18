package main.vo;

import java.io.Serializable;
import java.util.List;

import main.entity.Itinerario;
import main.entity.LinhaOnibus;

public class LinhaItinerarioVO implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private LinhaOnibus linha;
	private List<Itinerario> itinerarios;

	public LinhaOnibus getLinha() {
		return linha;
	}

	public void setLinha(LinhaOnibus linha) {
		this.linha = linha;
	}

	public List<Itinerario> getItinerarios() {
		return itinerarios;
	}

	public void setItinerarios(List<Itinerario> itinerarios) {
		this.itinerarios = itinerarios;
	}
		
		
}
