package com.booking.service.service.impl;

import com.booking.service.controller.dto.HotelDto;
import com.booking.service.mapper.HotelMapper;
import com.booking.service.persistence.entity.City;
import com.booking.service.persistence.entity.Hotel;
import com.booking.service.persistence.repository.CityRepository;
import com.booking.service.persistence.repository.HotelRepository;
import com.booking.service.service.HotelService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.booking.service.ErrorMessages.CITY_NOT_FOUND_BY_ID;
import static com.booking.service.ErrorMessages.HOTEL_NOT_FOUND_BY_ID;

@Service
@AllArgsConstructor
@Transactional
public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;
    private final CityRepository cityRepository;
    private final HotelMapper hotelMapper;

    @Override
    public HotelDto createHotelDto(HotelDto hotelDto) {
        Hotel hotel = hotelMapper.toHotel(hotelDto);
        City city = cityRepository
                .findById(hotelDto.getCityId())
                .orElseThrow(() -> new RuntimeException(String.format(CITY_NOT_FOUND_BY_ID, hotel.getCity().getId())));
        hotel.setCity(city);

        hotelRepository.save(hotelMapper.toHotel(hotelDto));
        return hotelDto;
    }

    @Override
    public HotelDto getHotelDtoById(Long id) {
        return hotelMapper
                .toHotelDto(hotelRepository.findById(id)
                        .orElseThrow(() -> new RuntimeException(String.format(HOTEL_NOT_FOUND_BY_ID, id))));
    }

    @Override
    public List<HotelDto> getHotelDtoByName(String name) {
        return hotelMapper.toHotelDtoList(hotelRepository.findByName(name));
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
