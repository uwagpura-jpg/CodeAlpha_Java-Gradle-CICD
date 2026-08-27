package com.codealpha.CodeAlpha_Java_Gradle_CICD;

import com.codealpha.CodeAlpha_Java_Gradle_CICD.controller.DevOpsController;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeAlphaJavaGradleCicdApplicationTests {

    private final DevOpsController controller = new DevOpsController();

    @Test
    void helloEndpointReturnsExpectedResponse() {
        Map<String, String> response = controller.hello();

        assertEquals(
                "Hello from CodeAlpha DevOps Application",
                response.get("message")
        );
        assertEquals("UP", response.get("status"));
    }

    @Test
    void statusEndpointReturnsExpectedResponse() {
        Map<String, String> response = controller.status();

        assertEquals(
                "CodeAlpha Java Gradle CI/CD",
                response.get("application")
        );
        assertEquals("UP", response.get("status"));
    }
}
