/**
 * 
 */
package com.div.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.div.model.Student;

/**
 * @author Admini
 *
 */
@Controller
public class RegisterStudentController {

	@GetMapping("/")
	public String welcomePage(){
		return "welcome";
	}
	
	
	@GetMapping("/register")
	public String registerStudentFormLaunch() {
		System.out.println("RegisterStudentController.registerStudentFormLaunch()");
		return "register";
	}
	
	@PostMapping("/registerDev1")
	public String registerDev1Student(Map<String,Object> map, @ModelAttribute("stud") Student st) {
		
		//dev1commit1
		String res = "";
		if(st.getTotMarks()>80f)
			res=   st.getStName()+ " 1";
		else 	if(st.getTotMarks()>60f)
			res=   st.getStName()+ " 2";
		else 	if(st.getTotMarks()>40f)
			res=   st.getStName()+ " 3";
		else
			res=   st.getStName()+ " 0";
		
		//map.put("result", res);
		
		map.put("result", res);
			
		return "result";
	}
	
	
	
	
	

}