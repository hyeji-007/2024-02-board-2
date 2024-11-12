package com.green.board3;

import com.green.board3.model.BoardGetOneRes;
import com.green.board3.model.BoardGetRes;
import com.green.board3.model.BoardPostReq;
import com.green.board3.model.BoardPutReq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insBoard(BoardPostReq p);
    List<BoardGetRes> selBoardList();
    BoardGetOneRes selBoardOne(int boardId);
    int updBoard(BoardPutReq p);
}
