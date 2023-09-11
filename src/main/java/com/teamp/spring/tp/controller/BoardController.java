package com.teamp.spring.tp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamp.spring.tp.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/board/*")	//������Ʈ ��Ʈ ��� ���� /guest ���������� ���� �� ����� �����ϰ� ��.  
@AllArgsConstructor	//�ʵ� ���� �Ű������� �ϴ� �����ڸ� �������� �˾Ƽ� ����� ��. �׸��� �׷� ������ �����ڸ� �߰��ϸ� �������� �˾Ƽ� ��ü���� ����(@Auto.. ó��)
@Controller
public class BoardController {

//	���� @AllArgsConstructor �̰� ����
//	�Һ����̺귯���� �Ʒ� �ڵ带 �ڵ����� ��������
	
	//
//	public GuestController(GuestService service){
//		this.service = service;
//	}
	
	private BoardService service;
	
	@GetMapping("/BoardList")	// ������Ʈ ��Ʈ ��� ���� /guest/getList url ���� �� ����� �����ϰ� ��.
	public void BoardList(Model model) {	// �Ű������� Model m ������ �ۼ��ϰ� �Ǹ�, �������� �˾Ƽ� �� ��ü�� ���� �Ѱ���.
		model.addAttribute("list",service.getList());
	}	// �� /getList �� ������ jsp������ ��. ���� ��� ����(/guest). �� PJ��Ʈ/guest/getList.jsp ������ ��.
	// �׸��� �� ������ 
	// PJ\src\main\webapp\WEB-INF\views\guest\getList.jsp
	// �� ����� ������ ��.
	
	
}