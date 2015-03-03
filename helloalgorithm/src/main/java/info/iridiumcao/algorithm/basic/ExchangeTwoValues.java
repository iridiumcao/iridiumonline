package info.iridiumcao.algorithm.basic;

/**
 * Created by caoi on 2015/3/1.
 */
public class ExchangeTwoValues {
    private int a;
    private int b;

    public static void main(String[] args) {
        ExchangeTwoValues exchangeTwoValues = new ExchangeTwoValues();
        System.out.println("a = " + exchangeTwoValues.a + ", b = " + exchangeTwoValues.b);

        exchangeTwoValues.a = 1;
        exchangeTwoValues.b = 3;
        System.out.println("a = " + exchangeTwoValues.a + ", b = " + exchangeTwoValues.b);

        exchangeTwoValues.exchange();
        System.out.println("a = " + exchangeTwoValues.a + ", b = " + exchangeTwoValues.b);

        exchangeTwoValues.exchange();
        System.out.println("a = " + exchangeTwoValues.a + ", b = " + exchangeTwoValues.b);

        exchangeTwoValues.exchange1();
        System.out.println("a = " + exchangeTwoValues.a + ", b = " + exchangeTwoValues.b);
    }

    /**
     * 交换两数，使用中间变量
     */
    void exchange() {
        int temp = a;
        a = b;
        b = temp;
    }

    /**
     * 交换两数，不使用中间变量
     */
    void exchange1() {
        a = a + b;
        b = a - b;
        a = a - b;
    }
}
