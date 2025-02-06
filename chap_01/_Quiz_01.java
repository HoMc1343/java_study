package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        String busNo = "1234 상암 08"; // 버스 번호
        int minute = 3; // 남은 시간
        double distansce = 1.2; // 남은 거리

        System.out.println("버스 도착 정보 : " + busNo + "번 버스");
        System.out.println("남은 거리 : " + distansce + "km");
        System.out.println("약 " + minute + "분 후 도착");
    }
}
