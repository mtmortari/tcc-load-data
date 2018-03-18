package main.service;

import main.entity.LinhaOnibus;
import main.repository.LinhaOnibusRepository;

public class LinhaOnibusService {

	private LinhaOnibusRepository repository;
	
	public LinhaOnibusService() {
		this.repository =  new LinhaOnibusRepository();
	}
		
	public LinhaOnibus save(LinhaOnibus linha) {
		return this.repository.save(linha);
	}
	
}
