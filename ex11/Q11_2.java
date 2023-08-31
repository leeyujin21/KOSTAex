package ex11;

import java.util.*;

class Q11_2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(6);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(7);
		//descending 내림차순 정렬
		HashSet<Integer> set = new HashSet<>(list);
		TreeSet<Integer> tset = new TreeSet<>(set);
		Stack<Integer> stack = new Stack<>();
		stack.addAll(tset);
		while (!stack.empty())
			System.out.println(stack.pop());
	}
}