package online.shope.strawberryinchocolateapp.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "sale_mark")
    private Boolean saleMark;
//это переписал
//    @ManyToOne()
//    @JoinColumn(name = "type_id",
//            foreignKey = @ForeignKey(name = "id")
//    )
//    private TypeOfProduct typeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id") //внешний ключ "type_id"
    private TypeOfProduct type;

//    @OneToOne
//    @JoinColumn(name = "image_id")
//    private Image image;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "image_id")
    private Image image;

    @PreUpdate
    @PrePersist
    private void preUpdate() {

    }
}
