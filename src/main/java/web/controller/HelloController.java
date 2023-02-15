package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;
import web.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    private final UserService userService;

    public HelloController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("2.3.1");
        messages.add("Spring MVC + EntityManager");
        messages.add("CRUD приложение для работы со списком пользователей");
        model.addAttribute("messages", messages);
        return "index";
    }

    @GetMapping(value = "/start")
    public String users(ModelMap model) {

        userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
        userService.add(new User("Имя2", "Фамилия2", "user2@mail.ru"));
        userService.add(new User("Олег", "Исполнитель", "noreply@testdomain.com"));
        userService.add(new User("Игорь", "Заказчик", "oleg@maketa.net"));

        return "redirect:/users";
    }
}