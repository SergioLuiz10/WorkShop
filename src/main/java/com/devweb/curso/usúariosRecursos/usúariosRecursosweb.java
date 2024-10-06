package com.devweb.curso.usúariosRecursos;

import com.devweb.curso.entidades.usúarios;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  trate requisições HTTP.
@RequestMapping(value = "/usúarios") //todas as requisiões get de usuarios sao tratadas aki
public class usúariosRecursosweb {

    @GetMapping  //quando uma requisição GET for feita em "/usúarios", este método será chamado.

    //response entity pega o web e transfoma no obj fomando deixando no tipo json
    public ResponseEntity<usúarios> achandotodos(){
        usúarios u = new usúarios(1L,"sergio","sergioluizteixeira12345@gmail.com","71981325228","zula2004");
         return ResponseEntity.ok().body(u);
    }
}
