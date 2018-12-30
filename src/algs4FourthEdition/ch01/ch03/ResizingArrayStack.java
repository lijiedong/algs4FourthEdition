package algs4FourthEdition.ch01.ch03;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item> {
	
	private Item[] a=(Item[]) new Object[1];//栈元素
	private int N=0;
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}
	private void resize(int max){
		//将栈移动到一个大小为max的新数组
		Item[] temp=(Item[]) new Object[max];
		for(int i=0;i<N;i++){
			temp[i]=a[i];
		}
		a=temp;
	}
	public void push(Item item){
		a[N++]=item;
	}
	public Item pop(){
		Item item=a[--N];
		a[N]=null;
		if(N>0&&N==a.length/4) resize(a.length/2);
		return item;
	}
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	private class ReverseArrayIterator implements Iterator<Item>{
		private int i=N;
		public boolean hasNext(){
			return i>0;
		}
		public Item next(){
			return a[--i];
		}
		public void remove(){
			
		}
	}
	
}
