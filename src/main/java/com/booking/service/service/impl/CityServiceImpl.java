package com.booking.service.service.impl;

import com.booking.service.controller.dto.CityDto;
import com.booking.service.mapper.CityMapper;
import com.booking.service.persistence.repository.CityRepository;
import com.booking.service.service.CityService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.booking.service.ErrorMessages.CITY_NOT_FOUND_BY_ID;

@Service
@AllArgsConstructor
@Transactional
public class CityServiceImpl implements CityService {
    private final CityRepository cityRepository;
    private final CityMapper cityMapper;

    @Override
    public CityDto createCityDto(CityDto cityDto) {
        cityRepository.save(cityMapper.toCity(cityDto));
        return cityDto;
    }

    @Override
    public CityDto getCityDtoById(Long id) {
        return cityRepository
                .findById(id)
                .map(cityMapper::toCityDto)
                .orElseThrow(() -> new RuntimeException(String.format(CITY_NOT_FOUND_BY_ID, id)));
    }

    @Override
    public CityDto getCityDtoByName(String name) {
        return cityMapper.toCityDto(cityRepository.findByName(name));
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }

    @Override
    public List<CityDto> getAllCities() {
        return cityMapper.toCityDtoList(cityRepository.findAll());
    }
}
