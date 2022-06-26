package ced.dataloader.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Spell {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 40)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private Integer level;

    @Column(nullable = false)
    private String school;

    @Column(nullable = false)
    private Integer castingTime;

    @Column(nullable = false)
    private Integer range;

    @Column(nullable = false)
    private String components;

    @Column(nullable = false)
    private String duration;

    @Column(nullable = false)
    private boolean verbal;

    @Column(nullable = false)
    private boolean somatic;

    @Column(nullable = false)
    private boolean material;

    @Column(nullable = false)
    private String source;

    public Spell(String name, String description, Integer level, String school, Integer castingTime, Integer range, String components, String duration, boolean verbal, boolean somatic, boolean material, String source) {
        this.name = name;
        this.description = description;
        this.level = level;
        this.school = school;
        this.castingTime = castingTime;
        this.range = range;
        this.components = components;
        this.duration = duration;
        this.verbal = verbal;
        this.somatic = somatic;
        this.material = material;
        this.source = source;
    }
    public Spell(){

    }
}
