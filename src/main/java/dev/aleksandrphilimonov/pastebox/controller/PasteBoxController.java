package dev.aleksandrphilimonov.pastebox.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Collections;

@RestController
public class PasteBoxController {

    @GetMapping("/{hash}")
    public String getByHash(@PathVariable String hash) {
        return hash;
    }

    @GetMapping("/")
    public Collection<String> getPublicPasteList() {
        return Collections.emptyList();
    }


}
