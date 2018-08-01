package br.edu.ufabc.SistemaBancarioMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.edu.ufabc.SistemaBancarioMVC.model.dao.ContaCorrenteDAO;
import br.edu.ufabc.SistemaBancarioMVC.model.entity.ContaCorrente;

@Controller
public class SistemaBancarioController {

	@Autowired // devo associarcom o local onde chamo repository
	ContaCorrenteDAO cc;
	
	
	
	// metodo padrao eh usando GET
	@RequestMapping("/teste")
	public String execute() {
		System.out.println("Teste com Spring MVC");
		return "";
	}
	
	@RequestMapping("/insere")
	public String insere() {
		ContaCorrente ccTeste = new ContaCorrente();
		ccTeste.setAgencia("agencia");
		ccTeste.setDescricao("descricao");
		ccTeste.setAtiva(false);
		ccTeste.setNumero("1");

		cc.save(ccTeste);
		
		System.out.println("Inseri a conta corrente no BD");
		return "";
	}
}
