package dev.aleksandrphilimonov.pastebox;

import dev.aleksandrphilimonov.pastebox.api.response.PasteboxResponse;
import dev.aleksandrphilimonov.pastebox.repository.PasteboxEntity;
import dev.aleksandrphilimonov.pastebox.repository.PasteboxRepository;
import dev.aleksandrphilimonov.pastebox.service.PasteboxService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
public class PasteboxServiceTest {

    @Autowired
    private PasteboxService pasteboxService;

    @MockBean
    private PasteboxRepository pasteboxRepository;

    @Test
    public void notExistHash() {
        assertThrows(NullPointerException.class, () -> pasteboxService.getByHash("asdfcafasd"));
    }

    @Test
    public void getExistHash() {
        PasteboxEntity entity = new PasteboxEntity();
        entity.setHash("1");
        entity.setData("11");
        entity.setPublic(true);

        when(pasteboxRepository.getByHash("1")).thenReturn(entity);

        PasteboxResponse expected = new PasteboxResponse("11", true);
        PasteboxResponse actual = pasteboxService.getByHash("1");

        assertEquals(expected, actual);
    }

}
