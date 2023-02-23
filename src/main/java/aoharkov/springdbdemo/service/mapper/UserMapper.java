package aoharkov.springdbdemo.service.mapper;

import aoharkov.springdbdemo.dto.UserDTO;
import aoharkov.springdbdemo.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapper implements Mapper<UserEntity, UserDTO> {
    @Override
    public UserEntity mapDTOToEntity(UserDTO item) {
        if (item == null) {
            return null;
        }
        return new UserEntity(item.getId(), item.getName(), item.getEmail());
    }

    @Override
    public UserDTO mapEntityToDTO(UserEntity entity) {
        if (entity == null) {
            return null;
        }
        return UserDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .email(entity.getEmail())
                .build();
    }
}
