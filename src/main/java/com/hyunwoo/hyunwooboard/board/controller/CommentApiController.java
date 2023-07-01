package com.hyunwoo.hyunwooboard.board.controller;

import com.hyunwoo.hyunwooboard.board.controller.request.BoardRequest;
import com.hyunwoo.hyunwooboard.board.controller.request.CommentRequest;
import com.hyunwoo.hyunwooboard.board.controller.response.BoardResponse;
import com.hyunwoo.hyunwooboard.board.service.BoardService;
import com.hyunwoo.hyunwooboard.board.service.CommentService;
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
@RequestMapping("/comment-api")
public class CommentApiController {

    private final CommentService commentService;

    @PostMapping
    public ApiResponse<String> save(@RequestBody CommentRequest request){
        commentService.save(request);
        return ApiResponse.ok();
        //주석 추가내용입니다
        //주석 추가내용입니다
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌666
        //주석 충돌222666
        //주석 충돌555666666
        //주석 충돌444666
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
        //주석 충돌
    }

    // 충돌 내기 위한 주석
    // 충돌 내기 위한 주석
    // 충돌 내기 위한 주석
    // 충돌 내기 위한 주석
    // 충돌 내기 위한 주석
    // 충돌 내기 위한 주석

}
