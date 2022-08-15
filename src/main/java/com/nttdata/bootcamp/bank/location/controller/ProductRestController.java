package com.nttdata.bootcamp.bank.location.controller;

import com.nttdata.bootcamp.bank.location.model.document.Location;
import com.nttdata.bootcamp.bank.location.service.inte.LocationServiceInte;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/locations")
public class ProductRestController {

    private static final Logger log = LoggerFactory.getLogger(LocationServiceInte.class);

    @Autowired
    private LocationServiceInte productServiceInte;

    @PostMapping
    public Mono<Location> create(@RequestBody final Location location) {
        log.debug("Begin RestController create Location");
        return productServiceInte.create(location);
    }

    @GetMapping
    public Flux<Location> readAll() {
        log.debug("Begin RestController readAll Location");
        return productServiceInte.readAll();
    }

    @GetMapping("/readByCodeLocation/{codeProduct}")
    public Mono<Location> readByCodeLocation(@PathVariable String codeLocation) {
        log.debug("Begin RestController findByCodeProduct Location");
        return productServiceInte.readByCodeLocation(codeLocation);
    }

    @PutMapping("/{id}")
    public Mono<Location> updateById(@RequestBody final Location location, @PathVariable("id") final String id) {
        log.debug("Begin RestController updateById Location");
        return productServiceInte.updateById(id, location);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteById(@PathVariable final String id) {
        log.debug("Begin RestController deleteById Location");
        return productServiceInte.deleteById(id);
    }

}