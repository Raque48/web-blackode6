package com.zanjar.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class zController{
	
	@RequestMapping("/index")
	public String index() {
		return"interfaces/index";
	}
	
	@RequestMapping("/formularioini")
	public String formularioini() {
		return"interfaces/formularioini";
	}
	
	@RequestMapping("/formularioregis")
	public String formularioregis() {
		return"interfaces/formularioregis";
	}
	
	@RequestMapping("/perfilusuario")
	public String perfilusuario() {
		return"interfaces/perfilusuario";
	}
	
	@RequestMapping("/terminoslicencias")
	public String terminoslicencias() {
		return"interfaces/terminoslicencias";
	}
	
	
}


