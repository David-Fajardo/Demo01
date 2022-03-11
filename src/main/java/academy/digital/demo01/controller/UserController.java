package academy.digital.demo01.controller;

import academy.digital.demo01.model.UserResponse;
import academy.digital.demo01.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
    public class UserController {

        private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public UserResponse getUser() {


        return userService.getNameUser();
    }

}
