package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.component.RegistryCustomer;
import org.framework.rodolfo.freire.git.library.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    final
    RegistryCustomer registryCustomer;

    public CustomerController(RegistryCustomer registryCustomer) {
        this.registryCustomer = registryCustomer;
    }
}
