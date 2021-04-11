package online.shope.strawberryinchocolateapp.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "history_order")

public class HistoryOrder extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int historyOrderId;

//    @Column(name = "product_id")
//    private Product productId;

    @Column(name = "total_sum")
    private BigDecimal totalSum;

    @OneToMany(mappedBy = "historyOrder",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<User> users;

}
