package com.booking.service.controller;

import com.booking.service.controller.dto.HotelDto;
import com.booking.service.service.HotelService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotel")
@AllArgsConstructor
public class HotelController {
    private final HotelService hotelService;

    @PostMapping("/create")
    public HotelDto createHotel(@RequestBody HotelDto HotelDto) {
        return hotelService.createHotelDto(HotelDto);
    }

    @GetMapping("/{id}")
    public HotelDto getById(@PathVariable Long id) {
        return hotelService.getHotelDtoById(id);
    }

    @GetMapping("/{name}")
    public List<HotelDto> getByName(@PathVariable String name) {
        return hotelService.getHotelDtoByName(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        hotelService.deleteById(id);
    }

    @GetMapping("/all")
    public List<HotelDto> getAll() {
        return hotelService.getAllHotels();
    }
}
