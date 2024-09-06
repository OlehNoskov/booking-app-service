package com.booking.service.mapper;

import com.booking.service.controller.dto.HotelDto;
import com.booking.service.persistence.entity.Hotel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface HotelMapper {
    HotelDto toHotelDto(Hotel hotel);
    Hotel toHotel(HotelDto hotelDto);
    List<HotelDto> toHotelDtoList(List<Hotel> hotels);
}
