package com.company.SummativeAssessmentMahoneyScott.controller;

import com.company.SummativeAssessmentMahoneyScott.model.quote;
import com.company.SummativeAssessmentMahoneyScott.model.word;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(WordController.class)
public class WordControllerTest {
    @Autowired
    MockMvc mockMvc;

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnAllWordsAndDefInCollection() throws Exception {
        word outputWord = new word();
        outputWord.setWord("mastermind");
        outputWord.setDefinition("a person who designs and guides a plan or undertaking");
        outputWord.setId(1);
        String outputJson = mapper.writeValueAsString(outputWord);
        mockMvc.perform(get("/word/1"))                // Perform the GET request
                .andDo(print())                          // Print results to console
                .andExpect(status().isOk())            // ASSERT (status code is 200)
                .andExpect(content().json(outputJson));
    }
}
