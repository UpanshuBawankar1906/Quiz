package com.example.QuizIndia.controller;

import com.example.QuizIndia.model.Questions;
import com.example.QuizIndia.service.QuestionsService;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class QuestionController {
    @Autowired
    private QuestionsService service;
    @PostMapping("/createQuestion")
    @ResponseBody
    public ResponseEntity createQuestion(@RequestBody Questions questions){
    service.insert(questions);
        System.out.println("Questions inserted in Database");
        return new ResponseEntity("Questions inserted in Database.", HttpStatus.CREATED);
    }
    @GetMapping("/allQuestion")
    public List<Questions> getAll(){
        return service.getAll();
    }
}
