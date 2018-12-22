package algs4FourthEdition.ch01.ch01_2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;

public class ch01_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N =Integer.parseInt(args[0]);
		Interval1D[] intervals=new Interval1D[N];
		//获取从键盘输入的键值对
		//注意输入的时候，输入两个数，中间有空格，然后换行输入下一组数
		if(N>0){
			for(int i=0;i<N;i++){
				intervals[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
				
			}
			if (N > 2) {
				for (int i = 0; i < N - 1; i++) {
					for (int j = i + 1; j < N; j++) {
						if (intervals[i].intersects(intervals[j])) {
							System.out.println(intervals[i] + " intersects " + intervals[j]);
						}
					}
				}
			}
		}
		
	}

}
