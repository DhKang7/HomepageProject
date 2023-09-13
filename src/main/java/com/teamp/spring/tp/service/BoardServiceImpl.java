package com.teamp.spring.tp.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamp.spring.tp.dto.BoardVO;
import com.teamp.spring.tp.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
public class BoardServiceImpl implements BoardService{

	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Override
	public ArrayList<BoardVO> getList(int currentPage) {
		log.info("�����Ͻ� ����===========");
		int limitIndex = (currentPage-1) * 5;
		return mapper.getList(limitIndex);
	}
	
	@Override
	public BoardVO read(int no) {
		mapper.upCount(no);
		return mapper.read(no);
	}
	
	@Override
	public void write(BoardVO bvo) {
		mapper.write(bvo);
	}	
}
