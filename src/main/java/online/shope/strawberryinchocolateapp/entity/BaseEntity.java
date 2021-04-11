package online.shope.strawberryinchocolateapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //см стратегия генерации id
    protected int id;

    public BaseEntity() {
    }

    public BaseEntity(int id) {
        this.id = id;
    }
}
