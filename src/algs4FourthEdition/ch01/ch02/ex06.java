package algs4FourthEdition.ch01.ch02;

import edu.princeton.cs.algs4.StdIn;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//判断两个字符串是否互为回环变位
		//网上的i一种思路是将s拆分成左右两部分，然后另令s'=右+左，遍历所有情况。如果是回环字符串的话，其中会有 s'=t 的情况
		//还有一种方法就是，将字符串s再拼接一次，然后在里面查找字符串t第一次出现的位置，如果出现就说明，s和t互为回环变位
		//这个用了java字符串对象的indexof()方法，但是如果不是用java写的，我觉得依旧先把s拼接，然后再使用KMP算法，我觉得
		
		System.out.print("s: ");
		String s = StdIn.readLine();
		System.out.print("t: ");
		String t = StdIn.readLine();
		if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0) {
			System.out.println(s + " is the circular rotation of " + t);
		} else {
			System.out.println(s + " is not the circular rotation of " + t);
		}
	}

}
