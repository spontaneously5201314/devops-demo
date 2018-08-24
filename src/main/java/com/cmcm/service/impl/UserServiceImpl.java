package com.cmcm.service.impl;

import com.cmcm.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Spontaneously
 * @date 2018/8/22 19:40
 **/
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Override
    public String say(String word) {
        return word;
    }
}
