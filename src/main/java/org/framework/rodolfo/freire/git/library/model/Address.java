package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TB_ADRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDRESS_ID")
    private long addressId;

    @Column(name = "ADDRESS_TYPE")
    private String addressType;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "STREET_LINE1")
    private String streetLine1;

    @Column(name = "STREET_LINE2")
    private String streetLine2;

    @Column(name = "STREET_LINE3")
    private String streetLine3;

    @Column(name = "STREET_LINE4")
    private String streetLine4;

    @Column(name = "CITY")
    private String city;

    @Column(name = "STATE")
    private String state;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "ADDRESS_PREFERRED")
    private boolean addressPreferred;

    @Column(name = "PHONE_STATUS")
    private boolean PhoneStatus;

}
