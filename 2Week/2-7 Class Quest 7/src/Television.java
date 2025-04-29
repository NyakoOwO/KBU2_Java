public class Television {
    private String name;
    private String brand;
    private int year;
    private int size;
    private  String type;

    public Television(String name, String brand, int year, int size, String type) {
        this.name = name;
        this.brand = brand;
        this.year = year;
        this.size = size;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s는 %s에서 만든 %d년형 %d 인치 %s TV 입니다\n",
                name, brand, year, size, type);
    }
}
