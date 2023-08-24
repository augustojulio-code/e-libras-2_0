package br.com.elibras.apielibras.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.elibras.apielibras.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

}
