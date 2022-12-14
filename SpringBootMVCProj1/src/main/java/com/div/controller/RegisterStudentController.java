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
		
		//dev3commit1
		//dev1commit2
		String res = "";
		if(st.getTotMarks()>80f)
			res=   st.getStName()+ "D";
		else 	if(st.getTotMarks()>60f)
			res=   st.getStName()+ "I";
		else 	if(st.getTotMarks()>40f)
			res=   st.getStName()+ "V";
		else
			res=   st.getStName()+ "Y";
		
		//map.put("result", res);
		
		map.put("result", res);
			
		return "result";
	}
	
	
	
	
	

}