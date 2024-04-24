package com.example.QuizIndia.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class QuestionsTest {

    @Test
    public void testConstructorAndGetters() {

        Long id = 1L;
        String question = "What is Java?";
        String option1 = "A programming language";
        String option2 = "A fruit";
        String option3 = "A country";
        String option4 = "A car";
        String correctAnswer = "A programming language";
        String difficultyLevel = "Easy";
        String category = "Programming";

        // When
        Questions questions = new Questions(id, question, option1, option2, option3, option4, correctAnswer, difficultyLevel, category);

        // Then
        assertEquals(id, questions.getId());
        assertEquals(question, questions.getQuestion());
        assertEquals(option1, questions.getOption1());
        assertEquals(option2, questions.getOption2());
        assertEquals(option3, questions.getOption3());
        assertEquals(option4, questions.getOption4());
        assertEquals(correctAnswer, questions.getCorrectanswer());
        assertEquals(difficultyLevel, questions.getDifficultylevel());
        assertEquals(category, questions.getCategory());
    }

    @Test
    public void testSetterAndGetters() {

        Questions questions = new Questions();
        Long id = 2L;
        String question = "What is Python?";
        String option1 = "A programming language";
        String option2 = "A snake";
        String option3 = "A country";
        String option4 = "A car";
        String correctAnswer = "A programming language";
        String difficultyLevel = "Intermediate";
        String category = "Programming";


        questions.setId(id);
        questions.setQuestion(question);
        questions.setOption1(option1);
        questions.setOption2(option2);
        questions.setOption3(option3);
        questions.setOption4(option4);
        questions.setCorrectanswer(correctAnswer);
        questions.setDifficultylevel(difficultyLevel);
        questions.setCategory(category);

        assertEquals(id, questions.getId());
        assertEquals(question, questions.getQuestion());
        assertEquals(option1, questions.getOption1());
        assertEquals(option2, questions.getOption2());
        assertEquals(option3, questions.getOption3());
        assertEquals(option4, questions.getOption4());
        assertEquals(correctAnswer, questions.getCorrectanswer());
        assertEquals(difficultyLevel, questions.getDifficultylevel());
        assertEquals(category, questions.getCategory());
    }
}
