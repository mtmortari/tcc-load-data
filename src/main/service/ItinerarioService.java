package main.service;

import main.entity.Itinerario;
import main.repository.ItinerarioRepository;

public class ItinerarioService {

	private ItinerarioRepository repository;
	
	public ItinerarioService() {
		this.repository =  new ItinerarioRepository();
	}
		
	public Itinerario save(Itinerario itinerario) {
		return this.repository.save(itinerario);
	}
	
}
