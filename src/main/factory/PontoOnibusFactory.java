package main.factory;

import java.util.List;

import main.entity.PontoOnibus;
import main.service.PontoOnibusService;

public class PontoOnibusFactory {

	PontoOnibusService service;
	
	
	public PontoOnibusFactory() {
		this.service = new PontoOnibusService();
	}
	
	public void saveList(List<PontoOnibus> lista) {
		
		for(PontoOnibus ponto : lista) {
			this.service.save(ponto);
		}		
	}
}
