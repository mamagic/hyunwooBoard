//package com.hyunwoo.hyunwooboard.board.dto;
//
//import com.hyunwoo.hyunwooboard.board.entity.Board;
//import com.hyunwoo.hyunwooboard.board.entity.Comment;
//import lombok.AccessLevel;
//import lombok.Builder;
//import lombok.Getter;
//
//import java.util.List;
//import java.util.stream.Collectors;
//
///** DTO(Data Transfer Object) : 데이터를 객체에게 전달 */
//@Getter
//public class CommentDTO {
//
//      String writer;
//      String contents;
//      Board board;
//      Long boardId;
//      Long parentId;
//      List<Comment> child;
//
//    @Builder(access = AccessLevel.PRIVATE)
//    private CommentDTO(String writer, String contents, Board board, Long boardId, Long parentId, List<Comment> child) {
//        this.writer = writer;
//        this.contents = contents;
//        this.board = board;
//        this.boardId = boardId;
//        this.parentId = parentId;
//        this.child = child;
//    }
//
//    public static List<CommentDTO> fromList(List<Comment> list) {
//        return list.stream()
//                .map(CommentDTO::from)
//                .collect(Collectors.toList());
//    }
//
//    public static CommentDTO from(Comment comment) {
//        return CommentDTO.builder()
//                .writer(comment.getWriter())
//                .contents(comment.getContents())
//                .board(comment.getBoard())
//                .boardId(comment.getBoardId())
//                .parentId(comment.getParentId())
//                .child(comment.getChild())
//                .build();
//    }
//
//}
