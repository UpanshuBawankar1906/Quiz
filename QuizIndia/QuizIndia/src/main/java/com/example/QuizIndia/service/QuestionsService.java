package com.example.QuizIndia.service;

import com.example.QuizIndia.model.Questions;

import java.util.List;

public interface QuestionsService {
    void insert (Questions questions);
    List<Questions> getAll();
    Questions update (Questions questions);
    void delete (Long id);
    Questions getByCategory (int id);
}
