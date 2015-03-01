package org.iridium.algorithm.wuwenhu.ch4;

/*
 * a说：我不是小偷；
 * b说：c是小偷
 * c说： 小偷肯定是d
 * d说： c冤枉人
 * 
 * 已知四人中有三个人说了真话，一人说了假话。问到底谁是小偷？
 * 请编写一段代码得出结果。
 * 
 * Ref: https://sites.google.com/site/iridiumsite/it/algorithms/whosteal
 * 
 */
public class WhoIsSteal {
	public static void main(String[] args) {
		// 这里如此写，其实暗用了一个假设：只有一个小偷
		for (int i = 1; i <= 4; i++) {
			int count = 0;
			count += (i != 1) ? 1 : 0;
			count += (i == 3) ? 1 : 0;
			count += (i == 4) ? 1 : 0;
			count += (i != 4) ? 1 : 0;
			
			if (count == 3) {
				System.out.println("小偷的编号: "+i);
			}
		}
	}

}
