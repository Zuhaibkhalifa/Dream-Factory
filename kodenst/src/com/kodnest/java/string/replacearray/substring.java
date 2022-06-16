package com.kodnest.java.string.replacearray;

public class substring {
	String substringg(String str, int index) {
		char arr1[] = str.toCharArray();
		char arr2[] = new char[arr1.length-index];
		int j = 0 ;
		for (int i = index ; i <= arr1.length-1 ; i++) {
			arr2[j] = arr1[i];
			j++ ;
		}
		String res = new String(arr2);
		return res;
	}
	
	String substringg(String str,int startindex,int endindex) {
		char arr1[] = str.toCharArray();
		char arr2[] = new char[endindex - startindex + 1];
		int j = 0; 
		for (int i = startindex ; i <= endindex ; i++) {
			arr2[j] = arr1[i];
			j++;
		}
		String res = new String(arr2);
		return res;
	}
  
}
