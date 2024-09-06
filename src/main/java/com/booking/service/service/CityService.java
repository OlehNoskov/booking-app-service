package com.booking.service.service;

import com.booking.service.controller.dto.CityDto;

import java.util.List;

public interface CityService {
    CityDto createCityDto(CityDto CityDto);
    CityDto getCityDtoById(Long id);
    CityDto getCityDtoByName(String name);
    void deleteById(Long id);
    List<CityDto> getAllCities();
}
