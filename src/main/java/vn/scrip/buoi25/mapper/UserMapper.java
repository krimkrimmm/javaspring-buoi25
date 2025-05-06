package vn.scrip.buoi26.mapper;
import vn.scrip.buoi26.entity.User;
import vn.scrip.buoi26.model.dto.UserDTO;
public class UserMapper {
    public static UserDTO toDTO(User user) {
        return UserDTO.builder()

                .id(user.getId())
                .username(user.getUsername())
                .displayName(user.getDisplayName())
                .email(user.getEmail())
                .avatar(user.getAvatar())
                .phone(user.getPhone())
                .role(user.getRole())
                .build();
    }
}
