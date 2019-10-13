package com.example.laowngluntan.mapper;

import com.example.laowngluntan.model.Question;

public interface QuestionExtMapper {
    int incView(Question record);
    int incCommentCount(Question record);
}