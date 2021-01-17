package one.digitalinnovation.personapi.controller;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PersonaController {
    @GetMapping("/api/v1/people")
    public String getBook(){
        return "API Test, ou seja, deu certo";
    }

}
