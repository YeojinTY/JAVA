package src;

public class FloatingPoint {
    public static void main(String[] args) {
        double pi = 3.141592;
        /*float로 적으려면 pi=3.141592f; */
        double radius = 5.0;
        double area = pi * radius * radius;
        System.out.println("원의 면적은 : "+area+"입니다.");
    }
}
