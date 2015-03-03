/*
 * 本代码来自黄勇的《ThreadLocal 那点事儿》
 * http://my.oschina.net/huangyong/blog/159489
 */

package info.iridiumcao.hellojavase.threads;

public class ClientThread extends Thread {
    private Sequence sequence;

    public ClientThread(Sequence sequence) {
        this.sequence = sequence;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " => " + sequence.getNumber());
        }
    }
}
