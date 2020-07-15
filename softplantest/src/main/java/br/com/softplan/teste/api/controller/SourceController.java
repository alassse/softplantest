package br.com.softplan.teste.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/source"})
public class SourceController {
    @GetMapping
    public ResponseEntity<String> getSource() {
        return new ResponseEntity("https://github.com/alassse/softplantest", HttpStatus.OK);
    }
}
