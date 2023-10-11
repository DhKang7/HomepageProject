package com.teamp.spring.tp.mapper;

import java.util.ArrayList;
import java.util.List;
import com.teamp.spring.tp.dto.ReservationVo;

public interface ReservationMapper {
	public ArrayList<ReservationVo> booklist();

    void bookadd(ReservationVo reservationDto);

    public void bookdelete(String R_name);

    void bookmodify(ReservationVo reservationDto);
}