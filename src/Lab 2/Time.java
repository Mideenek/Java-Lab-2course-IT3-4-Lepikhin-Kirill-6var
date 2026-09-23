// Задание 1 задача 4
public class Time {
    private int seconds;

    public Time() {
        this.seconds = 0;
    }

    public Time(int seconds) {
        setSeconds(seconds);
    }

    public void setSeconds(int seconds) {

        this.seconds = ((seconds % 86400) + 86400) % 86400;
    }

    public int getSeconds() {

        return seconds;
    }

    public int getHours() {
        return seconds / 3600;
    }

    public int getMinutes() {
        return (seconds % 3600) / 60;
    }

    public int getSecondsPart() {
        return seconds % 60;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSecondsPart());
    }
}