package main.service;

import main.entity.PontoOnibus;
import main.repository.PontoOnibusRepository;

public class PontoOnibusService {

	private PontoOnibusRepository repository;
	
	public PontoOnibusService() {
		this.repository =  new PontoOnibusRepository();
	}
		
	public PontoOnibus save(PontoOnibus ponto) {
		return this.repository.save(ponto);
	}
	
}
