package com.spring.scrapper.board.video;

import java.util.List;

import com.spring.scrapper.board.video.vo.VideoBoardVO;

public interface VideoBoardService {
	public List<VideoBoardVO> getBoardList() throws Exception;
	
	public VideoBoardVO getBoard(int postId) throws Exception;
	
	public boolean createBoard(VideoBoardVO boardVO) throws Exception;
	
	public boolean updateBoard(VideoBoardVO boardVO) throws Exception;
	
	public boolean deleteBoard(int postId) throws Exception;
	
}
