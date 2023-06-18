package com.hyunwoo.hyunwooboard.board.service;

import com.hyunwoo.hyunwooboard.board.controller.request.BoardRequest;
import com.hyunwoo.hyunwooboard.board.dto.BoardDTO;
import com.hyunwoo.hyunwooboard.board.entity.Board;
import com.hyunwoo.hyunwooboard.board.repository.BoardRepository;
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
public class BoardService {

    private final BoardRepository boardRepository;

    @Transactional(readOnly = true)
    public List<BoardDTO> findAll() {
        List<Board> list = boardRepository.findAll();
        return BoardDTO.fromList(list);
    }

    @Transactional(readOnly = true)//빠르게 하는것
    public BoardDTO findOne(final long id) {
        final Optional<Board> item= boardRepository.findById(id);
        return BoardDTO.from(item.get());
    }


    @Transactional
    public void save(BoardRequest request) {
        Board board = Board.from(request);
        boardRepository.save(board);
    }

    @Transactional
    public void update(BoardRequest request, final long id) {
        Optional<Board> board = boardRepository.findById(id);
        board.get().update(request);
    }

}
