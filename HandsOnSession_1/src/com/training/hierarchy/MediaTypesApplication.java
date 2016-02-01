package com.training.hierarchy;

import java.util.Scanner;

public class MediaTypesApplication {

	public static void main(String[] args) {

		Books[] books = new Books[1];
		Periodicals[] periodicals = new Periodicals[1];
		DVD[] dvds = new DVD[1];
		
		books[0] = new Books("Argumentative Indian", "June-02-2005", 10, 2, "Amartya Sen", 1100110011L, "Allen Lane", 1);
		periodicals[0] = new Periodicals("India Today", "13-02-1993", 5, 1, "periodical", 13, "publisher");
		dvds[0] = new DVD("Erin Brockovich", "2000", 2, 3, 150, "production");
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		do
		{
			System.out.println("Press\n1 for Books\n2 for Periodicals\n3 forDVDs\n4 to Exit");
			choice = Integer.parseInt(sc.next());
			switch (choice)
			{
			case 1: books[0].display();
			break;
			case 2: periodicals[0].display();
			break;
			case 3: dvds[0].display();
			break;
			default: sc.close();
			System.exit(0);
			}
		}while(choice>0 && choice<5);
	}

}
