package sample.service;

import java.util.List;

import sample.dto.BoardDto;

public interface BoardService {
	public List<BoardDto> selectBoardList() throws Exception;
	public void insertBoard(BoardDto boardDto) throws Exception;
	public BoardDto selectBoardDetail(int boardIdx) throws Exception;
	void updateBoard(BoardDto boardDto) throws Exception;
	void deleteBoard(int boardIdx) throws Exception;
}
