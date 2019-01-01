package algs4FourthEdition.ch01.ch03;

import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.StdIn;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q=new Queue<>();
		System.out.println("请输入数据：");
		
		while(!StdIn.isEmpty()){
			String item=StdIn.readString();
			q.enqueue(item);
		}
		int size=q.size();
		for(int i=0;i<size-Integer.parseInt(args[0]);i++){
			q.dequeue();
		}
		System.out.println(q.dequeue());
	}

}
