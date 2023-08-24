package br.com.elibras.apielibras.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.elibras.apielibras.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
}
