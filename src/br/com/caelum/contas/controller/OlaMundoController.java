/**
 * 
 */
package br.com.caelum.contas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author EduMelo
 *
 */
@Controller
public class OlaMundoController {

	@RequestMapping("/olaMundoSpring")
	public String execute() {
		System.out.println("Olá mundo impresso");
		return "ok";
	}
	
}
