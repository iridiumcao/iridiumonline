package info.iridiumcao.algorithm.wuwenhu.ch4;

/**
 * 
 * 甲乙丙丁四个人玩球类游戏，其中一人把他人的窗户打破了
 * 甲：这窗是乙打破的
 * 乙：这窗是丁打破的
 * 丙：这窗不是我打破的
 * 丁：乙说了谎
 * 其中只有一个人说了真话，请从中找出打破窗户的人 
 * 
 * 分析：
 *     这又是一个典型的结果确定只有一个的布尔代数问题。
 *     可以将待定的目标编号，然后带入每个逻辑式，再计算
 *     所有结果为真的逻辑式的总数就好了。
 *
 */
public class WhoBrokenWindow {
	public static void main(String[] args) {
		// 给甲乙丙丁编号：1, 2, 3, 4
		for (int i = 1; i <= 4; i++) {
			int count = 0; //说对话的数量
			count += ((i == 2) ? 1 : 0);
			count += ((i == 4) ? 1 : 0);
			count += ((i != 3) ? 1 : 0);
			count += ((i != 4) ? 1 : 0);

			if (count == 1) {
				System.out.println("打破窗户的同学的编号是：" + i);
			}
		}
	}
}
