public class Remocon {
    private Television television;
    private int battery;

    public Remocon(Television television) {
        this.television = television;
        this.battery = 10;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void PowerOnOff() {
        if (battery > 0) {
            if (television.isPower())
                television.setPower(false);
            else
                television.setPower(true);
        }
    }

    public void channelUp() {
        if (battery > 0) {
            if (television.isPower()) {
                if (television.getChannel() < 999) {
                    television.setChannel(television.getChannel() + 1);
                } else {
                    television.setChannel(0);
                }
            }
        }
    }

    public void channelDown() {
        if (battery > 0) {
            if (television.isPower()) {
                if (television.getChannel() != 0)
                    television.setChannel(television.getChannel() - 1);
                else
                    television.setChannel(999);
            }
        }
    }
    public void volumeUp() {
        if (battery > 0) {
            if (television.isPower()) {
                if (television.getVolume() <= 15)
                    television.setChannel(television.getVolume() + 1);
            }
        }
    }

    public void volumeDown() {
        if (battery > 0) {
            if (television.isPower()) {
                if (television.getVolume() != 0)
                    television.setChannel(television.getVolume() - 1);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Battery: %d", battery);
    }
}