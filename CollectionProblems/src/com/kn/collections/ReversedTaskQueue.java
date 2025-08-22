package com.kn.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ReversedTaskQueue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		LinkedList<String> listOfTasks=new LinkedList();
		System.out.println("Enter 4 tasks");
		for(int i=0;i<4;i++) {
			String task=scan.nextLine();
			if(task.endsWith("!")) {
				listOfTasks.addFirst(task);	
			}else {
				listOfTasks.addLast(task);
			}
		}
		System.out.println("Reversed Tasks List");
		Collections.reverse(listOfTasks);
		for(int i=0;i<listOfTasks.size();i++) {
			System.out.println(listOfTasks.get(i));
			
		}
		scan.close();

	}

}
