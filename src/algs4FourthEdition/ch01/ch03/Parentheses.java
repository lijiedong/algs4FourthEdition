package algs4FourthEdition.ch01.ch03;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> s=new Stack<>();
		String str=StdIn.readString();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch=='{'||ch=='('||ch=='['){
				s.push(ch);
			}else if(ch=='}'){
				if('{'!=s.pop()){
					System.out.println(false+"1");
					return ;
				}
			}
			else if(ch==')'){
				if('('!=s.pop()){
					System.out.println(false+"2");
					return;
				}
			}else if(ch==']'){
				if('['!=s.pop()){
					
					System.out.println(false+"3");
					return ;
				}
			}
			
		}
		System.out.println(s.isEmpty());
		
	}

}
