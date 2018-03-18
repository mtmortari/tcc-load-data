package main.factory;

import java.util.List;

import main.entity.LinhaOnibus;
import main.service.LinhaOnibusService;

public class LinhaOnibusFactory {

	LinhaOnibusService service;
	
	
	public LinhaOnibusFactory() {
		this.service = new LinhaOnibusService();
	}
	
	public void saveList(List<LinhaOnibus> lista) {
		
		for(LinhaOnibus linha : lista) {
			this.service.save(linha);
		}		
	}
	
	public void save(LinhaOnibus linha) {
		this.service.save(linha);
	}
}
