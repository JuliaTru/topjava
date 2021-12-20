package ru.javawebinar.topjava.service.test_service;

import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.MealServiceTest;

@ActiveProfiles(Profiles.JDBC)
public class JDBCMealServiceTest extends MealServiceTest{
}