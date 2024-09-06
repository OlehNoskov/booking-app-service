package com.booking.service.mapper;

import com.booking.service.controller.dto.CityDto;
import com.booking.service.persistence.entity.City;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    CityDto toCityDto(City city);
    City toCity(CityDto cityDto);
    List<CityDto> toCityDtoList(List<City> cities);
}
