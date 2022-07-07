package com.fiap.reclame.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.reclame.model.Reclamacao;
import com.fiap.reclame.service.ReclamacaoService;

@RestController
@RequestMapping("/reclamacoes")
public class ReclamacaoController {

	@Autowired
	private ReclamacaoService reclamacaoService;
	
	@GetMapping
	public List<Reclamacao> obterReclamacoes(){
		return this.reclamacaoService.obterReclamacoes();
	}
	@GetMapping("/{idReclamacao}")
	public Reclamacao obterReclamacao(@PathVariable("idReclamacao") Long idReclamacao){
		return this.reclamacaoService.obterReclamacao(idReclamacao);
	}
}
