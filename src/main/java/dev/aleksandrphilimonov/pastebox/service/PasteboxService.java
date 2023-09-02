package dev.aleksandrphilimonov.pastebox.service;

import dev.aleksandrphilimonov.pastebox.api.request.PasteboxRequest;
import dev.aleksandrphilimonov.pastebox.api.response.PasteboxResponse;
import dev.aleksandrphilimonov.pastebox.api.response.PasteboxUrlResponse;

import java.util.List;

public interface PasteboxService {

    PasteboxResponse getByHash(String hash);

    List<PasteboxResponse> getFirstPublicPasteboxes();

    PasteboxUrlResponse create(PasteboxRequest request);
};
