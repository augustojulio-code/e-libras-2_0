package br.com.elibras.apielibras.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.elibras.apielibras.domain.Score;
import br.com.elibras.apielibras.repository.ScoreRepository;

@Service
public class ScoreService {
    @Autowired
    private ScoreRepository repository;

    public List<Score> findAll() {

        return repository.findAll();
    }

    public Score findById(String id) {
        Optional<Score> obj = repository.findById(id);

        return obj.orElseThrow();
    }

    public Score insert(Score obj) {

        return repository.insert(obj);
    }

    public void deleteById(String id) {
        findById(id);

        repository.deleteById(id);
    }
}
