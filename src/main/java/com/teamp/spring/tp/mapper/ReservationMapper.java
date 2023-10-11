package com.teamp.spring.tp.mapper;

import java.util.List;
import com.teamp.spring.tp.dto.ReservationDto;

public interface ReservationMapper {
	List<ReservationDto> booklist(String R_name);

    void bookadd(ReservationDto reservationDto);

    void bookdelete(String R_name);

    void bookmodify(ReservationDto reservationDto);
}