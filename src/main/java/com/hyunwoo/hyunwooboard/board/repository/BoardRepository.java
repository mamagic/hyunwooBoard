package com.hyunwoo.hyunwooboard.board.repository;

import com.hyunwoo.hyunwooboard.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
