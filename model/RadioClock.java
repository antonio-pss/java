package model;

import inModel.InClock;
import inModel.InRadio;

import java.time.LocalTime;
import java.util.Date;

public class RadioClock implements InClock, InRadio {
    private LocalTime time;
    private Boolean state;
    private LocalTime alarmTime;
    private Broadcaster broadcaster;
    private String broadcasterType;
    private int radioVolume;
    private int clockVolume;

    public RadioClock(LocalTime time, Boolean state, LocalTime alarmTime, Broadcaster broadcaster, String broadcasterType, int radioVolume, int clockVolume) {
        this.time = time;
        this.state = state;
        this.alarmTime = alarmTime;
        this.broadcaster = broadcaster;
        this.broadcasterType = broadcasterType;
        this.radioVolume = radioVolume;
        this.clockVolume = clockVolume;
    }

    public RadioClock() {
    }

    @Override
    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public LocalTime getTime() {
        return this.time;
    }

    @Override
    public void setAlarmTime(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public LocalTime getAlarmTime() {
        return this.alarmTime;
    }

    @Override
    public void startClok() {
        this.state = true;
    }

    @Override
    public void stopClock() {
        this.state = false;
    }

    @Override
    public void setClockVolume(int volume) {
        this.clockVolume = volume;
    }

    @Override
    public int getClockVolume() {
        return this.clockVolume;
    }

    @Override
    public void setBroadcaster(Broadcaster broadcaster) {
        this.broadcaster = broadcaster;
    }

    @Override
    public Broadcaster getBroadcaster() {
        return broadcaster;
    }

    @Override
    public String getBroadcasterType() {
        return this.broadcasterType;
    }

    @Override
    public void setRadioVolume(int volume) {
        this.radioVolume = volume;
    }

    @Override
    public int getRadioVolume() {
        return radioVolume;
    }

    public void setBroadcasterType(String broadcasterType) {
        this.broadcasterType = broadcasterType;
    }

    @Override
    public String toString() {
        return "RadioClock{" +
                "time=" + time +
                ", state=" + state +
                ", alarmTime=" + alarmTime +
                ", broadcaster=" + broadcaster +
                ", broadcasterType='" + broadcasterType + '\'' +
                ", radioVolume=" + radioVolume +
                ", clockVolume=" + clockVolume +
                '}';
    }
}
