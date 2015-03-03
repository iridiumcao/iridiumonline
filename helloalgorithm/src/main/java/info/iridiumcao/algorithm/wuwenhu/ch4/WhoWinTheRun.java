package info.iridiumcao.algorithm.wuwenhu.ch4;

/*
 * 小狗、小兔、小猫、小猴和小鹿参加百米赛跑，比赛结束后，
 * 小猴说：“我比小猫跑得快。”
 * 小狗说：“小鹿在我的前面冲过了终点线。”
 * 小兔说：“我的名次排在小猴的前面，小狗的后面。”
 * 
 * 请根据他们的回答排出名次。
 * 
 * Ref: http://sites.google.com/site/iridiumsite/it/algorithms/who-runs-fast
 * 
 */
public class WhoWinTheRun {

	public static void main(String[] args) {
//		String[] animals = { "小狗", "小兔", "小猫", "小猴", "小鹿" };
		int a, b, c, d, e = 0;// 对应为小狗, 小兔, 小猫, 小猴, 小鹿的名次
		for (a = 1; a <= 5; a++) {
			for (b = 1; b <= 5; b++) {
				for (c = 1; c <= 5; c++) {
					for (d = 1; d <= 5; d++) {
						for (e = 1; e <= 5; e++) {
							if ((d < c) && (e < a) && (b < d) && (b > a)) {
								System.out.println("小狗: " + a);
								System.out.println("小兔: " + b);
								System.out.println("小猫: " + c);
								System.out.println("小猴: " + d);
								System.out.println("小鹿: " + e);
							}
						}
					}
				}
			}
		}
	}

}
