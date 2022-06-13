package kg.megacom.hotelreister.controllers;

import kg.megacom.hotelreister.models.request.*;
import kg.megacom.hotelreister.service.CityService;
import kg.megacom.hotelreister.service.HotelService;
import kg.megacom.hotelreister.service.PriceService;
import kg.megacom.hotelreister.service.UserService;
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
@RequestMapping("/api/v1/create")
public class CreateControllers {

//    @NonNull BookingService bookingService;
//
//    @NonNull BookingHistoryService bookingHistoryService;
    @NonNull HotelService hotelService;
    @NonNull UserService userService;
    @NonNull CityService cityService;

    @NonNull PriceService priceService;

//    @NonNull ReviewService reviewService;
//
//    @NonNull ReviewResponseService reviewResponseService;
//
//    @NonNull RoomService roomService;
//
//    @PostMapping("/booking")
//    public ResponseEntity<?> create(@RequestBody BookingRequest bookingRequest){
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(bookingService.create(bookingRequest));
//    }
//
//    @PostMapping("/booking_history")
//    public ResponseEntity<?> create(@RequestBody BookingHistoryRequest bookingHistoryRequest){
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(bookingHistoryService.create(bookingHistoryRequest));
//    }

    @PostMapping("/hotel")
    public ResponseEntity<?> create(@RequestBody HotelRequest hotelRequest){
        return  ResponseEntity
                .status(HttpStatus.CREATED)
                .body(hotelService.create(hotelRequest));
    }

    @PostMapping("/user")
    public ResponseEntity<?> create(@RequestBody UserRequest userRequest){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(userService.create(userRequest));
    }

    @PostMapping("/city")
    public ResponseEntity<?> create(@RequestBody CityRequest cityRequest){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(cityService.create(cityRequest));
    }
    @PostMapping("/price")
    public ResponseEntity<?> create(@RequestBody PriceRequest priceRequest){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(priceService.create(priceRequest));
    }

//    @PostMapping("/review")
//    public ResponseEntity<?> create(@RequestBody ReviewRequest reviewRequest){
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(reviewService.create(reviewRequest));
//    }
//
//    @PostMapping("/review_response")
//    public ResponseEntity<?> create(@RequestBody ReviewResponseRequest reviewResponseRequest){
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(reviewResponseService.create(reviewResponseRequest));
//    }
//
//    @PostMapping("/room")
//    public ResponseEntity<?> create(@RequestBody RoomRequest roomRequest){
//        return ResponseEntity
//                .status(HttpStatus.CREATED)
//                .body(roomService.create(roomRequest));
//    }
}
