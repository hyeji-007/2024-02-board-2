package com.green.board3;

import com.green.board3.model.*;
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

    @GetMapping("{boardId}") //@PathVariable: URL 경로의 변수를 메서드 파라미터로 받을 때 사용하는 애노테이션
    public BoardGetOneRes getBoardOne(@PathVariable int boardId) {
        return service.getBoardOne(boardId);
    }

    /*
    @GetMapping("{boardId}")
    public SelOne selOne(@PathVariable("boardId") int p){
    return service.selOne(p);
     */

    @PutMapping
    public int putBoard(@RequestBody BoardPutReq p) {
        return service.putBoard(p);
    }

    @DeleteMapping
    public int delBoard(@ModelAttribute BoardDelReq p) {
        return service.delBoard(p);
    }

}
