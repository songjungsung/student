package sample.service;

import java.util.List;

import sample.dto.StudentDto;

public interface StudentService {
	public List<StudentDto> selectStudentList() throws Exception;
	public void insertStudent(StudentDto studentDto) throws Exception;
	public StudentDto selectStudentDetail(int studentIdx) throws Exception;
	void updateStudent(StudentDto studentDto) throws Exception;
	void deleteStudent(int studentIdx) throws Exception;
}
