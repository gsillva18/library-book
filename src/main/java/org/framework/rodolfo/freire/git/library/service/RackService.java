package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.Rack;
import org.framework.rodolfo.freire.git.library.repository.RackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RackService {

    final
    RackRepository rackRepository;

    public RackService(RackRepository rackRepository) {

        this.rackRepository = rackRepository;
    }

    public Rack save(Rack rack){

        return rackRepository.save(rack);
    }

    public Optional<Rack> searchByNumberRack(int number){

        return rackRepository.findByNumberRack(number);
    }

    public List<Rack> listAll(){

        return rackRepository.findAll();
    }

    public Rack update(Rack rack){

        return rackRepository.save(rack);
    }

    public void delete(Rack rack){

        rackRepository.delete(rack);
    }
}
