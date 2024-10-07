package com.devweb.curso.usúariosRecursos;

import com.devweb.curso.entidades.usúarios;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //  // Classe que responde às requisições HTTP
@RequestMapping(value = "/usúarios") // Define a URL "/usuarios" para ser tratada pela classe
public class usúariosRecursosweb {

    @GetMapping  //Método que será chamado para requisições GET e vai executar oq vim abaixo

    //response entity pega o web e transfoma no obj fomando deixando no tipo json
    public ResponseEntity<usúarios> achandotodos(){
        usúarios u = new usúarios(1L,"sergio","sergioluizteixeira12345@gmail.com","71981325228","zula2004");
         return ResponseEntity.ok().body(u);// Responde com o objeto "Usuarios" e status OK
    }
}
