package ced.dataloader.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Race {

    @EqualsAndHashCode.Include
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

    public Race(long id) {
        this.id = id;
    }
}
