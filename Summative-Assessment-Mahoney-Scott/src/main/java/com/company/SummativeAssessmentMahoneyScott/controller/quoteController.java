package com.company.SummativeAssessmentMahoneyScott.controller;

import com.company.SummativeAssessmentMahoneyScott.model.quote;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class quoteController {
    private List<quote> quoteList;
    private static int idCounter = 1;

    public quoteController() {

        quoteList = new ArrayList<>();
        quoteList.add(new quote("Love For All, Hatred For None.", "Khalifatul Masih III", idCounter++));
        quoteList.add(new quote("Change the world by being yourself.", "Amy Poehler", idCounter++));
        quoteList.add(new quote("Every moment is a fresh beginning.", "T.S Eliot", idCounter++));
        quoteList.add(new quote("Never regret anything that made you smile.", "Mark Twain", idCounter++));
        quoteList.add(new quote("Everything you can imagine is real.", "Pablo Picasso", idCounter++));
        quoteList.add(new quote("Simplicity is the ultimate sophistication.", "Leonardo da Vinci", idCounter++));
        quoteList.add(new quote("Whatever you do, do it well.", "Walt Disney", idCounter++));
        quoteList.add(new quote("What we think, we become.", "a dark blue color", idCounter++));
        quoteList.add(new quote("Have enough courage to start and enough heart to finish.", "Jessica N. S. Yourko", idCounter++));
        quoteList.add(new quote("All limitations are self-imposed.", "Oliver Wendell Holmes", idCounter++));
    }
}
