
package com.elevate.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@ExtendWith(SpringExtension.class)
@WebMvcTest(PatronController.class)
@AutoConfigureMockMvc
@ContextConfiguration(locations="classpath:test-beans.xml")

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

        RequestBuilder request = MockMvcRequestBuilders
                .get("/patrons/1")
                .accept(MediaType.APPLICATION_JSON);

        try {
            mockMvc.perform(request)
                    .andExpect(jsonPath("/patrons/1").value("Jojo"))
                    .andExpect(status().isOk());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


                   }
       @Test
    void createNewPatron(){
        //mock
           when(patrons.addPatron(any(Patron.class))).thenReturn(patron);

       //Create POST Request
           RequestBuilder request = MockMvcRequestBuilders
                   .post("/patrons")
                   .content("""
                            {"name" : "Charlie"}
                            """)
                   .contentType(MediaType.APPLICATION_JSON)
                   .accept(MediaType.APPLICATION_JSON);

           //Perform Request
           try{ mockMvc.perform(request)
                   .andExpect(status().isCreated())
                   .andExpect(jsonPath("$.id").value(1))
                   .andExpect(jsonPath("$.name").value ("Jojo"))
                   .andReturn();
           } catch (Exception e){
               throw new RuntimeException(e);

           }



    }

}
