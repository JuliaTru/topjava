package ru.javawebinar.topjava.service.test_service;

import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.Profiles;
import ru.javawebinar.topjava.service.UserServiceTest;

@ActiveProfiles(Profiles.JDBC)
public class JDBCUserServiceTest extends UserServiceTest{
}