package com.example.QuizIndia.controller;

import com.example.QuizIndia.model.Questions;
import com.example.QuizIndia.model.Quiz;
import com.example.QuizIndia.service.QuestionsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class QuestionControllerTest {

    private MockMvc mockMvc;

    @Mock
    private QuestionsService questionsService;

    @InjectMocks
    private QuestionController questionController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(questionController).build();
    }
    @Test
    public void testCreateQuestion() throws Exception {
        Questions question = new Questions();
        question.setId(1L);

        Mockito.doNothing().when(questionsService).insert(Mockito.any(Questions.class));


        mockMvc.perform(post("/createQuestion")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{}"))
                .andExpect(status().isCreated());
    }

    @Test
    public void testGetAllQuestions() throws Exception {
        List<Questions> questionsList = Collections.singletonList(new Questions());

        when(questionsService.getAll()).thenReturn(questionsList);

        mockMvc.perform(get("/allQuestion"))
                .andExpect(status().isOk());
    }
}
