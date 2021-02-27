package com.company.SummativeAssessmentMahoneyScott.controller;

import com.company.SummativeAssessmentMahoneyScott.model.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class magicBallController {
    private List<String> eightBallList;

    public magicBallController() {

        eightBallList = new ArrayList<>();
        eightBallList.add("It is certain");
        eightBallList.add("Outlook good");
        eightBallList.add("Better not tell you now");
        eightBallList.add("Ask again later");
        eightBallList.add("My sources say no");
        eightBallList.add("Signs point to yes");
        eightBallList.add("Concentrate and ask again");
        eightBallList.add("Without a doubt");
        eightBallList.add("Cannot predict now");
        eightBallList.add("Yes");

    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public Answer magicAnswer(@RequestBody Answer question) {

        Random ans = new Random();
        int index = ans.nextInt(eightBallList.size());
        String answer = eightBallList.get(index);
        question.setAnswer(answer);
        question.setId(index);

        return question;
    }
}
