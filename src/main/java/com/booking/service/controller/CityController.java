package com.booking.service.controller;

import com.booking.service.controller.dto.CityDto;
import com.booking.service.service.CityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("city")
@AllArgsConstructor
public class CityController {
    private final CityService cityService;

    @PostMapping("/create")
    public CityDto createCity(@RequestBody CityDto cityDto) {
        return cityService.createCityDto(cityDto);
    }

    @GetMapping("/{id}")
    public CityDto getById(@PathVariable Long id) {
        return cityService.getCityDtoById(id);
    }

    @GetMapping("/{name}")
    public CityDto getByName(@PathVariable String name) {
        return cityService.getCityDtoByName(name);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cityService.deleteById(id);
    }

    @GetMapping("/all")
    public List<CityDto> getAllCities() {
        return cityService.getAllCities();
    }
}
