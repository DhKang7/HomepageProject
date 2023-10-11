package com.teamp.spring.tp.controller;

import com.teamp.spring.tp.dto.ReservationDto;
import com.teamp.spring.tp.service.ReservationService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@AllArgsConstructor
@RequestMapping("/reservation/*")
@Controller
public class ReservationController {
    private ReservationService reservationService;

    @GetMapping("/booklist")
    public ModelAndView booklist(@RequestParam String R_name) {
        List<ReservationDto> reservations = reservationService.booklist(R_name);
        ModelAndView modelAndView = new ModelAndView("reservationList");
        modelAndView.addObject("reservations", reservations);
        return modelAndView;
    }

    @PostMapping("/bookadd")
    public String bookadd(@RequestBody ReservationDto reservationDto) {
        reservationService.bookadd(reservationDto);
        return "redirect:/reservation/booklist?R_name=" + reservationDto.getR_name();
    }

    @PostMapping("/bookdelete")
    public String bookdelete(@RequestParam String R_name) {
        reservationService.bookdelete(R_name);
        return "redirect:/reservation/booklist?R_name=" + R_name;
    }

    @PostMapping("/bookmodify")
    public String bookmodify(@RequestBody ReservationDto reservationDto) {
        reservationService.bookmodify(reservationDto);
        return "redirect:/reservation/booklist?R_name=" + reservationDto.getR_name();
    }

}
