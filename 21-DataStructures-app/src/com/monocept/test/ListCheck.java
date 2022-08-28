package com.monocept.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListCheck {

	public static void main(String[] args) {
		
		ArrayList<String> arrlist  = new ArrayList<>();
		
		arrlist.add("ram");
		arrlist.add("cam");
		arrlist.add(2, "tom");
  
        //System.out.println(arrlist);
        ListIterator<String> iter = arrlist.listIterator(1);
     
        while(iter.hasNext()){
           System.out.println(iter.next());
        }
  
        arrlist.remove("ram");
        arrlist.remove(1);
  
        System.out.println(arrlist);
		
		LinkedList<String> list2 = new LinkedList<>();
		
		list2.add("ram");
        list2.add("cam");
        list2.add(2, "tom");
        list2.addLast("shyam");
        list2.addFirst("dom");
  
        System.out.println(list2);
  
        list2.remove("ram");
        list2.remove(1);
        list2.removeFirst();
        list2.removeLast();
  
        System.out.println(list2);
  
        

	}

}
