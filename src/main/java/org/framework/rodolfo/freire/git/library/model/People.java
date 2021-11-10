package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;

@Slf4j
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TB_PEOPLE")
@Inheritance(strategy = InheritanceType.JOINED)
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private long peopleId;

    @Column(name = "EMPLOYEE_CODE")
    private long peopleCode;

    @Column(name = "CUSTOMER_TYPE")
    private String customerType;

    @Column(name = "EMPLOYEE_ID_NATIONAL")
    private String employeeIdNational;

    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    @Column(name = "CUSTOMER_GENDER")
    private String customerGender;

    @Column(name = "EMPLOYEE_BIRTHADAY")
    private Date employeeBirthday;

    @Column(name = "EMPLOYEE_RELATION_SHIP_DATE")
    private Date employeeRelationshipDate;

    @OneToOne
    @JoinColumn(name = "ADDRESS_ID_FK")
    private Address employeeAddress;

    @OneToOne
    @JoinColumn(name = "PHONE_ID_FK")
    private Phone employeePhone;

    @Column(name = "EMPLOYEE_EMAIL")
    private String employeeEmail;


    @Column(name = "CUSTOMER_STATUS")
    private boolean customerStatus;



}
