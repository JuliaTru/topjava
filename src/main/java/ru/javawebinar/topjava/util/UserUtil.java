package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

import java.util.Arrays;
import java.util.List;

public class UserUtil {
    public static final List<User> users = Arrays.asList(
         new User(1,"Maria", "maria@mail.ru", "password", Role.ADMIN),
         new User(2,"Oleg", "oleg@gmail.com", "password", Role.USER));
}
