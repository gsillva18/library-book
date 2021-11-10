package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TB_SHOPCAR")
public class ShopCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHOP_CAR_ID")
    private long shopCarId;

    @Column(name = "SHOP_CAR_CODE")
    private long shopCarCode;

    @Column(name = "SHOP_CAR_DATE")
    private Date shopCarDate;

    @Column(name = "SHOP_CAR_TYPE")
    @Enumerated(EnumType.STRING)
    private TypeOperation shopCarType;

    @OneToOne
    @JoinColumn(name = "CUSTOMER_ID_FK")
    private Customer saleCustomer;

    @OneToOne
    @JoinColumn(name = "EMPLOYEE_ID_FK")
    private Employee saleEmployee;

    @OneToMany
    @JoinColumn(name = "SHOPCAR_FK")
    private List<ShopCarDetail> saleDetailList;

    @Column(name = "SALE_STATUS")
    private boolean saleStatus;
}
