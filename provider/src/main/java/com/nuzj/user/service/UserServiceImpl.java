package com.nuzj.user.service;

import com.niuzj.user.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String getUsername() {
        return "niuzheju";
    }
}
