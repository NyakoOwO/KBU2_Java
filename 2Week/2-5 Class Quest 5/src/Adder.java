public class Adder {
    private int from;
    private int to;

    public Adder(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int sum() {
        if ( to <= from ) {
            System.err.println("ERROR");
        } else {
            int sum = 0;
            for ( int i = from; i <= to; i++) {
                sum += i;
            }
            return sum;
        }
        return 0;
    }
}


