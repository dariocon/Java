package feria2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import feria2.xml.LectorXML;

public class Feria {
    List<Caseta> casetas = new ArrayList<>();
    
	public Feria(String path) {
		super();
		casetas = new ArrayList<>();
        LectorXML lector = new LectorXML();
        casetas = lector.cargarDocumentoXMLCasetas(path);	
    }

	public void eliminarCaseta(String calle, int numero) throws Exception {
	    boolean casetaEliminada = false;
	    int modulosEliminados = 0;
	    Iterator<Caseta> iterator = casetas.iterator();
	    while (iterator.hasNext()) {
	        Caseta caseta = iterator.next();
	        if (caseta.getCalle().equals(calle) && caseta.getNumero()==(numero)) {
	            casetaEliminada = true;
	            modulosEliminados = caseta.getModulos();
	            iterator.remove();
	        } else if (casetaEliminada) {
	            caseta.restarModulos(modulosEliminados);
	        }
	    }
	    if (!casetaEliminada) {
	        System.out.println("No existe la caseta en la calle " + calle + " con número " + numero);
	    }
	}
	public String mostrarCasetasEnCalle(String calle) {
	    StringBuilder numerosCasetas = new StringBuilder();
	    for (Caseta caseta : casetas) {
	        if (caseta.getCalle().equals(calle)) {
	            numerosCasetas.append(caseta).append(System.lineSeparator());
	        }
	    }
	    if (numerosCasetas.length() == 0) {
	    	numerosCasetas.append("No hay casetas en la calle " + calle);
	    }
	    return numerosCasetas.toString();
	}
	public String mostrarCasetasFamiliares() {
	    StringBuilder casetasFamiliares = new StringBuilder();
	    for (Caseta caseta : casetas) {
	        if (caseta.getTipo().equals(Tipo.FAMILIAR)) {
	        	casetasFamiliares.append(caseta).append(System.lineSeparator());;
	        }
	    }
	    if (casetasFamiliares.length() == 0) {
	    	casetasFamiliares.append("No hay casetas familiares.");
	    }
	    return casetasFamiliares.toString();
	}
	public String mostrarCasetasDistrito() {
	    StringBuilder casetasDistrito = new StringBuilder();
	    for (Caseta caseta : casetas) {
	        if (caseta.getTipo().equals(Tipo.DISTRITO)) {
	        	casetasDistrito.append(caseta).append(System.lineSeparator());;
	        }
	    }
	    if (casetasDistrito.length() == 0) {
	    	casetasDistrito.append("No hay casetas de distrito.");
	    }
	    return casetasDistrito.toString();
	}
	public String mostrarCasetasNoFNoD() {
	    StringBuilder casetasNoFNoD = new StringBuilder();
	    for (Caseta caseta : casetas) {
	        if (caseta.getTipo().equals(Tipo.DISTRITO) && caseta.getTipo().equals(Tipo.FAMILIAR)) {
	        	casetasNoFNoD.append(caseta).append(System.lineSeparator());
	        }
	    }
	    if (casetasNoFNoD.length() == 0) {
	    	casetasNoFNoD.append("No hay casetas que no sean ni de distrito ni familiares.");
	    }
	    return casetasNoFNoD.toString();
	}
	
	public String mostrarCasetasFamiliaresPorCalle() {
		Map<String, Integer> casetasFamiliaresPorCalle = new HashMap<>();
	    for (Caseta caseta : casetas) {
	        if (caseta.getTipo().equals(Tipo.FAMILIAR)) {
	            String calle = caseta.getCalle();
	            casetasFamiliaresPorCalle.put(calle, +1);
	        }
	    }
	    return casetasFamiliaresPorCalle.toString();
	}
	public String mostrarCasetasDistritoPorCalle() {
		Map<String, Integer> casetasDistritoPorCalle = new HashMap<>();
	    for (Caseta caseta : casetas) {
	        if (caseta.getTipo().equals(Tipo.DISTRITO)) {
	            String calle = caseta.getCalle();
	            casetasDistritoPorCalle.put(calle, +1);
	        }
	    }
	    return casetasDistritoPorCalle.toString();
	}
	public void generarJson() throws IOException {
		File archivoJson = new File("files/casetas.json");
		archivoJson.createNewFile();
		Gson gson = new Gson();
		String datos = gson.toJson(this.casetas);
		FileWriter fw = new FileWriter(archivoJson);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.append(datos);
		bw.close();
		fw.close();
	}

}

