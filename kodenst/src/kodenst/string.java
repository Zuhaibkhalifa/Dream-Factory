package kodenst;

public class string 	
 {
public static void main(String[] args) {
int a[][][] = new int[2][][];
a[0] = new int[2][2];
a[1] = new int[3][];
a[1][0] = new int[1];
a[1][1] = new int[2];
a[1][2] = new int[3];
for(int i = 1; i <= a.length-1; ++i) {
for(int j = 1; j <= a[i].length-1; ++j) {
for(int k = 1; k <= a[i][j].length-1; ++k) {
a[i][j][k] = i;
}
}
}
for(int i = 0; i <= a.length-1; ++i) {
for(int j = 0; j <= a[i].length-1; ++j) {
for(int k = 0; k <= a[i][j].length-1; ++k) {
System.out.print(a[i]);
}
}
}
}
}