package ced.dataloader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Equipment {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAc() {
        return ac;
    }

    public void setAc(Integer ac) {
        this.ac = ac;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Boolean getStealth() {
        return stealth;
    }

    public void setStealth(Boolean stealth) {
        this.stealth = stealth;
    }

    public Double getWeight() {
        return Weight;
    }

    public void setWeight(Double weight) {
        this.Weight = weight;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}