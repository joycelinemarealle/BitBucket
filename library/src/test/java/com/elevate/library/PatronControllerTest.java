package com.elevate.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class PatronControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    PatronDAO patrons;

    private Patron patron;

    @BeforeEach
    void setUp(){
        patron = new Patron (1,"Jojo");

    }
    @Test
    void getPatronById() {
        when(patrons.getById(1)).thenReturn(patron);

        RequestBuilder request = MockMvcRequestBuilders.get("/patrons/10").accept(MediaType.APPLICATION_JSON);

        try {
            mockMvc.perform(request)
                    .andExpect(jsonPath("/patrons/10").value("Jojo"))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
