package online.shope.strawberryinchocolateapp.entity;

import javax.persistence.*;

@Entity
@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //см стратегия генерации id
    protected int id;

    //1) после создания модели данных требуется:
/*
    hibernate ddl autohibernate.hbm2ddl.auto автоматически проверяет
    и экспортирует DDL в схему при создании sessionFactory.
    hibernate update in application property
 */

    //2) создать утилитарный класс HibernateSessionFactoryUtil.
    // класс создает фабрику сессий для работы с БД
    // см паттрен фабрика
    //В этом классе мы будем создаем новый объект конфигураций Configuration,
    // и передавать ему те классы, которые он должен воспринимать как сущности — User, Product и тд.

    //3) в классе HibernateSessionFactoryUtil метод configuration.getProperties()
    //необходимо прописать пропертис - параметры для работы hibernate
    //в нем параметры соединения с БД. URL, username, password

    //4) создать DAO класс - доступ к данным
}
