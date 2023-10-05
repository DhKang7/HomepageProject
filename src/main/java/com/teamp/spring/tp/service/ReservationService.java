package com.teamp.spring.tp.service;

import com.teamp.spring.tp.dto.ReservationDto;

import java.util.List;

public interface ReservationService {
    List<ReservationDto> list(String B_name);

    void add(ReservationDto reservationDto);

    void delete(String B_name);

    void modify(ReservationDto reservationDto);
}
