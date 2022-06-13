package kg.megacom.hotelreister.models.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_review_response")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Review_Response extends BaseEntity{

    String text;

    User user;
}


