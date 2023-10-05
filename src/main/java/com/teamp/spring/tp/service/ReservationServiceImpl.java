package com.teamp.spring.tp.service;

import com.teamp.spring.tp.dto.ReservationDto;
import com.teamp.spring.tp.mapper.ReservationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {
    private final ReservationMapper reservationMapper;

    @Autowired
    public ReservationServiceImpl(ReservationMapper reservationMapper) {
        this.reservationMapper = reservationMapper;
    }

    @Override
    public List<ReservationDto> list(String B_name) {
        return reservationMapper.list(B_name);
    }

    @Override
    public void add(ReservationDto reservationDto) {
        reservationMapper.add(reservationDto);
    }

    @Override
    public void delete(String B_name) {
        reservationMapper.del(B_name);
    }

    @Override
    public void modify(ReservationDto reservationDto) {
        reservationMapper.modify(reservationDto);
    }
}
