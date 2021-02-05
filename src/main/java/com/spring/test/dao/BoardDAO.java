package com.spring.test.dao;

import java.util.List;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;
import com.spring.test.domain.BoardVO;

@Repository
public class BoardDAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	private static String namespace ="BoardMapper";
	
	@Inject
	SqlSession sqlSession;
	
	
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 insertBoard() 기능 처리");
		mybatis.insert("BoardMapper.insertBoard", vo);
	}
	
	public BoardVO login(BoardVO vo) throws Exception{
		return (BoardVO) mybatis.selectOne(namespace + ".login", vo);
	}
	
	public BoardVO findIdBoard(BoardVO vo) {
		return (BoardVO) mybatis.selectOne("BoardMapper.findIdBoard", vo);
	}
	
	public BoardVO findPwBoard(BoardVO vo)  {
		return (BoardVO) mybatis.selectOne("BoardMapper.findPwBoard", vo);
	}

	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 updateBoard() 기능 처리");
		mybatis.update("BoardMapper.updateBoard", vo);
	}

	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 deleteBoard() 기능 처리");
		mybatis.delete("BoardMapper.deleteBoard", vo);
	}

	public BoardVO getContent(BoardVO vo) {
		System.out.println("===> Mybatis로 getContent() 기능 처리");
		return (BoardVO) mybatis.selectOne("BoardMapper.getContent", vo);
	}

	public List<BoardVO> getBoardList() {
		System.out.println("===> Mybatis로 getBoardList() 기능 처리");
		return mybatis.selectList("BoardMapper.getBoardList");
	}
}