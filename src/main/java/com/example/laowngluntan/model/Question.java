package com.example.laowngluntan.model;

import lombok.Data;

@Data
public class Question {
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


}
