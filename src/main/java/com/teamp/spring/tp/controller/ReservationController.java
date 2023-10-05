package com.teamp.spring.tp.controller;

import com.teamp.spring.tp.dto.ReservationDto;
import com.teamp.spring.tp.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<ReservationDto> list(@RequestParam String B_name) {
        return reservationService.list(B_name);
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
