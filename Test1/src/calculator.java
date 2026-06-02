// 확인 예시 코드
public class calculator {
    // 더하기 기능
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        calculator calc = new calculator();
        System.out.println("1 + 2 = " + calc.add(1, 2));
    }
}