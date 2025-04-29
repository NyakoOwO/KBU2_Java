public class Television {
    public int channel;
    public int volume;
    public  boolean power;

    public Television() {
        this.channel = 0;
        this.volume = 0;
        this.power = false;
    }

    public Television(int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return String.format("channel: %d Volume: %d 상태: %s",
                channel, volume, power ? "켜졌습니다" : "꺼졌습니다");
    }
}
