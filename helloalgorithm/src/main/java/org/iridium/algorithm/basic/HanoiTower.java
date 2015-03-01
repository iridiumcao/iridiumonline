package org.iridium.algorithm.basic;

public class HanoiTower {

	public static void main(String[] args) {
		HanoiTower ht = new HanoiTower();
		ht.hanoi(3, "a", "b", "c");
	}

	public static void hanoi(int i, String a, String b, String c) {
		if (i == 1) {
			move(a, c);
		} if (i > 1) {
			hanoi(i-1, a, c, b);
			move(a, c);
			hanoi(i-1, b, a, c);
		}
	}

	public static void move(String src, String dst) {
		System.out.println(src + " -> " + dst);
	}
}
