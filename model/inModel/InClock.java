package model.inModel;

import java.time.LocalTime;

public interface InClock {
    void setTime(LocalTime time);

    LocalTime getTime();

    void setAlarmTime(LocalTime alarmTime);

    LocalTime getAlarmTime();

    void startClok();

    void stopClock();

    void setClockVolume(int volume);

    int getClockVolume();
}
