package vn.scrip.buoi26.model.dto;
import vn.scrip.buoi26.model.enums.UserRole;
import lombok.*;
import lombok.experimental.FieldDefaults;
@Getter
@Setter

@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserDTO {
    Integer id;
    String username;
    String displayName;
    String email;

    String avatar;
    String phone;
    UserRole role;
}