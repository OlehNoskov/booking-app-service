package com.booking.service.service;

import com.booking.service.controller.dto.HotelDto;

import java.util.List;

public interface HotelService {
    HotelDto createHotelDto(HotelDto hotelDto);

    HotelDto getHotelDtoById(Long id);

    HotelDto getHotelDtoByName(String name);

    void deleteById(Long id);

    List<HotelDto> getAllHotels();
}
