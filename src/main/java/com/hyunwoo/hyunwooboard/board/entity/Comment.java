package com.hyunwoo.hyunwooboard.board.entity;

import com.hyunwoo.hyunwooboard.board.controller.request.BoardRequest;
import com.hyunwoo.hyunwooboard.board.controller.request.CommentRequest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Table(name = "comment")
@NoArgsConstructor
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String writer;

    @Column(length = 500)
    private String contents;

    @Column(name = "boardId")
    private Long boardId;


    @Builder(access = AccessLevel.PRIVATE)
    private Comment(String writer, String contents, Long boardId) {
        this.writer = writer;
        this.contents = contents;
        this.boardId = boardId;
    }

    public static Comment from(CommentRequest request) {
        return  Comment.builder()
                .boardId(request.getBoardId())
                .writer(request.getWriter())
                .contents(request.getContents())
                .build();
    }

}
