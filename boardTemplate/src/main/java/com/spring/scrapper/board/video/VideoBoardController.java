package com.spring.scrapper.board.video;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VideoBoardController {
	@Inject
	private SqlSession sqlSession;
	
	@RequestMapping(value="/video/list",  method=RequestMethod.GET)
	public ModelAndView getBoardList(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/scrapper/video/list");
		// service -> dao
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.GET)
	public ModelAndView getBoard(@RequestParam(required=false) int postId){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/scrapper/video/list");
		// postId...
		// service -> dao
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.PUT)
	public ModelAndView modifyBoard(@PathVariable int postId, Model model){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/scrapper/video/list");
		// service -> dao
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.POST)
	public ModelAndView createBoard(@PathVariable int postId){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/scrapper/video/list");
		// service -> dao
		return mav;
	}
	
	@RequestMapping(value="/video", method=RequestMethod.DELETE)
	public ModelAndView deleteBoard(@PathVariable int postId){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/scrapper/video/list");
		// service -> dao
		return mav;
	}
}
