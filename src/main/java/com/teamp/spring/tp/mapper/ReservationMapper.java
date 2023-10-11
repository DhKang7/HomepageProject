package com.teamp.spring.tp.mapper;

import java.util.ArrayList;
import java.util.Date;

import com.teamp.spring.tp.dto.ReservationVo;

public interface ReservationMapper {
    ArrayList<ReservationVo> booklist();

    void bookadd(Date R_date, String R_name, String R_hospital_name);

    void bookdelete(String R_name);

    void bookmodify(ReservationVo reservationDto);

    void bookmodify(Date R_date, String R_name, String R_hospital_name);

}
 