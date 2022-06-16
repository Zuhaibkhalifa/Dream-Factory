package com.kodnest.java.string.replacearray;

import kodenst.scanner;

public class qudara {
	
		public static void main(String[] args) {
		String s = "KodNest Technologies";
		for (int i = 0; i < s.length(); i++) {
		if (i % 3 == 0) continue;
		if (i == 12) break;
		if (i == 9) return;
		System.out.print(s.charAt(i));
		}
		}
		}
