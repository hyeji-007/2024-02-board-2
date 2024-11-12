package com.green.board3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDelReq {
    private int boardId;
    private String writer;
}
