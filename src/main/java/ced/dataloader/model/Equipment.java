package ced.dataloader.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Equipment {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer ac;

    @Column(nullable = false)
    private Integer strength;

    @Column(nullable = false)
    private Boolean stealth;

    @Column(nullable = false)
    private Double Weight;

    @Column(nullable = false)
    private String damage;

    @Column(nullable = false)
    private String properties;

    @Column(nullable = false)
    private String description;

    public Equipment(String name, String type, Double price, Integer ac, Integer strength,
                     Boolean stealth, Double Weight, String damage, String properties, String description){
        this.name = name;
        this.type = type;
        this.ac = ac;
        this.price = price;
        this.strength = strength;
        this.stealth = stealth;
        this.Weight = Weight;
        this.damage = damage;
        this.properties = properties;
        this.description = description;
    }

    public Equipment() {

    }
}