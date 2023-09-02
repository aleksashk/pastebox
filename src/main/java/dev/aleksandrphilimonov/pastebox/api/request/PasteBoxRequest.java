package dev.aleksandrphilimonov.pastebox.api.request;

import lombok.Data;

@Data
public class PasteBoxRequest {
    private String date;

    private long expirationTimeSeconds;

    private PublicStatus publicStatus;


}
