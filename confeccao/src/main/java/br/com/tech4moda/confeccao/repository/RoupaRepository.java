package br.com.tech4moda.confeccao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tech4moda.confeccao.model.Roupa;

public interface RoupaRepository extends MongoRepository<Roupa, String> {
  
}
