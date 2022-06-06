package com.apiwipo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CadastroService {
	
	private	RestTemplate restTemplate;
	
	public String consumerWipo() {
		
		return restTemplate.getForObject("https://patentscope.wipo.int/search/pt/detail.jsf?docId=WO2002008676&redirectedID=true", String.class);
		

		
	}

}
