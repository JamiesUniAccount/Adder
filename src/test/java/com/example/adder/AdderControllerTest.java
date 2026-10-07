package com.example.adder;

import org.junit.jupiter.api.Test;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class AdderControllerTest {

    @Test
    void addReturnsIndexAndAddsResultToModel() {
        AdderController controller = new AdderController();
        Model model = mock(Model.class);

        String view = controller.add(2, 3, model);

        assertEquals("index", view);
        verify(model).addAttribute("result", 5);
    }
}