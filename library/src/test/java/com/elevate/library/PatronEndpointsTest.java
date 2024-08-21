package com.elevate.library;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.internal.matchers.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@Import(PatronController.class)
@WebMvcTest(PatronController.class)
@ContextConfiguration(locations="classpath:test-beans.xml")
public class PatronEndpointsTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PatronDAO patrons;

    @BeforeEach
    void setup() {

    }

    @Test
    void getPatronByID() {
        when(patrons.getById(10)).thenReturn(new Patron(10, "Charlie"));

        try {
            mockMvc.perform(get("/patrons/10"))
                    .andExpect(MockMvcResultMatchers.jsonPath("name")
                    .value("Charlie"))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void makeNewPatron() {
        Patron pOutput = new Patron(99, "Charlie");
        when(patrons.addPatron(any(Patron.class))).thenReturn(pOutput);
        try {
            mockMvc.perform(post("/patrons")
                    .content("""
                            {"name" : "Charlie"}
                            """)
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON))
                    .andExpect(status().isCreated())
                    .andExpect(MockMvcResultMatchers.jsonPath("id").value(99));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
