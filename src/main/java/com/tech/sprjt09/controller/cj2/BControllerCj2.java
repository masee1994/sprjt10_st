package com.tech.sprjt09.controller.cj2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.sprjt09.service.cj1.BServiceInter;
import com.tech.sprjt09.service.cj2.BWriteService;

@Controller
public class BControllerCj2 {
	
	BServiceInter bServiceInter;

	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");

		return "write_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
//		�۾��� ����
////		toss
<<<<<<< HEAD
		model.addAttribute("request",request);
		bServiceInter=new BWriteService();
		bServiceInter.execute(model);
=======
		
//		tom1 comment2
//		2 tom1 comment
//		model.addAttribute("request",request);
//		bServiceInter=new BWriteService();
//		bServiceInter.execute(model);
>>>>>>> release/tom1

		return "redirect:list";
	}
//tom2

}
