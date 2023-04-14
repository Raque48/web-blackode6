package com.zanjar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interfaces")
public class zController{
	
	@GetMapping("/home")
	public String index() {
		return"interfaces/index";
	}
	
	@GetMapping("/ingresar")
	public String formularioini() {
		return"interfaces/formularioini";
	}
	
	@GetMapping("/registrar")
	public String formularioregis() {
		return"interfaces/formularioregis";
	}
	
	@GetMapping("/perfil")
	public String perfilusuario() {
		return"interfaces/perfilusuario";
	}
	
	@GetMapping("/terminos")
	public String terminoslicencias() {
		return"interfaces/terminoslicencias";
	}
	
	
}


