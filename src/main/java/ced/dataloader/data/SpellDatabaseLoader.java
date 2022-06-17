package ced.dataloader.data;

import ced.dataloader.model.Spell;
import ced.dataloader.repository.SpellRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import java.util.ArrayList;
import java.util.List;

public class SpellDatabaseLoader implements ApplicationRunner {

    private final SpellRepository spellRepository;

    public SpellDatabaseLoader(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    public List<Spell> spellList = new ArrayList<>();


    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
