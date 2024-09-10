public class Quiz_Bus_info {
    public static void main(String[] args) {
        int busNumber1 ;
        char busNumber2;

        busNumber1 = 1234;
        String busNamber2 = "상암08";

        int firstBusTime;
        int secondBusTime;

        firstBusTime = 3;
        secondBusTime = 5 ;

        float firBusKm;
        float secBusKm;

        firBusKm = 1.5F;
        secBusKm = 0.8F;
        
        System.out.println("~버스 도착 정보 입니다.~");
        System.out.println("버스 번호: "+busNumber1);
        System.out.println("남은 시간은"+firstBusTime+"분 입니다.");
        System.out.println(firBusKm+"Km 남았습니다.");

        System.out.println("~버스 도착 정보 입니다.~");
        System.out.println("버스 번호: "+busNamber2);
        System.out.println("남은 시간은"+secondBusTime+"분 입니다.");
        System.out.println(secBusKm+"Km 남았습니다.");

    }
}
