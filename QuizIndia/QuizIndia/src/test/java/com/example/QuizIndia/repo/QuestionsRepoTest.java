package com.example.QuizIndia.repo;

import com.example.QuizIndia.model.Questions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class QuestionsRepoTest {

    @Mock
    private QuestionsRepo questionsRepo;

    @InjectMocks
    private QuestionsRepoTest repoTest;

    @Test
    public void insert() {
        Questions expectedQuestionsObject = new Questions(3L,"what is JAVA ?","language",
                "food","Nothing", "Coding language",
                "Coding language","Easy","java");
        when(questionsRepo.insert(expectedQuestionsObject)).thenReturn(expectedQuestionsObject);
        Questions actualQuestionsObject = questionsRepo.insert(expectedQuestionsObject);
        assertThat(actualQuestionsObject).usingRecursiveComparison()
                .ignoringFields("postId").isEqualTo(expectedQuestionsObject);
    }
}
