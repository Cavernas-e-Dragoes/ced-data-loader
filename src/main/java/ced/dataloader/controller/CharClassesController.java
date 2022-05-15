package ced.dataloader.controller;

import ced.dataloader.model.CharClass;
import ced.dataloader.repository.CharClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/v1/api/classes")
public class CharClassesController {

    private final CharClassRepository charClassRepository;

    @Autowired
    public CharClassesController(CharClassRepository charClassRepository) {
        this.charClassRepository = charClassRepository;
    }

    @GetMapping("/{classId}")
    public ResponseEntity<CharClass> getClass(@PathVariable Long classId) {
        Optional<CharClass> charClass = charClassRepository.findById(classId);

        if (charClass.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(charClass.get());
    }
}
