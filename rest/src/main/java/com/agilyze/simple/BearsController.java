package com.agilyze.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BearsController {

    private final Map<String, Bear> bears;

    public BearsController() {

        this.bears = buildBearMap();
    }

    @GetMapping(value = "/bears")
    public Map<String, Bear> getAllBears() {

        return bears;

    }

    @GetMapping(value = "/bears/{id}")
    public Bear getBear(@PathVariable String id) {

        return bears.get(id);

    }

    private Map<String, Bear> buildBearMap() {
        Map<String, Bear> bears = new HashMap<>();

        bears.put("1", new Bear("Pooh", "Pooh"));
        bears.put("2", new Bear("Dave", "Orange"));
        bears.put("3", new Bear("Grum", "Green"));

        return bears;
    }

}
