package cn.no7player.controller;

import cn.no7player.model.User;
import cn.no7player.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wechat")
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        User userInfo = userService.getUserInfo();
        model.addAttribute("name", userInfo.getName());
        return "hello";
    }
    
}
