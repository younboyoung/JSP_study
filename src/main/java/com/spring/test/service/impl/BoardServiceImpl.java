package com.spring.test.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.test.dao.BoardDAO;
import com.spring.test.domain.BoardVO;
import com.spring.test.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public BoardVO login(BoardVO vo) throws Exception {
		return boardDAO.login(vo);
	}
	
	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}

	@Override
	public BoardVO getContent(BoardVO vo) {
		return boardDAO.getContent(vo);
	}
	
	@Override
	public BoardVO findIdBoard(BoardVO vo) {
		return boardDAO.findIdBoard(vo);
	}
	
	@Override
	public BoardVO findPwBoard(BoardVO vo){
		return boardDAO.findPwBoard(vo);
	}

	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}

}
