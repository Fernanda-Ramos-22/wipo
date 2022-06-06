package com.apiwipo.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apiwipo.service.CadastroService;


@RestController
@RequestMapping
public class CadastroController {
	
	@Autowired		
	private CadastroService cadastroService;
	
	@GetMapping("/cadastro")
	public void telaCadastro(HttpServletResponse response) throws IOException {
		
		response.sendRedirect("cadastro.html");
		
	}
	
	@GetMapping("/")
	public String obterHtml() {
		
		return cadastroService.consumerWipo();
	}
	
	public void test() {
		
		
	}
}
