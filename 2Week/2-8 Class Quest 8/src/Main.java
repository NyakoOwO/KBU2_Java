public class Main {
    public static void main(String[] args) {
        Television television = new Television(9, 10, false);
        Remocon remocon = new Remocon(television);
        System.out.println(remocon);
        remocon.setBattery(0);

        remocon.PowerOnOff();
        System.out.println(remocon);
        remocon.channelUp();
        remocon.volumeUp();
        System.out.println(television);
        System.out.println(remocon);
        remocon.PowerOnOff();
        remocon.channelDown();
        remocon.volumeDown();
        System.out.println(television);
    }
}