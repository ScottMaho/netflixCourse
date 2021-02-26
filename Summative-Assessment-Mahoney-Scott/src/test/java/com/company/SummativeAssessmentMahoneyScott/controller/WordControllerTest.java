package com.company.SummativeAssessmentMahoneyScott.controller;

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
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    private List<word> wordList;

    @BeforeEach
    public void setUp() {
    }

    @Test
    public void shouldReturnAllWordsAndDefInCollection() throws Exception {
        String outputJson = mapper.writeValueAsString(wordList);
        // ACT
        mockMvc.perform(get("/word"))                // Perform the GET request
                .andDo(print())                          // Print results to console
                .andExpect(status().isOk());              // ASSERT (status code is 200)
    }

    // Testing GET record/{id}
    @Test
    public void shouldReturnWordById() throws Exception {
        word outputWord = new word();
        outputWord.setId(2);
        String outputJson = mapper.writeValueAsString(outputWord);
        mockMvc.perform(get("/word/2"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJson));
    }
}