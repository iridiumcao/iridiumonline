/*
 * 本代码来自黄勇的《ThreadLocal 那点事儿》
 * http://my.oschina.net/huangyong/blog/159489
 */

package info.iridiumcao.hellojavase.threads;

public class SequenceB implements Sequence {
    private ThreadLocal<Integer> numberContainer = new ThreadLocal<Integer>() {
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    @Override
    public int getNumber() {
        numberContainer.set(numberContainer.get() + 1);
        return numberContainer.get();
    }

    public static void main(String[] args) {
        Sequence sequence = new SequenceB();

        ClientThread clientThread1 = new ClientThread(sequence);
        ClientThread clientThread2 = new ClientThread(sequence);
        ClientThread clientThread3 = new ClientThread(sequence);

        clientThread1.start();
        clientThread2.start();
        clientThread3.start();
    }
}
