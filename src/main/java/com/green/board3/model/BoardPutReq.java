package com.green.board3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardPutReq {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
}
