package com.spring.test.service;

import javax.servlet.http.HttpSession;
import java.util.List;

import com.spring.test.domain.BoardVO;

public interface BoardService {
		
		// 글 목록 조회
		List<BoardVO> getBoardList();
		
		public BoardVO login(BoardVO vo) throws Exception;
		
		// 글 상세 조회
		BoardVO getContent(BoardVO vo);
		
		//id 찾기
		BoardVO findIdBoard(BoardVO vo);
		
		//패스워드 찾기
		BoardVO findPwBoard(BoardVO vo);
				
		// 글 등록
		void insertBoard(BoardVO vo);

		// 글 수정
		void updateBoard(BoardVO vo);

		// 글 삭제
		void deleteBoard(BoardVO vo);
}
