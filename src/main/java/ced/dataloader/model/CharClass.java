package ced.dataloader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CharClass {

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHitDice() {
        return hitDice;
    }

    public void setHitDice(Integer hitDice) {
        this.hitDice = hitDice;
    }

    public String getPrimaryAbility() {
        return primaryAbility;
    }

    public void setPrimaryAbility(String primaryAbility) {
        this.primaryAbility = primaryAbility;
    }

    public String getSavingProficiencies() {
        return savingProficiencies;
    }

    public void setSavingProficiencies(String savingProficiencies) {
        this.savingProficiencies = savingProficiencies;
    }

    public String getArmorWeaponProficiencies() {
        return armorWeaponProficiencies;
    }

    public void setArmorWeaponProficiencies(String armorWeaponProficiencies) {
        this.armorWeaponProficiencies = armorWeaponProficiencies;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CharClass other = (CharClass) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
