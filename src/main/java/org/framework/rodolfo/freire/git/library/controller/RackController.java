package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.component.RegistryRack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rack")
public class RackController {

    final
    RegistryRack registryRack;

    public RackController(RegistryRack registryRack) {
        this.registryRack = registryRack;
    }
}
