package com.spring.scrapper.board.video;

import java.util.List;

import com.spring.scrapper.board.video.vo.VideoBoardVO;

public interface VideoBoardDAO {
	public List<VideoBoardVO> selectVideoBoardList() throws Exception;
	
	public VideoBoardVO selectVideoBoard(int postId) throws Exception;
	
	public boolean insertIntoVideoBoard(VideoBoardVO boardVO) throws Exception;
	
	public boolean updateVideoBoard(VideoBoardVO boardVO) throws Exception;
	
	public boolean deleteVideoBoard(int postId) throws Exception;
}
