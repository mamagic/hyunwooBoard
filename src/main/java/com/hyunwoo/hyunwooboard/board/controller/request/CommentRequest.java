package com.hyunwoo.hyunwooboard.board.controller.request;

import com.hyunwoo.hyunwooboard.board.entity.Board;
import com.hyunwoo.hyunwooboard.board.entity.Comment;
import lombok.Getter;

import java.util.List;

@Getter
public class CommentRequest {

    String writer;
    String contents;
    Long boardId;
}
