package com.hyunwoo.hyunwooboard.board.entity;

import com.hyunwoo.hyunwooboard.board.controller.request.BoardRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "board")
@NoArgsConstructor
public class Board {

    @Id // pk 지정. 필수
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false) // 크기 20, not null
    private String writer;

    @Column
    private String title;

    @Column
    private String contents;

    @Builder(access = AccessLevel.PRIVATE)
    private Board(String writer, String title, String contents) {
        this.writer = writer;
        this.title = title;
        this.contents = contents;
    }

    public static Board from(BoardRequest request) {
        return Board.builder()
                .writer(request.getWriter())
                .title(request.getTitle())
                .contents(request.getContents())
                .build();
    }

    public void update(BoardRequest request){
        updateTitle(request.getTitle());
        this.contents= request.getContents();
    }

    public void updateTitle(String title) {
        this.title = title;
    }
}
