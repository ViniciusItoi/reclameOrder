package com.fiap.reclame.service;

import java.util.List;

import com.fiap.reclame.model.Reclamacao;

public interface ReclamacaoService {

	public List<Reclamacao> obterReclamacoes();

	public Reclamacao obterReclamacao(Long idReclamacao);

}
