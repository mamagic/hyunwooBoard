package com.hyunwoo.hyunwooboard.board.controller;

import com.hyunwoo.hyunwooboard.board.controller.request.BoardRequest;
import com.hyunwoo.hyunwooboard.board.controller.response.BoardResponse;
import com.hyunwoo.hyunwooboard.board.service.BoardService;
import com.hyunwoo.hyunwooboard.common.reponse.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * DTO를 바로 반환시키지 X
 * 귀찮지만 response라는 클래스를 만들어서 반환 시킨다.
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/board-api")
public class BoardApiController {

    private final BoardService boardService;

    @GetMapping
    public ApiResponse<List<BoardResponse>> findAll(){
        return ApiResponse.ok(BoardResponse.fromList(boardService.findAll()));
    }

    @GetMapping("/{id}")
    public ApiResponse<BoardResponse> findOne(@PathVariable("id") long id){
        return ApiResponse.ok(BoardResponse.from(boardService.findOne(id)));
    }

    @PostMapping
    public ApiResponse<String> save(@RequestBody BoardRequest request){
         boardService.save(request);
        return ApiResponse.ok();
    }

    @PutMapping("/{id}")
    public ApiResponse<String> update(@RequestBody BoardRequest request, @PathVariable("id") long id){
        boardService.update(request, id);
        return ApiResponse.ok();
    }

}
