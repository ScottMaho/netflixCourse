package com.company.SummativeAssessmentMahoneyScott.controller;

import com.company.SummativeAssessmentMahoneyScott.model.word;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    private List<word> wordList;
    private static int idCounter = 1;

    public WordController() {
        wordList = new ArrayList<>();
        wordList.add(new word("mastermind", "a person who designs and guides a plan or undertaking", idCounter++));
        wordList.add(new word("adjust", "alter or move (something) slightly in order to achieve the desired fit, appearance, or result", idCounter++));
        wordList.add(new word("cat", "a small domesticated carnivorous mammal with soft fur, a short snout, and retractable claws", idCounter++));
        wordList.add(new word("fix", "mend or repair", idCounter++));
        wordList.add(new word("designer", "a person who plans the form, look, or workings of something before its being made or built, typically by drawing it in detail", idCounter++));
        wordList.add(new word("baby", "a very young child, especially one newly or recently born", idCounter++));
        wordList.add(new word("delicate", "very fine in texture or structure; of intricate workmanship or quality", idCounter++));
        wordList.add(new word("navy", "a dark blue color", idCounter++));
        wordList.add(new word("read", "look at and comprehend the meaning of (written or printed matter) by mentally interpreting the characters or symbols of which it is composed", idCounter++));
        wordList.add(new word("coma", "A state of prolonged unconsciousness where the patient cannot respond to external stimuli", idCounter++));
    }


    @RequestMapping(value = "/word/{id}", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public word wordDefById(@PathVariable int id)
    {
        Random random = new Random();
        id = random.nextInt(wordList.size());
        return wordList.get(id);
    }
}