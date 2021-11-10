package org.framework.rodolfo.freire.git.library.controller;

import org.framework.rodolfo.freire.git.library.component.RegistryEmployee;
import org.framework.rodolfo.freire.git.library.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    final
    RegistryEmployee registryEmployee;

    public EmployeeController(RegistryEmployee registryEmployee) {
        this.registryEmployee = registryEmployee;
    }
}
