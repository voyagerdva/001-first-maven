package nn.ru.service;

import nn.ru.service.service.UserService;

public class AppRunner {
    public static void main(String[] args) {
        UserService userService = new UserService();
//        System.out.println("Hello World!!!");
        System.out.println(userService.getUser(25L));
    }
}
