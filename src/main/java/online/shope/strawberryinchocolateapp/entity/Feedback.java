package online.shope.strawberryinchocolateapp.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@EqualsAndHashCode(callSuper = true)
@Table(name = "feedback")
public class Feedback extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedackId;

    @Column(name = "positive_comment") //отличается от диаграммы
    private String positiveComment;

    @Column(name = "negative_comment") //отличается от диаграммы
    private String negativeComment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id") //внешний ключ "user_id"
    private User user;

    @ManyToOne()
    @JoinColumn(name = "product_id",
            foreignKey = @ForeignKey(name = "id")
    )
    private Product product;
//это переписал
//    @ManyToOne()
//    @JoinColumn(name = "user_id",
//            foreignKey = @ForeignKey(name = "id")
//    )
//    private User user;

}
