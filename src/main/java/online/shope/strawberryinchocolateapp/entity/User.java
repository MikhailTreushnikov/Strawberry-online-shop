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
@Table(name = "user")
public class User extends BaseEntity {

    /*//уже в базовом классе
        @Id
        @Column(name = "user_id")
        @GeneratedValue(Strategy = GenerationType.IDENTITY)
        private int userId;
    */
    public User(String firstName,
                String lastName,
                String email,
                String phone,
                String password,
                List<Feedback> feedbacks,
                Address address,
                HistoryOrder historyOrder,
                Order order) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.feedbacks = feedbacks;
        this.address = address;
        this.historyOrder = historyOrder;
        this.order = order;
    }

    public User() { //пустой конструктор для entity
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "password")
    private String password;

    //users-feedbacks
    @OneToMany(mappedBy = "user", //mappedBy - указывает на поле user класса Feedback
            cascade = CascadeType.ALL, //CascadeType.ALL - необходимо выполнять каскадно сразу все операции PERSIST, MERGE и REMOVE и др.
            orphanRemoval = true, //атрибут orphanRemoval. удалим юзера из БД — удалим все связанные с ним feedbacks
            fetch = FetchType.LAZY) //LAZY - загр из БД при необхо. EAGER - загр из БД вместе с user (немедленноо)
    private List<Feedback> feedbacks;

    @OneToOne(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private Address address;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "history_order_id")
    private HistoryOrder historyOrder;

    @OneToOne(
            mappedBy = "user",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private Order order;

}
