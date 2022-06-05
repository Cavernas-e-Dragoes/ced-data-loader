package ced.dataloader.repository;

import ced.dataloader.model.CharacterSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CharactersRepository extends JpaRepository<CharacterSheet, Long> {
     List<CharacterSheet> findAllByLogin(@Param("login") String login);
     Optional<CharacterSheet> findByName(String name);

}
