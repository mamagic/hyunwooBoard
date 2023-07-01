package com.hyunwoo.hyunwooboard.board.controller.response;

import com.hyunwoo.hyunwooboard.board.dto.BoardDTO;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CommentResponse {

    private Long id;
    private String writer;
    private String title;
    private String contents;

    @Builder(access = AccessLevel.PRIVATE)
    private CommentResponse(Long id, String writer, String title, String contents) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.contents = contents;
    }

    public static List<CommentResponse> fromList(List<BoardDTO> list) {
        return list.stream()
                .map(CommentResponse::from)
                .collect(Collectors.toList());
    }

    public static CommentResponse from(BoardDTO board) {
        return CommentResponse.builder()
                .id(board.getId())
                .writer(board.getWriter())
                .title(board.getTitle())
                .contents(board.getContents())
                .build();
    }

}
