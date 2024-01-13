package ru.netology.javaqa.JavaHW5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.JavaHW5.services.HolidayService;

public class HolidayServiceTest {

    @Test
    public void test() {
        HolidayService service = new HolidayService();

        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(expected, actual);

    }
}
