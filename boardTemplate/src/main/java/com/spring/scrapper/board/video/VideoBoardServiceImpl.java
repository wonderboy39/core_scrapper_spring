package com.spring.scrapper.board.video;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.scrapper.board.video.vo.VideoBoardVO;

@Service
public class VideoBoardServiceImpl implements VideoBoardService{

	@Inject
	private VideoBoardDAO videoBoardDAO;
	
	@Override
	public List<VideoBoardVO> getBoardList() throws Exception {
		return videoBoardDAO.selectVideoBoardList();
	}

	@Override
	public VideoBoardVO getBoard(int postId) throws Exception {
		return videoBoardDAO.selectVideoBoard(postId);
	}

	@Override
	public boolean createBoard(VideoBoardVO boardVO) throws Exception {
		return videoBoardDAO.insertIntoVideoBoard(boardVO);
	}

	@Override
	public boolean updateBoard(VideoBoardVO boardVO) throws Exception {
		return videoBoardDAO.updateVideoBoard(boardVO);
	}

	@Override
	public boolean deleteBoard(int postId) throws Exception {
		return videoBoardDAO.deleteVideoBoard(postId);
	}
}
