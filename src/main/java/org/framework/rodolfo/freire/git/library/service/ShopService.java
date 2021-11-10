package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.model.ShopCar;
import org.framework.rodolfo.freire.git.library.repository.ShopCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {

    final
    ShopCarRepository shopCarRepository;

    public ShopService(ShopCarRepository shopCarRepository) {

        this.shopCarRepository = shopCarRepository;
    }

    public ShopCar save(ShopCar shopCar){

        return shopCarRepository.save(shopCar);
    }

    public Optional<ShopCar> searchById(long id){

        return shopCarRepository.findById(id);
    }

    public List<ShopCar> listAll(){

        return shopCarRepository.findAll();
    }

    public ShopCar update(ShopCar shopCar){

        return shopCarRepository.save(shopCar);
    }

    public void delete(ShopCar shopCar){

        shopCarRepository.delete(shopCar);
    }
}
