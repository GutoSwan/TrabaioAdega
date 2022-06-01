package adega.api.controller;

import adega.api.model.BottleModel;
import adega.api.repository.BottleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BottleController {

    @Autowired
    private BottleRepository repository;

    @GetMapping(path = "/api/bottle/{code}")
    ResponseEntity consult(@PathVariable("code") Integer code){
        return repository.findById(code)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/bottle/save")
    public BottleModel save(@RequestBody BottleModel bottle){
        return repository.save(bottle);
    }

}
