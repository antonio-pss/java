package model.inModel;

import model.model.Broadcaster;

public interface InRadio {
    void setBroadcaster(Broadcaster broadcaster);

    Broadcaster getBroadcaster();

    String getBroadcasterType();

    void setRadioVolume(int volume);

    int getRadioVolume();
}
