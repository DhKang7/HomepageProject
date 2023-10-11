package com.teamp.spring.tp.service;

import com.teamp.spring.tp.dto.ReservationDto;
import com.teamp.spring.tp.mapper.LoginMapper;
import com.teamp.spring.tp.mapper.ReservationMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Log4j
@Service
public class ReservationServiceImpl implements ReservationService {
	@Setter(onMethod_ = @Autowired)
	private ReservationMapper reservationMapper;	
    @Autowired
    public ReservationServiceImpl(ReservationMapper reservationMapper) {
        this.reservationMapper = reservationMapper;
    }

    @Override
    public List<ReservationDto> booklist(String R_name) {
        return reservationMapper.booklist(R_name);
    }

    @Override
    public void bookadd(ReservationDto reservationDto) {
        reservationMapper.bookadd(reservationDto);
    }

    @Override
    public void bookdelete(String R_name) {
        reservationMapper.bookdelete(R_name);
    }

    @Override
    public void bookmodify(ReservationDto reservationDto) {
        reservationMapper.bookmodify(reservationDto);
    }
}
