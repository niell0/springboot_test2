package com.projectnls.springboot_board.controller;

import com.projectnls.springboot_board.entity.User;
import com.projectnls.springboot_board.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    @PostMapping("/user/save")
    public void userSave(@RequestBody User user) {
        userRepository.save(user);
    }
}
