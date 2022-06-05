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
public class CharClass {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer hitDice;

    @Column(nullable = false)
    private String primaryAbility;

    @Column(nullable = false)
    private String savingProficiencies;

    @Column(nullable = false)
    private String armorWeaponProficiencies;

    public CharClass(String name, String description, Integer hitDice, String primaryAbility, String savingProficiencies, String armorWeaponProficiencies) {
        this.name = name;
        this.description = description;
        this.hitDice = hitDice;
        this.primaryAbility = primaryAbility;
        this.savingProficiencies = savingProficiencies;
        this.armorWeaponProficiencies = armorWeaponProficiencies;
    }

    public CharClass() {

    }

    public CharClass(long id) {
        this.id = id;
    }
}
