package com.booking.service.service.impl;

import com.booking.service.controller.dto.HotelDto;
import com.booking.service.mapper.HotelMapper;
import com.booking.service.persistence.entity.City;
import com.booking.service.persistence.entity.Hotel;
import com.booking.service.persistence.repository.CityRepository;
import com.booking.service.persistence.repository.HotelRepository;
import com.booking.service.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;
    private final CityRepository cityRepository;
    private final HotelMapper hotelMapper;

    @Override
    public HotelDto createHotelDto(HotelDto hotelDto) {
        Hotel hotel = hotelMapper.toHotel(hotelDto);
        City city = cityRepository.findById(hotelDto.getCityId()).orElse(null);
        hotel.setCity(city);

        hotelRepository.save(hotel);
        return hotelDto;
    }

    @Override
    public HotelDto getHotelDtoById(Long id) {
        return hotelMapper.toHotelDto(hotelRepository.findById(id).orElse(null));
    }

    @Override
    public HotelDto getHotelDtoByName(String name) {
        return hotelMapper.toHotelDto(hotelRepository.findByName(name));
    }

    @Override
    public void deleteById(Long id) {
        hotelRepository.deleteById(id);
    }

    @Override
    public List<HotelDto> getAllHotels() {
        return hotelMapper.toHotelDtoList(hotelRepository.findAll());
    }
}
