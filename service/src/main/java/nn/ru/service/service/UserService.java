package nn.ru.service.service;

import nn.ru.database.dao.UserDao;
import nn.ru.database.entity.User;
import nn.ru.service.dto.UserDto;

import java.util.Optional;

public class UserService {
    private final UserDao userDao = new UserDao();
    public Optional<UserDto> getUser(Long id) {
        return userDao.findById(id)
                .map(it -> new UserDto());
    }
}
