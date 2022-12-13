package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {

		@GetMapping({"/index", "/", "", "/home"})
		public String index(Model model) {
			model.addAttribute("titulo", "hola Spring Framework con Model!");
			return "index";
		}
		
		@RequestMapping("/perfil")
		public String perfil(Model model) {
			Usuario usuario = new Usuario();
			usuario.setNombre("Álvaro");
			usuario.setApellido("García");
			model.addAttribute("usuario", usuario);
			model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
			return "perfil";
		}
}
