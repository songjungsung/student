package sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import sample.dto.StudentDto;
import sample.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/student/openStudentList.do")
	public ModelAndView openStudentList() throws Exception {
		ModelAndView mv = new ModelAndView("/student/studentList");
		
		List<StudentDto> list = studentService.selectStudentList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping("/student/openStudentWrite.do")
	public String openStuentWrite() throws Exception {
		return "/student/studentWrite";
	}
	
	@RequestMapping("/student/insertStudent.do")
	public String insertStudent(StudentDto studentDto) throws Exception {
		studentService.insertStudent(studentDto);
		return "redirect:/student/openStudentList.do";
	}
	

	@GetMapping("/student/openStudentDetail.do")
	public ModelAndView openStudentDetail(@RequestParam int studentIdx) throws Exception {
		ModelAndView mv = new ModelAndView("/student/studentDetail");
		
		StudentDto studentDto = studentService.selectStudentDetail(studentIdx);
		mv.addObject("student", studentDto);
		
		return mv;
	}
	
	@PostMapping("/student/updateStudent.do")
	public String updateStudent(StudentDto studentDto) throws Exception {
		studentService.updateStudent(studentDto);
		return "redirect:/student/openStudentList.do";
	}
	
	@PostMapping("/student/deleteStudent.do")
	public String deleteStudent(StudentDto studentDto) throws Exception {
		studentService.deleteStudent(studentDto.getStudentIdx());
		return "redirect:/student/openStudentList.do";
	}
}
