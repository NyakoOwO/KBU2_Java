class Number {
    private int ivalue;
    private float fvalue;


    public Number(int ivalue, float fvalue) {
        this.ivalue = ivalue;
        this.fvalue = fvalue;
    }

    @Override
    public String toString() {
        return "ivalue: " + ivalue + ", fvalue: " + fvalue;
    }
}