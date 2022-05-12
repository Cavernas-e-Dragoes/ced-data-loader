package ced.dataloader.data;

import ced.dataloader.model.Race;
import ced.dataloader.model.SubRace;
import ced.dataloader.repository.RaceRepository;
import ced.dataloader.repository.SubRaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static ced.dataloader.constants.AttBR.CARISMA;
import static ced.dataloader.constants.AttBR.CONSTITUICAO;
import static ced.dataloader.constants.AttBR.DESTREZA;
import static ced.dataloader.constants.AttBR.FORCA;
import static ced.dataloader.constants.AttBR.INTELIGENCIA;
import static ced.dataloader.constants.AttBR.SABEDORIA;
import static java.util.Arrays.asList;

@Component
public class RaceDatabaseLoader implements ApplicationRunner {

    private final RaceRepository raceRepository;

    private final SubRaceRepository subRaceRepository;

    @Autowired
    public RaceDatabaseLoader(RaceRepository raceRepository, SubRaceRepository subRaceRepository) {
        this.raceRepository = raceRepository;
        this.subRaceRepository = subRaceRepository;
    }

    public List<Race> raceList = new ArrayList<>();


    @Override
    public void run(ApplicationArguments args) throws Exception {

        SubRace anaoDaColina = new SubRace("Anão da Colina", SABEDORIA + " + 1");
        SubRace anaoDaMontanha = new SubRace("Anão da Montanha", FORCA + " + 2");
        SubRace altoElfo = new SubRace("Alto Elfo", INTELIGENCIA + " + 1");
        SubRace elfoFloresta = new SubRace("Elfo da Floresta", SABEDORIA + " + 1");
        SubRace elfoNegro = new SubRace("Elfo Negro (Drow)", CARISMA + " + 1");
        SubRace pesLeves = new SubRace("Pés Leves", CARISMA + " + 1");
        SubRace robusto = new SubRace("Robusto", CONSTITUICAO + " + 1");
        SubRace gnomoDaFloresta = new SubRace("Gnomo da Floresta", DESTREZA + " + 1");
        SubRace gnomoDasRochas =  new SubRace("Gnomo das Rochas", CONSTITUICAO + " + 1");

        subRaceRepository.saveAll(asList(
                anaoDaColina,
                anaoDaMontanha,
                altoElfo,
                elfoFloresta,
                elfoNegro,
                pesLeves,
                robusto,
                gnomoDaFloresta,
                gnomoDasRochas));

        raceList.addAll(asList(
                new Race("Anão",
                        CONSTITUICAO + " + 2",
                        asList(anaoDaColina,anaoDaMontanha)),
                new Race("Elfo",
                        DESTREZA + " + 2",
                        Arrays.asList(altoElfo, elfoFloresta, elfoNegro)),
                new Race("Halfling",
                        DESTREZA + " + 2",
                        Arrays.asList(pesLeves, robusto)),
                new Race("Humano",
                        "TODOS OS VALORES + 1",
                        Arrays.asList()),
                new Race("Draconato",
                        FORCA + " + 2 & " + CARISMA + " + 1",
                        Arrays.asList()),
                new Race("Gnomo",
                        INTELIGENCIA + " + 2",
                        Arrays.asList(gnomoDaFloresta,gnomoDasRochas)),
                new Race("Meio-Elfo",
                        CARISMA + " + 2 e outros DOIS valores a sua escolha + 1",
                        Arrays.asList()),
                new Race("Meio-Orc",
                        FORCA + " + 2 & " + CONSTITUICAO + " + 1",
                        Arrays.asList()),
                new Race("Tiefling",
                        INTELIGENCIA + " + 1 & " + CARISMA + " + 2",
                        Arrays.asList())));

        raceRepository.saveAll(raceList);
    }

}
