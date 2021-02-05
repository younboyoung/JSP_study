package com.spring.test.service;

import javax.servlet.http.HttpSession;
import java.util.List;

import com.spring.test.domain.BoardVO;

public interface BoardService {
		
		// �� ��� ��ȸ
		List<BoardVO> getBoardList();
		
		public BoardVO login(BoardVO vo) throws Exception;
		
		// �� �� ��ȸ
		BoardVO getContent(BoardVO vo);
		
		//id ã��
		BoardVO findIdBoard(BoardVO vo);
		
		//�н����� ã��
		BoardVO findPwBoard(BoardVO vo);
				
		// �� ���
		void insertBoard(BoardVO vo);

		// �� ����
		void updateBoard(BoardVO vo);

		// �� ����
		void deleteBoard(BoardVO vo);
}
