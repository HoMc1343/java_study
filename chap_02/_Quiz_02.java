package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int a = 120;
        int height = 121;
        String le = (a <= height) ? ("키가" + height + "cm 이므로 탑승 가능합니다") : ("키가" + height + "cm 이므로 탑승 불가합니다");
        System.out.println(le);
    }
}