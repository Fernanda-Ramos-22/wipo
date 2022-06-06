package com.apiwipo;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apiwipo.model.Cadastro;

@SpringBootApplication
public class WipoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(WipoApplication.class, args);
		
		String url = "https://patentscope.wipo.int/search/pt/detail.jsf?docId=WO2002008676&redirectedID=true";
		//System.out.println(String.format("conectando: %s", url));
		
		//conectar o Jsoup na url
		
		Document doc = Jsoup.connect(url).get();
		
		//tentar pegar o número da publicação pelo class
		Element numpub = doc.getElementsByClass("ps-field--value ps-biblio-field--value").get(0);
		//System.out.println(numpub);

		//converte o elemento para string
		String objnumpub = numpub.toString();
		//System.out.println(objnumpub);
		
		//pegar parte da string
		String newobjnumpub = objnumpub.substring(118, 132);
		System.out.println(newobjnumpub);
		
		//pegar a data de publicação
		Element dtpub = doc.getElementsByClass("ps-field--value ps-biblio-field--value").get(1);
		//System.out.println(dtpub);
		String objdtpub = dtpub.toString();
		String newobjdtpub = objdtpub.substring(53, 63);
		System.out.println(newobjdtpub);
		
		Element pedido = doc.getElementsByClass("ps-field--value ps-biblio-field--value").get(2);
		//System.out.println(pedido);
		String objpedido = pedido.toString();
		String newobjpedido = objpedido.substring(53, 70);
		System.out.println(newobjpedido);
		
		Element requerentes = doc.getElementsByClass("biblio-person-list--name").first();
		//System.out.println(requerentes);
		String objrequerentes = requerentes.toString();
		String newobjrequerentes = objrequerentes.substring(39, 76);
		System.out.println(newobjrequerentes);
		
		//Element titulo = doc.getElementsByClass("needTranslation-biblio").first();
		//System.out.println(titulo);
		
		Element titulode = doc.getElementsByClass("PCTtitle").first();
		//System.out.println(titulo);
		Element newtitulode = titulode.getElementsByClass("notranslate").get(1);
		//System.out.println(newtitulode);
		String objtitulode = newtitulode.toString();
		String newobjtitulode = objtitulode.substring(26, 35);
		System.out.println(newobjtitulode);
		
		//Element tituloen = doc.getElementsByClass("needTranslation-biblio").first();
		//System.out.println(tituloen);
		//String objtituloen = tituloen.toString();
		//String newobjtituloen = objtituloen.substring(37, 57);
		//System.out.println(newobjtituloen);
		
		//Element titulofr = titulode.getElementsByClass("notranslate").get(4);
		//System.out.println(titulofr);
		//String objtitulofr = titulofr.toString();
		//String newobjtitulofr = objtitulofr.substring(26, 46);
		//System.out.println(newobjtitulofr);
		
		
		 //"{\"titulo\":"+newobjtitulode +"," + "\"dtpub\":"+newobjdtpub +"}"
		 
		 
	    //Converter String to Json
	        try {
	            String str = "{\"titulo\":"+newobjtitulode +"," + "\"dtpub\":"+newobjdtpub + "," + "\"numpub\":"+newobjnumpub+"}";
	            
	            JSONObject jsonObject = new JSONObject(str);
	            System.out.println("OBJECT : "+jsonObject.toString());
	        } catch (JSONException err) {
	            System.out.println("Exception : "+err.toString());
	        	}
	}
	
	

}
