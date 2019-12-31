package com.damlaehican.taskproject.service;

import com.damlaehican.taskproject.dto.UserDto;
import com.damlaehican.taskproject.entity.User;
import com.damlaehican.taskproject.util.TPage;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save(UserDto user);

    User getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    User getByUsername(String username);
}
