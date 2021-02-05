package com.spring.test.controller;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.annotation.Resource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import javax.inject.Inject;
import com.spring.test.domain.BoardVO;
import com.spring.test.service.BoardService;
import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Controller
@SessionAttributes("/Board")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class); 
	@Autowired
	private BoardService boardService;
	
	//회원가입 성공화면 가기
	@RequestMapping(value= "/login.do", method = RequestMethod.POST)
	public String login(BoardVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception{
		logger.info("post login");
		
		HttpSession session = req.getSession();
		
		BoardVO login = boardService.login(vo);
		
		if(login == null) {
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
		}else {
			session.setAttribute("member", login);
		}
		
		return "redirect:/";
	}
	
	@RequestMapping("/loginback.do") 
	public String loginback() throws Exception{
		return "login";
	}
	
	@RequestMapping(value = "/GoFindId.do")
	public String GofindId() throws Exception{
		return "findId";
	}
	
	@RequestMapping(value = "/FindId.do", method = RequestMethod.POST)
	public String findId(BoardVO vo, Model model) {
		
		BoardVO user = boardService.findIdBoard(vo);
		
		if(user == null) {
			model.addAttribute("check", 1);
		}else {
			model.addAttribute("check", 0);
			model.addAttribute("id", user.getId());
		}
		
		return "findId";
	}
	
	@RequestMapping(value = "/GoFindPassword.do")
	public String GoFindPassword() throws Exception{
		return "findPassword";
	}
	
	@RequestMapping(value = "/FindPassword.do", method = RequestMethod.POST)
	public String FindPassword(BoardVO vo, Model model) {
		
		BoardVO user = boardService.findPwBoard(vo);
		
		if(user == null) {
			model.addAttribute("check", 1);
		}else {
			model.addAttribute("check", 0);
			model.addAttribute("pw", user.getPw());
		}
		
		return "findPassword";
	}
	
	@RequestMapping(value = "/logout.do", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		session.invalidate();
		
		return "redirect:/";
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(BoardVO vo, Model model) {
		 List<BoardVO> boardList = boardService.getBoardList();
		 
		// Model 정보 저장
		model.addAttribute("boardList",boardList);
		return "boardList"; // View 이름 리턴
	}

	// 글 상세 조회
	@RequestMapping("/getContent.do")
	public String getBoard(BoardVO vo, Model model) {
		model.addAttribute("board", boardService.getContent(vo)); // Model 정보 저장
		return "content"; // View 이름 리턴
	}
	
	// 회원정보 등록
	@RequestMapping(value="/insertBoard.do") 
	public String insertBoard(BoardVO vo) throws IOException { 
			boardService.insertBoard(vo); 
			return "login"; 
	}
	
	// 글 쓰기 페이지 이동
	@RequestMapping("/moveInsertBoard.do") 
	public String moveInsertBoard()throws Exception{
		return "insertBoard";
	}
	
	// 글 수정 페이지로 이동
	@RequestMapping(value = "/updateBoardView.do")
	public String updateBoardView() throws Exception{

		return "updateBoardView";
	}
	 
	// 글 수정
	@RequestMapping(value = "/updateBoard.do", method = RequestMethod.POST)
	public String updateBoard(HttpSession session, BoardVO vo ) throws Exception{
		boardService.updateBoard(vo);
		
		return "login";
	}

	// 글 삭제
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(BoardVO vo,HttpSession session) {
		boardService.deleteBoard(vo);
		session.invalidate();
		return "login";
	}
}
