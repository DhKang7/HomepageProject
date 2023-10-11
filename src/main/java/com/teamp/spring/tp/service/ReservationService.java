package com.teamp.spring.tp.service;

import com.teamp.spring.tp.dto.ReservationVo;

import java.util.ArrayList;
import java.util.List;


public interface ReservationService {
    public ArrayList<ReservationVo> booklist();

    public void bookadd(ReservationVo reservationDto);

    public void bookdelete(String R_name);

    public void bookmodify(ReservationVo reservationDto);
}
