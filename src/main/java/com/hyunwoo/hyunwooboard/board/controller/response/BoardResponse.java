package com.hyunwoo.hyunwooboard.board.controller.response;

import com.hyunwoo.hyunwooboard.board.dto.BoardDTO;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class BoardResponse {

    private Long id;
    private String writer;
    private String title;
    private String contents;

    @Builder(access = AccessLevel.PRIVATE)
    private BoardResponse(Long id, String writer, String title, String contents) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.contents = contents;
    }

    public static List<BoardResponse> fromList(List<BoardDTO> list) {
        return list.stream()
                .map(BoardResponse::from)
                .collect(Collectors.toList());
    }

    public static BoardResponse from(BoardDTO board) {
        return BoardResponse.builder()
                .id(board.getId())
                .writer(board.getWriter())
                .title(board.getTitle())
                .contents(board.getContents())
                .build();
    }

}
