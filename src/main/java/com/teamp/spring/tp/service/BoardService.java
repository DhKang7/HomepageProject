package com.teamp.spring.tp.service;

import java.util.ArrayList;

import com.teamp.spring.tp.dto.BoardVO;
import com.teamp.spring.tp.dto.PagingVO;


public interface BoardService {
	public ArrayList<BoardVO> getList(PagingVO pvo);
	public BoardVO read(int no);
	public void write(BoardVO bvo);
	public void delete(int no);
	public void edit(BoardVO bvo);
	public int countBoard();
}
