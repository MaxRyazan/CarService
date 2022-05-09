package ru.maxruazan.car_service.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "services")
@Setter
@Getter
@NoArgsConstructor
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    private  String title;

    private int price;

    @Override
    public String toString() {
        return  "SERVICE: " + title + "\n" + "PRICE: " + price;

    }
}
