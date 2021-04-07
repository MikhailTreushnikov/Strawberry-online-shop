package online.shope.strawberryinchocolateapp.entity;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "type_of_product")
public class TypeOfProduct extends BaseEntity{

    @Column(name = "type")
    private String type;

}
