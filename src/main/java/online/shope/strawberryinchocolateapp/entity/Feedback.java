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
public class Feedback extends BaseEntity{

    @Column(name = "positive_comment")
    private String positiveComment;

    @Column(name = "negative_comment")
    private String negativeComment;

    @ManyToOne()
    @JoinColumn(name = "product_id",
            foreignKey = @ForeignKey(name = "id")
    )
    private Product product;

    @ManyToOne()
    @JoinColumn(name = "user_id",
            foreignKey = @ForeignKey(name = "id")
    )
    private User user;

}
