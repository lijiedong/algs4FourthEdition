package algs4FourthEdition.ch01.ch02;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 从命令行接收一个整数N，在单位正方形中生成N个随机点，然后计算两点之间的最近距离
 * @author lijiedong
 *
 */
public class ex01 {

	public static void main(String[] args) {
		//int N = Integer.parseInt(args[0]);
		int N=10;
		//设置画笔的大小，觉得默认的设置有点太小了
		StdDraw.setPenRadius(0.01);
		Point2D[] points = new Point2D[N];
		for (int i = 0; i < N; i++) {
			points[i] = new Point2D(StdRandom.uniform(), StdRandom.uniform());
			points[i].draw();
			StdDraw.point(points[i].x(), points[i].y());
			
		}
			if (N > 1) {
			double min = points[0].distanceTo(points[1]);
			for (int i = 0; i < N - 1; i++) {
				for (int j = i + 1; j < N; j++) {
					//计算两个点之间的距离
					if (points[i].distanceTo(points[j]) < min) {
						min = points[i].distanceTo(points[j]);
					}
				}
			}
			System.out.println("Min distance: " + min);
		}
	}
}
