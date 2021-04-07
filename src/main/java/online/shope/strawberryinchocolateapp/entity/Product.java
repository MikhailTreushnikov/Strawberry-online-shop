package online.shope.strawberryinchocolateapp.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Product extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name="description")
    private String description;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "sale_mark")
    private Boolean saleMark;

    @ManyToOne()
    @JoinColumn(name = "type_id",
            foreignKey = @ForeignKey(name = "id")
    )
    private TypeOfProduct typeId;

    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;

    @PreUpdate
    @PrePersist
    private void preUpdate(){

    }
}
