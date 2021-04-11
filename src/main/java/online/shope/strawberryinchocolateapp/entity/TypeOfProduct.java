package online.shope.strawberryinchocolateapp.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "type_of_product")
public class TypeOfProduct extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int typeId;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "type", //mappedBy - указывает на поле type класса Product
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY)
    private List<Product> products;
}
