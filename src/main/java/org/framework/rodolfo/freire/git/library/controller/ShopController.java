package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.component.ShopRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {

    final
    ShopRules shopRules;

    public ShopController(ShopRules shopRules) {
        this.shopRules = shopRules;
    }
}
