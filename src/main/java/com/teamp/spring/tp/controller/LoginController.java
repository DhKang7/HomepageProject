package com.teamp.spring.tp.controller;



import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


import com.teamp.spring.tp.controller.LoginController;
import com.teamp.spring.tp.dto.UserInfo;
import com.teamp.spring.tp.service.LoginService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/Login/*")
@AllArgsConstructor
@Controller
public class LoginController {
	private LoginService service;
	

	@PostMapping("/createID")
	public String createID(UserInfo id) {
		log.info("아이디 만드는 중.");
		service.createID(id);
		log.info("아이디를 만들었음");
		return "redirect:/";
	}
	@GetMapping("/createID")
	public void createID() {
	}
	@GetMapping("/test")
	public void test() {
		log.info("testest");
	}
	@PostMapping("loginCheck")
	public String loginCheck(UserInfo id,HttpSession session,RedirectAttributes redirectAttributes) {
		boolean loginSuccess;
		if(service.loginCheck(id)== 1) {
			loginSuccess = true;
		} else {
			loginSuccess = false;
		}
		if(loginSuccess) {
			session.setAttribute("id",id.getU_ID());
			return "redirect:/Login/getInfo";
		} else {
			redirectAttributes.addFlashAttribute("message", "로그인 실패, 아이디또는 비밀번호가 일치하지 않습니다");
			return "redirect:/";
		}
	}
	@GetMapping("/getInfo")
	public String getInfo(HttpSession session) {
		String id= (String) session.getAttribute("id");
		log.info(id);
		UserInfo userInfo = service.getInfo(id);
		session.setAttribute("U_NO",userInfo.getU_NO());
		session.setAttribute("U_NAME",userInfo.getU_NAME());
		session.setAttribute("U_ADDRESS",userInfo.getU_ADDRESS());
		session.setAttribute("U_EMAIL",userInfo.getU_EMAIL());
		session.setAttribute("U_PHONE",userInfo.getU_PHONE()); //
		session.setAttribute("U_POINT",userInfo.getU_POINT());
		session.setAttribute("U_TIMESTAMP",userInfo.getU_TIMESTAMP());
		log.info("U_TIMESTAMP는 :"+ session.getAttribute("U_TIMESTAMP"));
		return "redirect:/";
	}
	@GetMapping("/editInfo")
	public void editInfo() {
	}
	@PostMapping("/editInfo")
	public String editInfo(UserInfo id) {
		log.info(id.getU_ID()+"의 정보를 수정했습니다.");
		service.editInfo(id);
		return "redirect:/";
	}
	@GetMapping("/editPw")
	public void editPw() {
	}
	@PostMapping("/editPw")
	public String editPw(UserInfo id) {
		log.info(id.getU_ID()+id.getU_PW());
		service.editPw(id);
		return "redirect:/";
	}
	
	@PostMapping("/logOut")
	public String logout(HttpSession session) {
		session.removeAttribute("id");
		return "redirect:/";
	}
	@PostMapping("/checkID")
	@ResponseBody // 이 어노테이션을 추가하여 JSON 응답을 생성
	public Map<String, Boolean> checkID(String C_ID) {
		log.info("검색할 아이디 : "+C_ID);
		int howmany = service.checkID(C_ID);
		log.info("검색된 아이디 갯수는 "+howmany);
	    Map<String, Boolean> response = new HashMap<>();
	    if (howmany == 0) {
	        response.put("valid", true);
	        log.info("valid를 true로");
	    } else {
	        response.put("valid", false);
	        log.info("valid를 false로");
	    }
	    return response;
	}
	
}
