package com.teamp.spring.tp.controller;

import com.teamp.spring.tp.dto.ReservationVo;
import com.teamp.spring.tp.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/reservation/*")
@AllArgsConstructor
@Controller
public class ReservationController {
    private ReservationService reservationService;

    @GetMapping("/booklist")
    public void booklist(Model model) {
    	model.addAttribute("list",reservationService.booklist());
    }

    @PostMapping("/bookadd")
    public String bookadd(@RequestBody ReservationVo reservationDto) {
        reservationService.bookadd(reservationDto);
        return "redirect:/reservationMain";
    }

    @PostMapping("/bookdelete")
    public String bookdelete(@RequestParam("R_name") String R_name) {
        reservationService.bookdelete(R_name);
        return "redirect:/reservationMain";
    }

    @PostMapping("/bookmodify")
    public String bookmodify(@RequestBody ReservationVo reservationDto) {
        reservationService.bookmodify(reservationDto);
        return "redirect:/reservationMain";
    }

}
