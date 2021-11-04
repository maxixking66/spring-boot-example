package ir.maktab56.springbootexample.controller;

import ir.maktab56.springbootexample.resource.UserResource;
import ir.maktab56.springbootexample.resource.mapper.UserMapper;
import ir.maktab56.springbootexample.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class PageController {

    private final UserResource userResource;

    private final UserService userService;

    private final UserMapper userMapper;

    @GetMapping("/home")
    public ModelAndView getHome() {
        return new ModelAndView("Home");
    }

    @GetMapping("/user-page")
    public ModelAndView getUserPage() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("userList",
                userMapper.convertListEntityToDTO(
                        userService.findAllNotSecure()
                )
        );

        modelAndView.addObject("userList",
                userResource.getAll().getBody()
        );


        return modelAndView;
    }
}
