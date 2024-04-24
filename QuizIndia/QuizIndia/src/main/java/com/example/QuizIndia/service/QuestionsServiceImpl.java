package com.example.QuizIndia.service;

import com.example.QuizIndia.model.Questions;
import com.example.QuizIndia.repo.QuestionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionsServiceImpl implements QuestionsService{
    @Autowired
    private QuestionsRepo repo;
    @Override
    public void insert(Questions questions) {
        repo.insert(questions);
    }

    @Override
    public List<Questions> getAll() {
        return repo.getAll();
    }
    @Override
    public Questions update(Questions questions) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Questions getByCategory(int id) {
        return null;
    }
}
