package com.teamp.spring.tp.controller;

import com.teamp.spring.tp.dto.ReservationDto;

import com.teamp.spring.tp.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Controller
@RequestMapping("/reservation/*")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/list")
    public ModelAndView booklist(@RequestParam String R_name) {
        List<ReservationDto> reservations = reservationService.booklist(R_name);
        ModelAndView modelAndView = new ModelAndView("reservationList");
        modelAndView.addObject("reservations", reservations);
        return modelAndView;
    }

    @PostMapping("/add")
    public String bookadd(@RequestBody ReservationDto reservationDto) {
        reservationService.bookadd(reservationDto);
        return "redirect:/reservation/list?R_name=" + reservationDto.getR_name();
    }

    @PostMapping("/delete")
    public String bookdelete(@RequestParam String R_name) {
        reservationService.bookdelete(R_name);
        return "redirect:/reservation/list?R_name=" + R_name;
    }

    @PostMapping("/modify")
    public String bookmodify(@RequestBody ReservationDto reservationDto) {
        reservationService.bookmodify(reservationDto);
        return "redirect:/reservation/list?R_name=" + reservationDto.getR_name();
    }
}
