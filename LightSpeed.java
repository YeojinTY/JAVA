package src;

public class LightSpeed {
    public static void main(String[] args) {
        long lightspeed = 300000;
        long distance = lightspeed * 365 * 24 * 60 * 60;
        System.out.println("빛이 1년 동안 이동하는 거리 : "+distance+"Km");
    }
/**int로 담으면 overflow */
}
