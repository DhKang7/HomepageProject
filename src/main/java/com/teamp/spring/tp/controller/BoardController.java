package com.teamp.spring.tp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.teamp.spring.tp.dto.BoardVO;
import com.teamp.spring.tp.dto.PagingVO;
import com.teamp.spring.tp.service.BoardService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/board/*") // ������Ʈ ��Ʈ ��� ���� /guest ���������� ���� �� ����� �����ϰ� ��.
@AllArgsConstructor // �ʵ� ���� �Ű������� �ϴ� �����ڸ� �������� �˾Ƽ� ����� ��. �׸��� �׷� ������ �����ڸ� �߰��ϸ� �������� �˾Ƽ� ��ü����
					// ����(@Auto.. ó��)
@Controller
public class BoardController {

//	���� @AllArgsConstructor �̰� ����
//	�Һ����̺귯���� �Ʒ� �ڵ带 �ڵ����� ��������

	//
//	public GuestController(GuestService service){
//		this.service = service;
//	}

	private BoardService service;

	@GetMapping("/sessiontest")
	public String sessiontest(HttpSession session, @RequestParam(value = "id", defaultValue = "testid") String id) {
		session.setAttribute("id", id);
		
		return "redirect:/board/BoardList";
	}
	
	@GetMapping("/BoardList")
	public void BoardList(HttpSession session, @RequestParam(value = "currentPage", defaultValue = "1") int currentPage,
							@RequestParam(value = "category", defaultValue = "main") String category,
										Model model) {
		if(category.equals("main")){
			int total = service.countBoard();
			PagingVO pvo = new PagingVO(total, currentPage, 10);
			model.addAttribute("category", category);
			model.addAttribute("paging", pvo);
			model.addAttribute("list", service.getList(pvo));
		}else {
			int total = service.countBoardCategory(category);
			PagingVO pvo = new PagingVO(total, currentPage, 10, category);
			model.addAttribute("category", category);
			model.addAttribute("paging", pvo);
			model.addAttribute("list", service.getListCategory(pvo));
		}
	}

	@GetMapping("/BoardRead")
	public void BoardRead(HttpSession session, @RequestParam("no") int no, Model model) {
		service.upCount(no);
		log.info("��Ʈ�ѷ� ==== �۹�ȣ ===============" + no);
		model.addAttribute("read", service.read(no));
	}

	@PostMapping("/BoardWrite")
	public String BoardWrite(BoardVO bvo) {
		service.write(bvo);
		return "redirect:/board/BoardList"; // sendRedirect �� �̵��ϰ� ��. // å p.245 ����
	}


	@GetMapping("/BoardWrite") // /write �ߺ������� �̰� �۾��� ȭ���� ���� url ����
	public void BoardWrite(HttpSession session) {

	}

	@GetMapping("/BoardDelete")
	public String BoardDelete(@RequestParam("no") int no) {
		service.delete(no);
		return "redirect:/board/BoardList";
	}
	
	@PostMapping("/BoardEdit") 
	public String BoardEdit(BoardVO bvo) {
		service.edit(bvo);
		log.info("edit complete");
		return "redirect:/board/BoardList";
	}
	 
	@GetMapping("/BoardEdit")
	public void BoardEdit(@RequestParam("no") int no, Model model) {
		log.info("��Ʈ�ѷ� ==== �۹�ȣ ===============" + no);
		model.addAttribute("read", service.read(no));
	}
}