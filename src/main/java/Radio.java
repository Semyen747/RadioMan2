public class Radio {
    private int currentNumber;
    private int currentVolume;

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void next() {
        if (currentNumber == 9) {
            currentNumber = 0;
        } else {
            currentNumber = currentNumber + 1;
        }
        return;
    }

    public void prev() {
        if (currentNumber == 0) {
            currentNumber = 9;
        } else {
            currentNumber = currentNumber - 1;
        }
        return;
    }

    public void setNumber(int newNumber) {
        if (newNumber > 9) {
            return;
        }
        if (newNumber < 0) {
            return;
        }
        currentNumber = newNumber;
    }

    public void setVolume(int newVolume) {
        currentVolume = newVolume;
    }

    public void plusVolume() {
        if (currentVolume == 10) {
            currentVolume = 10;
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