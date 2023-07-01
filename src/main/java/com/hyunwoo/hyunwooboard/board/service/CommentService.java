package com.hyunwoo.hyunwooboard.board.service;

import com.hyunwoo.hyunwooboard.board.controller.request.BoardRequest;
import com.hyunwoo.hyunwooboard.board.controller.request.CommentRequest;
import com.hyunwoo.hyunwooboard.board.dto.BoardDTO;
import com.hyunwoo.hyunwooboard.board.entity.Board;
import com.hyunwoo.hyunwooboard.board.entity.Comment;
import com.hyunwoo.hyunwooboard.board.repository.BoardRepository;
import com.hyunwoo.hyunwooboard.board.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * entity를 직접 반환시키면 안된다.
 * 귀찮지만 DTO로 변환을 시키는 작업을 해야한다.
 */
@Service
@RequiredArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;
    private final BoardRepository boardRepository;

    @Transactional
    public void save(CommentRequest request) {
        Comment comment = Comment.from(request);
        commentRepository.save(comment);
    }
}
