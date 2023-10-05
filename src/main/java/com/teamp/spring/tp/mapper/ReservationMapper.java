package com.teamp.spring.tp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.teamp.spring.tp.dto.ReservationDto;

@Mapper
public interface ReservationMapper {
    @Select("SELECT * FROM book WHERE B_name = #{B_name}")
    List<ReservationDto> list(String B_name);

    @Delete("DELETE FROM book WHERE B_name = #{B_name}")
    void del(String B_name);

    @Insert("INSERT INTO book (B_hospital_name, B_name, B_date) VALUES (#{B_hospital_name}, #{B_name}, #{B_date})")
    void add(ReservationDto reservationDto);

    @Update("UPDATE book SET B_date = #{B_date} WHERE B_name = #{B_name}")
    void modify(ReservationDto reservationDto);
}