public class Radio {
    private int defaultCount = 10;
    private int currentStation;
    private int currentVolume;
    private int stationsCount = defaultCount;

    public Radio(int stations) {
        this.stationsCount = stations;
    }

    public Radio() {
    }

    public int getCurrentCount() {
        return stationsCount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStation(int newNumber) {
        if (newNumber > stationsCount) {
            currentStation = 0;
            return;
        }
        if (newNumber < 0) {
            currentStation = 0;
            return;
        }
        currentStation = newNumber;
    }


    public void next() {
        if (currentStation == stationsCount) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
        return;
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = stationsCount;
        } else {
            currentStation = currentStation - 1;
        }
        return;
    }


    public void setCount(int newNumber) {
        if (newNumber < 0) {
            return;
        }
        stationsCount = newNumber;
    }

    public void setVolume(int newVolume) {
        currentVolume = newVolume;
    }

    public void plusVolume() {
        if (currentVolume == 100) {
            currentVolume = 100;
        } else {
            currentVolume = currentVolume + 1;
        }
        return;
    }

    public void minusVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
        return;
    }
}