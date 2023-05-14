package feria2.xml;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import feria2.Caseta;
import feria2.Tipo;





public class LectorXML {
	
	public List<Caseta> cargarDocumentoXMLCasetas(String path) {

	    List<Caseta> casetas = new ArrayList<>();

	    try {
	        File file = new File(path);

	        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	        DocumentBuilder builder = dbf.newDocumentBuilder();

	        Document document = builder.parse(file);
	        document.getDocumentElement().normalize();

	        NodeList listaNodosCasetas = document.getElementsByTagName("casetas");

	        for (int i = 0; i < listaNodosCasetas.getLength(); i++) {
	            Element e = (Element) listaNodosCasetas.item(i);

	            String calle = e.getElementsByTagName("calle").item(0).getTextContent();
	            String idCalle = e.getElementsByTagName("idCalle").item(0).getTextContent();
	            String id = e.getElementsByTagName("id").item(0).getTextContent();
	            int numero = Integer.parseInt(e.getElementsByTagName("numero").item(0).getTextContent());
	            String nombre = e.getElementsByTagName("nombre").item(0).getTextContent();
	            int modulos = Integer.parseInt(e.getElementsByTagName("modulos").item(0).getTextContent());
	            String tipoStr = e.getElementsByTagName("tipo").item(0).getTextContent();

	            Tipo tipo;
	            switch (tipoStr) {
	            	case "FAMILIAR":
	            		tipo = Tipo.FAMILIAR;
	                case "DISTRITO":
	                    tipo = Tipo.DISTRITO;
                    default:
	                    tipo = Tipo.OTRO;
	                    break;
	                }

	             Caseta caseta = new Caseta(calle, tipo, numero, nombre, modulos, idCalle, id);
	             casetas.add(caseta);
	            }
	        
	    } catch (ParserConfigurationException | SAXException | IOException e) {
	        e.printStackTrace();
	    }

	    return casetas;
	}

}
