public class Business {

    public Business(String no, String name) {
        super(no, name);
    }
    public int fee() {
        int fee = ((int) (used + 0.5f)* 55);
        return fee;
    }


    public int tax () {
        int tax = (int) ((super.basic + fee()) * (5 / 100.0f));
        return tax;
    }

    public int pay () {
        return basic + fee() + tax();
    }


}