public class Circle {
    private int radius;
    // Final 을 사용할때는 변수명이 대문자 사용
    private final double PI ; // 기호적 상수

    public Circle(int radius) {
        this.radius = radius;
        this.PI = 3.141592;

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private double area() {
        double area = PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return String.format("원의 반지름: %d Cm, 면적; %.2f \u33A0", radius, area());
    }
}

