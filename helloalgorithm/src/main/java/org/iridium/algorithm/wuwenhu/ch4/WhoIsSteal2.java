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
public class WhoIsSteal2 {
	public static void main(String[] args) {
		int[] a = { 0, 1 };// 0表示不是小偷，1表示是小偷
		int[] b = { 0, 1 };
		int[] c = { 0, 1 };
		int[] d = { 0, 1 };

		for (int i : a) {
			for (int j : b) {
				for (int k : c) {
					for (int l : d) {
						int count = 0;
						count += (i != 1) ? 1 : 0;
						count += (k == 1) ? 1 : 0;
						count += (l == 1) ? 1 : 0;
						count += (l != 1) ? 1 : 0;

						if (count == 3) {
							System.out.println("A" + (i==1?"":"不") + " 是小偷");
							System.out.println("B" + (j==1?"":"不") + " 是小偷");
							System.out.println("C" + (k==1?"":"不") + " 是小偷");
							System.out.println("D" + (l==1?"":"不") + " 是小偷");
							System.out.println("----");
						}
					}
				}
			}
		}

	}

}