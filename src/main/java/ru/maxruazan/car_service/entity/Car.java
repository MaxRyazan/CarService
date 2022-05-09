package ru.maxruazan.car_service.entity;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;

@Entity
@Table(name="car")
@Getter
@Setter
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @NotNull
    private String number;

    @NotNull
    private String  model;

    @NotNull
    private String owner;

    @Column(name="Orders")
    private String order;
}
