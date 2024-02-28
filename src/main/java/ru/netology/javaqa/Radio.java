package ru.netology.javaqa;

public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void nextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
        if (currentStation == 9) {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            currentStation = 9;
            return;
        }
        if (currentStation <= 9) {
            currentStation = currentStation - 1;
        }
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation > 9) {
            return;
        }
        if (newCurrentStation < 0) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        }
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        if (currentVolume <= 100) {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }




}
