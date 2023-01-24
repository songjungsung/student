package sample.dto;

import lombok.Data;

@Data
public class StudentDto {
	private int studentIdx;
	private String studentName;
	private String specialty;
	private String email;
	private String registDt;
	private String registId;
}
