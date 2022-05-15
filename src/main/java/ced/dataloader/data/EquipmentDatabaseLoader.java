package ced.dataloader.data;


import ced.dataloader.model.Equipment;
import ced.dataloader.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class EquipmentDatabaseLoader implements ApplicationRunner {

    private final EquipmentRepository equipmentRepository;

    public List<Equipment> equipments = new ArrayList<>();

    @Autowired
    public EquipmentDatabaseLoader(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        equipments.addAll(Arrays.asList(
                new Equipment("Faca",
                        "Arma",
                        5.0,
                        0,
                        0,
                        false,
                        0.05,
                        "1d4",
                        "",
                        "Uma faca Velha, mas afiada"),
                new Equipment("Bastão",
                        "Arma",
                        0.0,
                        0,
                        0,
                        false,
                        1.0,
                        "1d6",
                        "",
                        "um galho velho")
        ));
        equipmentRepository.saveAll(equipments);
    }
}
