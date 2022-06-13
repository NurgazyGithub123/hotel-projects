package kg.megacom.hotelreister.controllers;

import kg.megacom.hotelreister.models.request.HotelRequest;
import kg.megacom.hotelreister.service.HotelService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/hotel")
public class HotelController {

    @NonNull
    HotelService hotelService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody HotelRequest hotelRequest){
        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(hotelService.create(hotelRequest));
    }
}
