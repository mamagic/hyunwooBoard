package com.hyunwoo.hyunwooboard.board.controller.request;

import lombok.Getter;

@Getter
public class BoardRequest {

    private String writer;
    private String title;
    private String contents;

}
