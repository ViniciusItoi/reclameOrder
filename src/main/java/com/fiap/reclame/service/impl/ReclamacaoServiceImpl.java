package com.fiap.reclame.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.reclame.model.Reclamacao;
import com.fiap.reclame.repository.ReclamacaoRepository;
import com.fiap.reclame.service.ReclamacaoService;

@Service
public class ReclamacaoServiceImpl implements ReclamacaoService{

	@Autowired 
	ReclamacaoRepository reclamacaoRepository;
	
	@Override
	public List<Reclamacao> obterReclamacoes() {
		return reclamacaoRepository.findAll();
	}

	@Override
	public Reclamacao obterReclamacao(Long idReclamacao) {
		return reclamacaoRepository.findById(idReclamacao).orElseThrow(() -> new IllegalArgumentException("Reclamação não existe!"));

	}

}
