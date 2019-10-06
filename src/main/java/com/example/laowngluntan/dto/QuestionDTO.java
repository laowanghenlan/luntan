package com.example.laowngluntan.dto;

import com.example.laowngluntan.model.User;
import lombok.Data;

@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer view;
    private Integer likeCount;
    private Integer commentCount;
    private User user;
}
