package ru.javawebinar.topjava.web;


import static ru.javawebinar.topjava.util.Store.DEFAULT_CALORIES_PER_DAY;

public class SecurityUtil {

    private static int userId = 1;

    public static void setUserId(int id) {
        userId = id;
    }

    public static int authUserId() {
        return userId;
    }

    public static int authUserCaloriesPerDay() {
        return DEFAULT_CALORIES_PER_DAY;
    }
}