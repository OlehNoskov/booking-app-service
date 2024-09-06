package com.booking.service.controller.dto;

import com.booking.service.persistence.entity.Hotel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityDto {
    private String name;
    private Set<Hotel> hotels;
}
