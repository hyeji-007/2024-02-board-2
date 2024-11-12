package com.green.board3.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//insert 때 사용
@Getter
@Setter
@ToString
public class BoardPostReq {
    private String title;
    private String contents;
    private String writer;
}
