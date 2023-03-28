package br.com.tech4moda.producoes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4moda.producoes.model.Producao;

public interface ProducaoRepository extends MongoRepository<Producao,String>{
    
}
