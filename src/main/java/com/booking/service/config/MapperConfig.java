package com.booking.service.config;

import com.booking.service.mapper.CityMapper;
import com.booking.service.mapper.HotelMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = {"com.booking.service.persistence.entity"})
public class MapperConfig {
    @Bean
    CityMapper cityMapper() {
        return Mappers.getMapper(CityMapper.class);
    }

    @Bean
    HotelMapper hotelMapper() {
        return Mappers.getMapper(HotelMapper.class);
    }
}
