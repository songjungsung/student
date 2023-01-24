package sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sample.dto.StudentDto;

@Mapper
public interface StudentMapper {
	List<StudentDto> selectStudentList() throws Exception;
	void insertStudent(StudentDto studentDto) throws Exception;
	StudentDto selectStudentDetail(int studentIdx) throws Exception;
	void updateStudent(StudentDto studentDto) throws Exception;
	void deleteStudent(int studentIdx) throws Exception;	
}
