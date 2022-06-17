package ced.dataloader.repository;

import ced.dataloader.model.Spell;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpellRepository extends JpaRepository<Spell, Long>{
}
