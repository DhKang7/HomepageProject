package com.teamp.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.teamp.jang.kiosk.KioskInsFinal;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("jang")
public class JangController {
	
	
	@RequestMapping("/Kiosk")
	public void Kisok() {
		KioskInsFinal kioskplay = new KioskInsFinal();
		kioskplay.KioskGUI();
	}
	
}
