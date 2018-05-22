package com.spring.scrapper.board.video;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.scrapper.board.video.vo.VideoBoardVO;

@Controller
public class VideoBoardController {
	@Inject
	private SqlSession sqlSession;
	
	@Inject
	private VideoBoardService videoService;
	
	@RequestMapping(value="/video/list",  method=RequestMethod.GET)
	public ModelAndView getBoardList(){
		ModelAndView mav = new ModelAndView();
		// service -> dao
		List<VideoBoardVO> videoList = null;
		try {
			videoList = videoService.getBoardList();
			mav.setViewName("/scrapper/video/list");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.GET)
	public ModelAndView getBoard(@RequestParam(required=false) int postId){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/scrapper/video/board");
		// postId...
		// service -> dao
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.GET)
	public ModelAndView modifyBoardGet(@PathVariable int postId, Model Model){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/scrapper/video/updateBoard");
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.PUT)
	public ModelAndView modifyBoard(@PathVariable int postId, Model model){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/scrapper/video/board");
		// service -> dao
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.POST)
	public ModelAndView createBoard(@PathVariable int postId){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/scrapper/video/list");
		// service -> dao
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.DELETE)
	public ModelAndView deleteBoard(@PathVariable int postId){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/scrapper/video/list");
		// service -> dao
		return mav;
	}
}
