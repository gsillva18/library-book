package org.framework.rodolfo.freire.git.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "TB_SHOP_CAR_DETAIL")
public class ShopCarDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SHOP_CAR_DETAIL_ID")
    private long shopCarDetailId;

    @Column(name = "SHOP_CAR_DETAIL_CODE")
    private long shopCarDetailCode;

    @Column(name = "SHOP_CAR_DETAIL_DATE")
    private Date shopCarDetailDate;

    @Column(name = "SHOP_CAR_TYPE")
    @Enumerated(EnumType.STRING)
    private TypeOperation shopCarType;

//    ShopCar já mantém referência para as duas entidades a baixo
//    @OneToOne
//    @JoinColumn(name = "CUSTOMER_ID_FK")
//    private Customer shopCarCustomer;
//
//    @OneToOne
//    @JoinColumn(name = "EMPLOYEE_ID_FK")
//    private Employee shopCarEmployee;

//    Essa parte não faz sentido, já que seriam detalhes da compra dentro de outros detalhes
//    @ManyToMany
//    @JoinColumn(name = "SHOP_CAR_DETAIL_INTERN")
//    private List<ShopCarDetail> shopCarDetailList;

    @Column(name = "SHOP_CAR_STATUS")
    private boolean shopCarStatus;

}
