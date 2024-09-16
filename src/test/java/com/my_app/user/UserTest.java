package com.my_app.user;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) //otherwise for each method new object will be created to test
public class UserTest {

    User u = null;

    @BeforeAll
    static void onceExecuted() {
        System.out.println("Setup");
        System.out.println("Connect to DB");
    }


    @BeforeEach
    void init() {
        u = new User(1, "Tony Stark", LocalDate.of(2000, 1, 1));

    }

    @Test
    void userTest() {
        assertEquals("Tony Stark", u.getName(), "User name is not correct");
        assertEquals(LocalDate.of(2000, 1, 1), u.getBirthday(), "User dob is not correct");
        assertEquals(1, u.getId(), "User id is not correct");
        u.setBirthday(LocalDate.of(2001, 1, 1));
        assertEquals(u.getBirthday(), LocalDate.of(2001, 1, 1), "User dob is not correct");
        u.setName("Iron Man");
        assertEquals(u.getName(), "Iron Man", "User name is not correct");
        //not Equals
        u.setId(2);
        assertNotEquals(u.getId(), 1);
        assertEquals(u.getId(), 2, "User id is not correct");
        //not Equals
        assertNotEquals(u.getBirthday(), LocalDate.of(2000, 1, 1));
        //assertTimeout

    }

    @AfterEach
    void tearDown() {
        u = null;
        System.out.println("Clean up");
    }

    @AfterAll
    static void closeFinal() {
        System.out.println("Close DB");
    }

}
