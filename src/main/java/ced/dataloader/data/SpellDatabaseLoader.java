package ced.dataloader.data;

import ced.dataloader.model.Spell;
import ced.dataloader.repository.SpellRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SpellDatabaseLoader implements ApplicationRunner {

    private final SpellRepository spellRepository;

    public List<Spell> spellList = new ArrayList<>();

    @Autowired
    public SpellDatabaseLoader(SpellRepository spellRepository) {
        this.spellRepository = spellRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        spellList.addAll(Arrays.asList(
                new Spell("Absorb Elements",
                        "The spell captures some of the incoming energy,lessening its effect on you and storing it for your next melee attack. You have resistance to the triggering damage type until the start of your next turn. Also, the first time you hit with a melee attack on your next turn, the target takes an extra 1d6 damage of the triggering type, and the spell ends.",
                        1,
                        "abjuration",
                        6,
                        0,
                        "",
                        "1 round",
                        false, true, false,
                        "Xanathar´s Guide to Everything")
        ));
        spellRepository.saveAll(spellList);
    }
}
