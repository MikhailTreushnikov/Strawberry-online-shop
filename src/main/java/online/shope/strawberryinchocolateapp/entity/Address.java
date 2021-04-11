package online.shope.strawberryinchocolateapp.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "address")
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(name = "street")
    private String street;

    @Column(name = "house")
    private String house;

    @Column(name = "apartment")
    private String apartment;

    @Column(name = "intercom")
    private Boolean intercom;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id") //внешний ключ "user_id"
    private User user;
}
