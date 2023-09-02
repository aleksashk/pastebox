package dev.aleksandrphilimonov.pastebox.api.response;

import dev.aleksandrphilimonov.pastebox.api.request.PublicStatus;
import lombok.Data;


@Data
public class PasteboxResponse {
    private String data;
    private PublicStatus status;
}
