package main;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import main.entity.PontoOnibus;
import main.factory.PontoOnibusFactory;

public class Main {

	public static void main(String[] args) {
		String fileName = "/home/matze/Documents/ufsc/TCC_data_mining/raw_data/openstreetmap_data_all_floripa.xml";
		insertPontosOnibus(fileName);
		//teste();
		
		
		
		
	}
	
	private static void teste() {
		
		List<PontoOnibus> listaOnibus = new ArrayList<>();
		
		PontoOnibus ponto = new PontoOnibus();
		ponto.setDescricao("tse");
		ponto.setLatitude(-3.0);
		ponto.setLongitude(2.2);
		ponto.setPontoOnibusId(2L);
		
		listaOnibus.add(ponto);
		
		PontoOnibusFactory pontoFac = new PontoOnibusFactory();
		pontoFac.saveList(listaOnibus);
		
	}
	
	private static void insertPontosOnibusTag(String fileName) {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			NodeList nodeList = doc.getElementsByTagName("tag");
			List<PontoOnibus> listaOnibus = new ArrayList<>();
			
			
			for (int i = 0; i < nodeList.getLength(); i++) {

				Node node = nodeList.item(i);
				NodeList childNodeList = node.getChildNodes();
				if(childNodeList.getLength() > 0) {
					PontoOnibus ponto = getPontoOnibus(node);
					if(ponto != null) {
						listaOnibus.add(ponto);
						System.out.println("added point " + ponto.getDescricao());
					}					
				}			
			}
			
			PontoOnibusFactory pontoFac = new PontoOnibusFactory();
			pontoFac.saveList(listaOnibus);
			
			
		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	private static void insertPontosOnibus(String fileName) {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			
			NodeList nodeList = doc.getElementsByTagName("node");
			List<PontoOnibus> listaOnibus = new ArrayList<>();
			
			
			for (int i = 0; i < nodeList.getLength(); i++) {

				Node node = nodeList.item(i);
				NodeList childNodeList = node.getChildNodes();
				if(childNodeList.getLength() > 0) {
					PontoOnibus ponto = getPontoOnibus(node);
					if(ponto != null) {
						listaOnibus.add(ponto);
						System.out.println("added point " + ponto.getDescricao());
					}					
				}			
			}
			
			PontoOnibusFactory pontoFac = new PontoOnibusFactory();
			pontoFac.saveList(listaOnibus);
			
			
		} catch (SAXException | IOException | ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	
	
	private static PontoOnibus getPontoOnibus(Node node) {
		
		if(node.getChildNodes().getLength() == 0) {
			return null;			
		}
		
		if (node.getNodeType() == Node.ELEMENT_NODE) {
			PontoOnibus ponto = new PontoOnibus();
			
			Element eElement = (Element) node;
			String id = eElement.getAttribute(TccConstants.OPEN_SM_NODE_ID);
			String lat = eElement.getAttribute(TccConstants.OPEN_SM_NODE_LAT);
			String lon = eElement.getAttribute(TccConstants.OPEN_SM_NODE_LON);			
			String name = null;
			Boolean isBusStop = false;
			
			if(notEmpty(id, lat, lon)) {
				NodeList childNodeList = node.getChildNodes();
				
				//for each node that has id and lat and lon, they may be children
				for (int i = 0; i < childNodeList.getLength(); i++) {
					Node childNode = childNodeList.item(i);
					
					
					if (childNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element childElement = (Element) childNode;				
						
						String k = childElement.getAttribute(TccConstants.OPEN_SM_TAG_K);
						String v = childElement.getAttribute(TccConstants.OPEN_SM_TAG_V);
						
												
						//if child is a busstop
						if(k != null && TccConstants.OPEN_SM_TAG_HIGHWAY.equals(k) && v != null && TccConstants.OPEN_SM_TAG_BUS_STOP.equals(v)){
							isBusStop = true;
						}
						
						//get name of bustop
						if(k != null && TccConstants.OPEN_SM_TAG_NAME.equals(k)){
							name = v;
							break;
						}
						
					}
			
				}			
				
				if(isBusStop) {
					ponto.setDescricao(name);
					
					try {
					ponto.setPontoOnibusId(Long.parseLong(id));
					ponto.setLatitude(Double.parseDouble(lat));
					ponto.setLongitude(Double.parseDouble(lon));
					
					} catch (NumberFormatException e) {
						System.out.println("id :" + id);
						System.out.println("lat :" + lat);
						System.out.println("lon :" + lon);
						return null;
					}
					return ponto;
				}	
				
			}
			
		}
		
		return null;
	}
	
	public static Boolean notEmpty(String id, String lat, String lon) {
		if(id != null && !"".equals(id) 
				&& lat != null && !"".equals(lat) 
				&& lon != null && !"".equals(lon)) {
			return true;
		} 
		return false;		
	}
	
}
