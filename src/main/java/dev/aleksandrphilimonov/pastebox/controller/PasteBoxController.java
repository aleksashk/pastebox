package dev.aleksandrphilimonov.pastebox.controller;

import dev.aleksandrphilimonov.pastebox.api.request.PasteboxRequest;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public String add(@RequestBody PasteboxRequest request) {
        return request.getData();
    }

}
