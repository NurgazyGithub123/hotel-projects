package kg.megacom.hotelreister.repository;

import kg.megacom.hotelreister.models.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRequest extends JpaRepository<Hotel, Long> {
}
