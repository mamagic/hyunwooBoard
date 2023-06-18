package com.hyunwoo.hyunwooboard.board.dto;

import com.hyunwoo.hyunwooboard.board.entity.Board;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

/** DTO(Data Transfer Object) : 데이터를 객체에게 전달 */
@Getter
public class BoardDTO {

    private Long id;
    private String writer;
    private String title;
    private String contents;

    @Builder(access = AccessLevel.PRIVATE)
    private BoardDTO(Long id, String writer, String title, String contents) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.contents = contents;
    }

    public static List<BoardDTO> fromList(List<Board> list) {
        return list.stream()
                .map(BoardDTO::from)
                .collect(Collectors.toList());
    }

    public static BoardDTO from(Board board) {
        return BoardDTO.builder()
                .id(board.getId())
                .writer(board.getWriter())
                .title(board.getTitle())
                .contents(board.getContents())
                .build();
    }

}
