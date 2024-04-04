package com.example.QuizIndia.repo;

import com.example.QuizIndia.model.Questions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class QuestionsRepoImpl implements QuestionsRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Questions insert(Questions questions) {
        jdbcTemplate.update("INSERT into questions(question,option1,option2,option3,option4,correctAnswer,difficultyLevel,category)"
                        + "values(?,?,?,?,?,?,?,?)",
                questions.getQuestion(), questions.getOption1(), questions.getOption2(), questions.getOption3(),
                questions.getOption4(), questions.getCorrectAnswer(), questions.getDifficultyLevel(),
                questions.getCategory());
        return questions;
    }

    @Override
    public List<Questions> getAll() {
        return jdbcTemplate.query("select * from questions", (rs, rowNum) -> {
            return new Questions(rs.getLong(1), rs.getString(2), rs.getString(3),
                    rs.getString(4), rs.getString(5), rs.getString(6),
                    rs.getString(7), rs.getString(8), rs.getString(9));
        });
    }

    @Override
    public Questions update(Questions questions) {
        jdbcTemplate.update("update questions set question=?, option1=?, option2=?, option3=?, option4=?," +
                        "correctAnswer=?, difficultyLevel=?, category=? where id=?", questions.getQuestion(),
                questions.getOption1(), questions.getOption2(), questions.getOption3(), questions.getOption4(),
                questions.getCorrectAnswer(), questions.getDifficultyLevel(), questions.getCategory(),
                questions.getId());
        return questions;
    }

    @Override
    public void delete(int id) {
        jdbcTemplate.update("delete from questions where id=?", id);
    }

    @Override
    public Questions getByCategory(int id) {
        return jdbcTemplate.queryForObject("select * from questions where category=?", (rs, rowNum) -> {
            return new Questions(rs.getLong("id"), rs.getString("question"),
                    rs.getString("option1"), rs.getString("option2"),
                    rs.getString("option3"), rs.getString("option4"),
                    rs.getString("correctAnswer"), rs.getString("difficultyLevel"),
                    rs.getString("category"));
        }, id);
    }
}
