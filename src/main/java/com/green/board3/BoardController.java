package com.green.board3;

import com.green.board3.model.BoardGetOneRes;
import com.green.board3.model.BoardGetRes;
import com.green.board3.model.BoardPostReq;
import com.green.board3.model.BoardPutReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// url은 /board
@RequiredArgsConstructor
@RestController
@RequestMapping("/board")
public class BoardController {
    private final BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p) {
        return service.postBoard(p);
    }

    @GetMapping
    public List<BoardGetRes> getBoardList() {
        return service.getBoardList();
    }

    @GetMapping("{boardId}")
    public BoardGetOneRes getBoardOne(@PathVariable int boardId) {
        return service.getBoardOne(boardId);
    }

    @PutMapping
    public int updBoard(@RequestBody BoardPutReq p) {
        return service.updBoard(p);
    }

}
