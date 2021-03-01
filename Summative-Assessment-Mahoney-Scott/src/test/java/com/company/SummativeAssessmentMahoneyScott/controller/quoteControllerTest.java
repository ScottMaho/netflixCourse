package com.company.SummativeAssessmentMahoneyScott.controller;

import com.company.SummativeAssessmentMahoneyScott.model.quote;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(quoteController.class)
public class quoteControllerTest {
    @Autowired
    MockMvc mockMvc;

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnQuoteById() throws Exception {

        quote outputQuote = new quote();
        outputQuote.setQuote("Love For All, Hatred For None.");
        outputQuote.setAuthor("Khalifatul Masih III");
        outputQuote.setId(1);
        String outputJson = mapper.writeValueAsString(outputQuote);
        mockMvc.perform(get("/quote/1"))                // Perform the GET request
                .andDo(print())                          // Print results to console
                .andExpect(status().isOk())              // ASSERT (status code is 200)
                .andExpect(content().json(outputJson));
    }

}