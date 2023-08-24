package br.com.elibras.apielibras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.elibras.apielibras.domain.Score;

public interface ScoreRepository extends MongoRepository<Score, String> {

}
