package ced.dataloader.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Magic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
