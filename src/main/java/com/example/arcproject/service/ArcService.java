package com.example.arcproject.service;

import com.example.arcproject.model.ARC;
import com.example.arcproject.repository.ArcRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArcService {
    private final ArcRepository repository;

    public ArcService(ArcRepository repository) {
        this.repository = repository;
    }

    public ARC findByName(String searchName) {
        return repository.findByName(searchName);
    }

    public List<ARC> getArcList() {
        return repository.getArcList();
    }

    public List<String> getWorkbenches() {
        return repository.getWorkbenches();
    }

    public ARC add(ARC arc) {
        return repository.add(arc);
    }

    public ARC deleteArc(String name) {
        return repository.deleteFromList(name);
    }


}
