package trees;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(4);
		treeSet.add(10);
		treeSet.add(34);
		Iterator<Integer> iterator = treeSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("cieling of element is  : "+ treeSet.headSet(5));
	}

}
