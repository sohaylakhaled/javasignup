package com.example.demo.games;

import org.junit.jupiter.api.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import javax.servlet.http.HttpServletResponse;
import static org.junit.jupiter.api.Assertions.*;

class GamesControllerTest {
    MockMvc mvc;

    @Test
    void registerNewUser() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.post("api/v1/games/watergras");
        MvcResult result = mvc.perform(request).andReturn();
        assertEquals("200", result.getResponse().getContentAsString());
    }

    @Test
    void number() {
    }

    @Test
    void dice() {
    }

    @Test
    void warergrass() {
    }
}