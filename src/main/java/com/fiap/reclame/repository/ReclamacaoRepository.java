package com.fiap.reclame.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.fiap.reclame.model.Reclamacao;

@EnableMongoRepositories
public interface ReclamacaoRepository extends MongoRepository<Reclamacao, Long> {

}
