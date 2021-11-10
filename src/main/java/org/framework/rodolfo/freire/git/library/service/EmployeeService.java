package org.framework.rodolfo.freire.git.library.service;

import org.framework.rodolfo.freire.git.library.component.SearchAddress;
import org.framework.rodolfo.freire.git.library.model.Employee;
import org.framework.rodolfo.freire.git.library.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    final
    EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee){

        return employeeRepository.save(employee);
    }

    public Optional<Employee> searchById(long id){

        return employeeRepository.findById(id);
    }

    public List<Employee> listAll(){

        return employeeRepository.findAll();
    }

    public Employee update(Employee employee){

        return employeeRepository.save(employee);
    }

    public void delete(Employee employee){

        employeeRepository.delete(employee);
    }
}
