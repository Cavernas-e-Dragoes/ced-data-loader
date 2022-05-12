package ced.dataloader.data;

import ced.dataloader.model.CharClass;
import ced.dataloader.repository.CharClassRepository;
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

@Component
public class CharCLassDatabaseLoader implements ApplicationRunner {

    private final CharClassRepository charClassRepository;

    public List<CharClass> charClasses = new ArrayList<>();

    @Autowired
    public CharCLassDatabaseLoader(CharClassRepository charClassRepository) {
        this.charClassRepository = charClassRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        charClasses.addAll(Arrays.asList(
                new CharClass("Bárbaro",
                        "Um feroz guerreiro de origem primitiva que pode entrar em fúria durante uma batalha",
                        12,
                        FORCA,
                        FORCA + " & " + CONSTITUICAO,
                        "Armaduras leves e médias, escudos, armas simples e marciais"),
                new CharClass("Bardo",
                        "Um místico inspirador que possui poderes que ecoam a música da criação",
                        8,
                        CARISMA,
                        DESTREZA + " & " + CARISMA,
                        "Armaduras leves, armas simples, bestas de mão, espadas longas, rapieiras, espadas curtas"),
                new CharClass("Bruxo",
                        "Um portador de magia derivada de barganha com uma entidade planar",
                        8,
                        CARISMA,
                        SABEDORIA + " & " + CARISMA,
                        "Armaduras leves, armas simples"),
                new CharClass("Clérigo",
                        "Um campeão sacerdotal que empunha magia divina a serviço de um poder maior",
                        8,
                        SABEDORIA,
                        SABEDORIA + " & " + CARISMA,
                        "Armaduras leves e médias, escudos, armas simples"),
                new CharClass("Druida",
                        "Um sacerdote da Crença Antiga, detentor dos poderes da natureza – luz da lua e crescimento das plantas, fogo e relâmpagos – e capaz de adotar formas animais",
                        8,
                        SABEDORIA,
                        INTELIGENCIA + " & " + SABEDORIA,
                        "Armaduras leves e médias (nãometálicas), escudos (nãometálicos), clavas, adagas, dardos, azagaias, maças, bordões,cimitarras, foices, fundas e lanças"),
                new CharClass("Feiticeiro",
                        "Um conjurador que possui magia latente advinda de um dom ou linhagem",
                        6,
                        CARISMA,
                        CONSTITUICAO + " & " + CARISMA,
                        "Adagas, dardos, fundas, bordões, bestas leves"),
                new CharClass("Guerreiro",
                        "Um mestre do combate, perito em uma vasta gama de armas e armaduras",
                        10,
                        FORCA + " ou " + DESTREZA,
                        FORCA + " & " + CONSTITUICAO,
                        "Todas as armaduras, armas simples e marciais"),
                new CharClass("Ladino",
                        "Um trapaceiro que utiliza de furtividade e astúcia para sobrepujar os obstáculos e inimigos",
                        8,
                        DESTREZA,
                        DESTREZA + " & " + INTELIGENCIA,
                        "Armaduras leves, armas simples,bestas de mão, espadas longas, rapieiras, espadas curtas"),
                new CharClass("Mago",
                        "Um usuário de magia escolado, capaz de manipular as estruturas da realidade",
                        6,
                        INTELIGENCIA,
                        INTELIGENCIA + " & " + SABEDORIA,
                        "Adagas, dardos, fundas, bastões, bestas leves"),
                new CharClass("Monge",
                        "Um mestre das artes marciais, utilizando o poder corporal para atingir a perfeição física e espiritual",
                        8,
                        DESTREZA + " & " + SABEDORIA,
                        FORCA + " & " + DESTREZA,
                        "Armas simples, espadas curtas"),
                new CharClass("Paladino",
                        "Um guerreiro divino vinculado a um juramento sagrado",
                        10,
                        FORCA + " & " + CARISMA,
                        SABEDORIA + " & " + CARISMA,
                        "Todas as armaduras, escudos, armas simples e marciais"),
                new CharClass("Patrulheiro",
                        "Um guerreiro que utiliza de poderio marcial e magia natural para combater ameaças nos limites da civilização",
                        10,
                        DESTREZA + " & " + SABEDORIA,
                        FORCA + " & " + DESTREZA,
                        "Armaduras leves e médias, escudos, armas simples e marciais")
        ));
        charClassRepository.saveAll(charClasses);
    }
}
