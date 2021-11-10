package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "peopleId")
public class Employee extends People{

    @Column(name = "EMPLOYEE_DEPARTAMENT")
    @Enumerated(EnumType.STRING)
    private Department employeeDepartment;

    @Column(name = "EMPLOYEE_OCCUPATION")
    private String employeeOccupation;

    @Column(name = "EMPLOYEE_INCOME")
    private BigDecimal employeeIncome;

    @Column(name = "EMPLOYEE_PASSWORD")
    private String employeePassword;

    @Column(name = "EMPLOYEE_ACCESS_LEVELS")
    private String employeeAccessLevels;


}
