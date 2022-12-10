import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void moreThanMaxNumbers() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(20);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void withTheBordersNumbers() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(6);

        int expected = 6;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void belowLimitValueNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValuNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void limitValutNumber() {
        Radio radio = new Radio();

        radio.setCurrentStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }
}