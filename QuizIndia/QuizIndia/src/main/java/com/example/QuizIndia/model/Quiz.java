package com.example.QuizIndia.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Quiz {
    private Integer id;
    private String title;

}
