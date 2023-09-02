package dev.aleksandrphilimonov.pastebox.controller;

import dev.aleksandrphilimonov.pastebox.api.request.PasteboxRequest;
import dev.aleksandrphilimonov.pastebox.api.response.PasteboxResponse;
import dev.aleksandrphilimonov.pastebox.api.response.PasteboxUrlResponse;
import dev.aleksandrphilimonov.pastebox.service.PasteboxService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequiredArgsConstructor
public class PasteBoxController {

    private final PasteboxService pasteboxService;

    @GetMapping("/{hash}")
    public PasteboxResponse getByHash(@PathVariable String hash) {
        return pasteboxService.getByHash(hash);
    }

    @GetMapping("/")
    public Collection<PasteboxResponse> getPublicPasteList() {
        return pasteboxService.getFirstPublicPasteboxes();
    }

    @PostMapping("/")
    public PasteboxUrlResponse add(@RequestBody PasteboxRequest request) {
        return pasteboxService.create(request);
    }

}
