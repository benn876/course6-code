public class Clock {
    private int hour = 4;
    private int minutes;

    public Clock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public Clock(int hour) {
        this.hour = hour;
    }

    public Clock() {
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public String getTime() {
        return this.hour + ":" + this.minutes;
    }
}
