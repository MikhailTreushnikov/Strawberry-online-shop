package online.shope.strawberryinchocolateapp.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "images")
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
public class Image extends BaseEntity{

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;
}
