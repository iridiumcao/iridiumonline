package info.iridiumcao.algorithm.wuwenhu.ch4;

/**
 * 
 * @author iridium
 *
 */
public class WhoEatMost {

	public static void main(String[] args) {
		// 说对话的数量：依次为 A, B, C说对话的数量
		int[] right = new int[3];
		// 假定饭量的3个档位：0,1,2
		for (int a = 0; a <= 2; a++) {
			for (int b = 0; b <= 2; b++) {
				for (int c = 0; c <= 2; c++) {
					right[0] = ((b > a) ? 1 : 0) + ((b == c) ? 1 : 0);
					right[1] = ((a > b) ? 1 : 0) + ((a > c) ? 1 : 0);
					right[2] = ((c > b) ? 1 : 0) + ((b > a) ? 1 : 0);
				}
			}
		}
	}

}
