package online.shope.strawberryinchocolateapp.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "order")
public class Order extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "total_sum")
    private BigDecimal totalSum;

    @JoinTable()
    @OneToMany(//при использовании @JoinTable не требуется mappedBy = "productId"
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<Product> products;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

//    @OneToMany
//    private List<Product> productList = new ArrayList<>();



/*
    hibernate ddl autohibernate.hbm2ddl.auto автоматически проверяет
    и экспортирует DDL в схему при создании sessionFactory.

    //hibernate update in application property

 */
}
