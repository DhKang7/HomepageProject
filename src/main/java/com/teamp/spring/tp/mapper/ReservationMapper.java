package com.teamp.spring.tp.mapper;

import java.util.List;
import com.teamp.spring.tp.dto.ReservationDto;

public interface ReservationMapper {
	List<ReservationDto> list(String B_name);

    void add(ReservationDto reservationDto);

    void delete(String B_name);

    void modify(ReservationDto reservationDto);
}