package com.example.laowngluntan.dto;

import lombok.Data;

import java.util.List;
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
