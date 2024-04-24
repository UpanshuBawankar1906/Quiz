package com.example.QuizIndia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Quiz {
    @Id
    private int id;
    private String title;
}
