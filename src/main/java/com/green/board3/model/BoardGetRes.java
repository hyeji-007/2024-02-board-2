package com.green.board3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardGetRes {
    private int boardId;
    private String title;
    private String writer;
    private String createdAt;

}
