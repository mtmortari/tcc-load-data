package main.factory;

import java.util.List;

import main.entity.Itinerario;
import main.service.ItinerarioService;

public class ItinerarioFactory {

	ItinerarioService service;
	
	
	public ItinerarioFactory() {
		this.service = new ItinerarioService();
	}
	
	public void saveList(List<Itinerario> lista) {
		
		for(Itinerario itinerario : lista) {
			this.service.save(itinerario);
		}		
	}
}
