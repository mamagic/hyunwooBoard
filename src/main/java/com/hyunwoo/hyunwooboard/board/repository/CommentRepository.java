package com.hyunwoo.hyunwooboard.board.repository;

import com.hyunwoo.hyunwooboard.board.entity.Board;
import com.hyunwoo.hyunwooboard.board.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
