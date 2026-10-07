package com.example.adder;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertFalse;

class SecurityTest {

    @Test
    void controllerDoesNotExposeDeleteMapping() {
        for (Method method : AdderController.class.getDeclaredMethods()) {
            RequestMapping requestMapping =
                    method.getAnnotation(RequestMapping.class);

            assertFalse(
                    requestMapping != null
                            && requestMapping.method().length > 0
                            && requestMapping.method()[0].name().equals("DELETE")
            );
        }
    }
}