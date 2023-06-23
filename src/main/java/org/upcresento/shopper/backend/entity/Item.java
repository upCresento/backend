package org.upcresento.shopper.backend.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(schema = "shopper", name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동증가
    private int id;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 100, nullable = false)
    private String imgPath;

    @Column
    private int price;

    @Column
    private int discountPer;
}
