package com.booking.service;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ErrorMessages {
    public static final String CITY_NOT_FOUND_BY_ID = "City with id %s not found";
    public static final String HOTEL_NOT_FOUND_BY_ID = "Hotel with id %s not found";
}
