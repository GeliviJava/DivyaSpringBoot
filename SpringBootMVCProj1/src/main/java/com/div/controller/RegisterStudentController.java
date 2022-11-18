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
	
	@PostMapping("/register")
	public String registerStudent(Map<String,Object> map, @ModelAttribute("stud") Student st) {
		
		String res = "";
		
		if(st.getTotMarks()>80f)
			res=   st.getStName()+ " got  First  Class";
		else 	if(st.getTotMarks()>60f)
			res=   st.getStName()+ " got  Second  Class";
		else 	if(st.getTotMarks()>40f)
			res=   st.getStName()+ " got  Third  Class";
		else
			res=   st.getStName()+ " got  Failed";
		
		//map.put("result", res);
		
		map.put("result", res);
			
		return "result";
	}
	
	
	
	
	

}