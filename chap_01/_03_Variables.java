package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "이무성";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은" + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F; // float의 변수는 뒤에 F나 f를 붙인다.
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // long의 변수는 뒤에 L이나 l을 붙인다.
        l = 1_000_000_000_000L;
        System.out.println(l);

        /*
        int         약 -21억~21억 까지의 정수
        long        int 보다 큰 범위의 정수
        float       실수
        double      float 보다 정밀한 범위의 실수
        char        문자
        String      문자열
        boolean     참, 거짓
        */
    }
}
