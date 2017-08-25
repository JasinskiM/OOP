package MyTime;

import java.io.IOException;

/**
 * Created by RENT on 2017-08-25.
 */
public class MyTime {
    private int _hour = 0;
    private int _minute = 0;
    private int _second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        _hour = hour;
        _minute = minute;
        _second = second;
    }

    public void setTime(int hour, int minute, int second) throws IOException {
        if (hour <= 23 || minute <= 60 || second <= 60) {
            _hour = hour;
            _minute = minute;
            _second = second;
        } else throw new IOException("Zly format daty");
    }

    public int getHour() {
        return _hour;
    }

    public int getMinute() {
        return _minute;
    }

    public int getSecond() {
        return _second;
    }

    public void setHour(int hour) throws IOException {
        if (hour >= 24)
            _hour = hour;
        else throw new IOException("Podno zla godzine, prosze podac liczbe z przedzialu 1-23");
    }

    public void setMinute(int minute) throws IOException {
        if (minute <= 60)
            _minute = minute;
        else throw new IOException("Podno zla godzine, prosze podac liczbe z przedzialu 0-60");
    }

    public void setSecond(int second) throws IOException {
        if (second <= 60)
            _second = second;
        else throw new IOException("Podno zla godzine, prosze podac liczbe z przedzialu 0-60");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HH:MM:SS\nwith leading zeros,\ne.g. , ")
                .append(_hour)
                .append(":")
                .append(_minute)
                .append(":")
                .append(_second);
        return sb.toString();
    }

    public MyTime nextSecond() {
         _second = (_second+1)%60;

        return _second ==0? nextMinute():this;
    }

    public MyTime nextMinute() {
        _minute = (_minute+1)%60;
        return _minute ==0 ? nextHour():this;
    }

    public MyTime nextHour() {
        _hour = (_hour  +1)% 24;
        return this;
    }

    public MyTime previousSecond() {
        if (getSecond() >= 1) _second--;
        else {
            _minute--;
            _second = 59;
        }
        return this;
    }

    public MyTime MinuteSecond() {
        if (getMinute() >= 1) _minute--;
        else {
            _hour--;
            _minute = 59;
        }
        return this;
    }

    public MyTime previousHour(){
        if (getHour() >= 1) _hour --;
        else {
            _hour = 23;
        }
        return this;
    }
}
