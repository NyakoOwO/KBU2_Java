public class Circle1 {
    private int radius; // 원의 반지름

    public Circle1(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float area() {
        float area = 3.141592f * radius * radius;
        return  area;
    }

    @Override
    public String toString() {
        return String.format("원의 반지름: %d Cm, 면적; %.2f \u33A0", radius, area());
    }
}
