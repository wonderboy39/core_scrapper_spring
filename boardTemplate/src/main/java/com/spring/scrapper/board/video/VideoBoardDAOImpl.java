package com.spring.scrapper.board.video;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.spring.scrapper.board.video.vo.VideoBoardVO;

@Repository
public class VideoBoardDAOImpl implements VideoBoardDAO{

	@Inject
	private SqlSession sqlSession;
	
	@Override
	public List<VideoBoardVO> selectVideoBoardList() throws Exception {
		List<VideoBoardVO> resultList= sqlSession.selectList("com.spring.scrapper.board.video.selectVideoBoardList");
		return resultList;
	}

	@Override
	public VideoBoardVO selectVideoBoard(int postId) throws Exception {
		Map<String, Object> parameterMap = new HashMap<>();
		parameterMap.put("postId", postId);
		VideoBoardVO boardVO = sqlSession.selectOne("com.spring.scrapper.board.video.selectVideoBoard", parameterMap);
		return boardVO;
	}

	@Override
	public boolean insertIntoVideoBoard(VideoBoardVO boardVO) throws Exception {
		return sqlSession.insert("com.spring.scrapper.board.video.insertIntoVideoBoard", boardVO) >0 ? true : false;
	}

	@Override
	public boolean updateVideoBoard(VideoBoardVO boardVO) throws Exception {
		return sqlSession.update("com.spring.scrapper.board.video.updateVideoBoard", boardVO) >0 ? true : false;
	}

	@Override
	public boolean deleteVideoBoard(int postId) throws Exception {
		Map<String, Object> parameterMap = new HashMap<>();
		parameterMap.put("postId", postId);
		return sqlSession.delete("com.spring.scrapper.board.video.deleteVideoBoard", parameterMap) >0 ? true : false;
		
	}
	
}
