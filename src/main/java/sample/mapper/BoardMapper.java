package sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sample.dto.BoardDto;

@Mapper
public interface BoardMapper {
	List<BoardDto> selectBoardList() throws Exception;
	void insertBoard(BoardDto boardDto) throws Exception;
	void updateHitCount(int boardIdx) throws Exception;
	BoardDto selectBoardDetail(int boardIdx) throws Exception;
	void updateBoard(BoardDto boardDto) throws Exception;
	void deleteBoard(int boardIdx) throws Exception;
}
