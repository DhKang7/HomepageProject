package com.teamp.spring.tp.service;

import com.teamp.spring.tp.dto.ReservationDto;

import java.util.List;


public interface ReservationService {
    List<ReservationDto> booklist(String R_name);

    void bookadd(ReservationDto reservationDto);

    void bookdelete(String R_name);

    void bookmodify(ReservationDto reservationDto);
}
