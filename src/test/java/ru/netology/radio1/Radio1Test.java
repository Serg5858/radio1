package ru.netology.radio1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio1Test {
    @Test
    public void shouldSetStation() {
        Radio1 radio1 = new Radio1();
        radio1.setCurrentStation(5);
        int expected = 5;
        int actual = radio1.getCurrentStation();
    }

}
