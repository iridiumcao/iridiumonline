package info.iridiumcao.algorithm.wuwenhu.ch4;

/**
 * 
 * 三对情侣参加婚礼，三个新郞为A、B、C，三个新娘为X、Y、Z。
 * 有人不知道谁和谁结婚，于是询问了六位新人中的三位，但听到
 * 的回答是这样的：A说他将和X结婚；X说她的未婚夫是C；C说他将
 * 和Z结婚。这人听后知道他们在开玩笑，全是假话。
 * 
 * 请编程找出谁将和谁结婚。
 * 
 * 要求答案输出
 * X will marry to B.
 * Y will marry to C.
 * Z will marry to A.
 * 
 * 分析：
 * 1. A说他将和X结婚为假，那么可能的组合就是：A-Y, A-Z
 * 2. X说她的未婚夫是C为假，那么可能的组合就是：A-X, B-X
 * 3. C说他将和Z结婚为假，那么可能的组合就是：C-X, C-Y
 * 
 * 1已经说明 A-X 不可能，所以2仅剩下 B-X，
 * 由此，又推得3仅剩下 C-Y
 * 剩下的组合便是：A-Z
 * 综上，这三对夫妻是：A-Z, B-X, C-Y
 * 
 * Ref: http://sites.google.com/site/iridiumsite/it/algorithms/whomarrieswho
 *
 */
public class WhoMarriesWho {

	public static void main(String[] args) {
		// A, B, C 编号 1, 2, 3
		char[] brides = { 'A', 'B', 'C' };
		// A-Z结婚表示为 z==1
		for (int x = 1; x < 4; x++) {
			for (int y = 1; y < 4; y++) {
				for (int z = 1; z < 4; z++) {
					if ((x != 1) && (x != 3) && (z != 3) && (x != y)
							&& (y != z) && (z != x)) {
						System.out.println("X will marry to " + brides[x-1]);
						System.out.println("Y will marry to " + brides[y-1]);
						System.out.println("Z will marry to " + brides[z-1]);
					}
				}
			}
		}
	}

}
