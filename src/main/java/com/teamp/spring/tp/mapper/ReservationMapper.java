package com.teamp.spring.tp.mapper;

import java.util.ArrayList;
import com.teamp.spring.tp.dto.ReservationVo;

public interface ReservationMapper {
    ArrayList<ReservationVo> booklist();

    void bookadd(String R_date, String R_name, String R_hospital_name);

    void bookdelete(String R_name);

    void bookmodify(ReservationVo reservationDto);
}
