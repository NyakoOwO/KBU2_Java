public class Moon {
    private  float weight;

    public Moon(float weight) {
        this.weight = weight;
    }

    private float moonWeught() {
        float weight = this.weight * 16.5f / 100;
        return weight;
    }

    @Override
    public String toString() {
        return String.format("달에서의 몸무게: %.2f KG", moonWeught());
    }
}
