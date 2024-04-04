package com.example.QuizIndia.repo;

import com.example.QuizIndia.model.Questions;

import java.util.List;

public interface QuestionsRepo {
        Questions insert (Questions questions);
        List<Questions> getAll();

        Questions update (Questions questions);

        void delete(int id);

        Questions getByCategory (int id);
}
