package sample.dto;

import lombok.Data;

@Data
public class BoardDto {
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String createdDt;
	private String createdId;
	private String updatedDt;
	private String updatedId;
}
