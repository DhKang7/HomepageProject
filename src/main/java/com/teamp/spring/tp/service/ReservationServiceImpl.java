package com.teamp.spring.tp.service;

import com.teamp.spring.tp.dto.ReservationVo;
import com.teamp.spring.tp.mapper.ReservationMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Log4j
@Service
public class ReservationServiceImpl implements ReservationService {
	@Setter(onMethod_ = @Autowired)
	private ReservationMapper reservationMapper;	

    @Override
    public ArrayList<ReservationVo> booklist() {
        return reservationMapper.booklist();
    }

    @Override
    public void bookadd(ReservationVo reservationDto) {
        reservationMapper.bookadd(reservationDto);
    }

    @Override
    public void bookdelete(String R_name) {
        reservationMapper.bookdelete(R_name);
    }

    @Override
    public void bookmodify(ReservationVo reservationDto) {
        reservationMapper.bookmodify(reservationDto);
    }
}
