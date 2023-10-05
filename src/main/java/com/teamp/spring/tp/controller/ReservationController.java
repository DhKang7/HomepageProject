package com.teamp.spring.tp.controller;

import com.teamp.spring.tp.dto.ReservationDto;
import com.teamp.spring.tp.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/list")
    public ModelAndView list(@RequestParam String B_name) {
        List<ReservationDto> reservations = reservationService.list(B_name);
        ModelAndView modelAndView = new ModelAndView("your_jsp_file_name"); // 여기서 "your_jsp_file_name"은 실제 JSP 파일 이름으로 변경해야 합니다.
        modelAndView.addObject("reservations", reservations);
        return modelAndView;
    }

    @PostMapping("/add")
    public void add(@RequestBody ReservationDto reservationDto) {
        reservationService.add(reservationDto);
    }

    @PostMapping("/delete")
    public void delete(@RequestParam String B_name) {
        reservationService.delete(B_name);
    }

    @PostMapping("/modify")
    public void modify(@RequestBody ReservationDto reservationDto) {
        reservationService.modify(reservationDto);
    }
}
