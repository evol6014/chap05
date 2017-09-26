package com.example.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.DeptVO;
import com.example.domain.EmpVO;
import com.example.repository.DeptRepository;
import com.example.repository.EmpRepository;

import lombok.extern.java.Log;

@Controller
@RequestMapping("/emp")
@Log
public class EmpController {

	@Inject
	EmpRepository empRepository;
	
//	@GetMapping("/list")
//	public String list(Model model) {
//		log.info("/emp/list 호출됨");
//		
//		List<EmpVO> emps = empRepository.findAll();
//		emps.forEach(e -> System.out.println(e));
//		model.addAttribute("emps", emps);
//		
//		return "jsp/emp/list";
//	}
	
	@GetMapping("/list2")
	public String list2(Model model) {
		log.info("/dept/list2 호출됨");
		
		List<EmpVO> emps = empRepository.findAll();
		emps.forEach(e -> System.out.println(e));
		model.addAttribute("emps", emps);
		
		return "thymeleaf/emp/list";
	}
}






