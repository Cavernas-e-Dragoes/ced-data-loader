package ced.dataloader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false)
    private String abilityScoreIncrease;

    @OneToMany
    private List<SubRace> subRace;

    public Race(String name, String abilityScoreIncrease, List<SubRace> subRace) {
        this.name = name;
        this.abilityScoreIncrease = abilityScoreIncrease;
        this.subRace = subRace;
    }

    public Race() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbilityScoreIncrease() {
        return abilityScoreIncrease;
    }

    public void setAbilityScoreIncrease(String abilityScoreIncrease) {
        this.abilityScoreIncrease = abilityScoreIncrease;
    }

    public List<SubRace> getSubRace() {
        return subRace;
    }

    public void setSubRace(List<SubRace> subRace) {
        this.subRace = subRace;
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
        Race other = (Race) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

}
