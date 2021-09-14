package com.library.control;

import com.library.config.AppInitializer;
import com.library.controller.UsersController;
import com.library.model.Users;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Appl {
    public static void main(String[] args) {

        Users user = new Users("Artur", "Conan", "ac@ro.rn", "arturconan");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UsersController usersController = (UsersController) context.getBean("usersController");
        System.out.println(usersController.readAll());
    }
}
