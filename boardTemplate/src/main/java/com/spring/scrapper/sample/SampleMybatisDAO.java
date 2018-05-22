package com.spring.scrapper.sample;

import java.util.List;

import com.spring.scrapper.sample.vo.SampleMybatisVO;

public interface SampleMybatisDAO {
	public List<SampleMybatisVO> selectAllData();
}
