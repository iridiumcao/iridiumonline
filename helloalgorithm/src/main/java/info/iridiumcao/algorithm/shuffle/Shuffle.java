package info.iridiumcao.algorithm.shuffle;

/**
 * Created by caoi on 2015/3/2.
 */
public class Shuffle {

    public static void main(String[] args) {

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + ", ");
        }

        System.out.println();

        Shuffle shuffle = new Shuffle();
        shuffle.shuffle(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    /**
     * 对数组洗牌
     *
     * @param array
     */
    void shuffle(int[] array) {
        int digitalCount = digitalCount(array.length);
        int base = (int) Math.pow(10, digitalCount); // digitalCount 计算整数的位数

        for (int i = 0; i < array.length; i++) {
            int denominator = (int) (Math.random() * base) % array.length;

            //exchange array[i] and array[denominator]
            int tmp = array[i];
            array[i] = array[denominator];
            array[denominator] = tmp;
        }
    }

    /**
     * 计算整数的位数
     *
     * @param a
     * @return
     */
    int digitalCount(int a) {
        a = Math.abs(a);
        int result = 1;
        do {
            result++;
            a = a / 10;
        } while (a >= 10);
        return result;
    }
}
