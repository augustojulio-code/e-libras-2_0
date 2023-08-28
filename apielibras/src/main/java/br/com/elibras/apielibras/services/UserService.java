package br.com.elibras.apielibras.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.elibras.apielibras.domain.User;
import br.com.elibras.apielibras.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {

        return repository.findAll();
    }

    public User findById(String id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow();
    }

    public User insert(User obj) {
        return repository.insert(obj);
    }

    public void deleteById(String id) {
        findById(id);
        repository.deleteById(id);

    }
}
