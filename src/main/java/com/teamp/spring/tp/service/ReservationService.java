package com.teamp.spring.tp.service;

import com.teamp.spring.tp.dto.ReservationVo;

import java.util.ArrayList;

public interface ReservationService {
    ArrayList<ReservationVo> booklist();

    void bookadd(String R_date, String R_name, String R_hospital_name);

    void bookdelete(String R_name);

    void bookmodify(String R_date, String R_name, String R_hospital_name);
}
