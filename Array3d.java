package com.session;
import java.util.*;
public class Array3d {

	public static void main(String args[]) {
		int arr[][][]=new int[5][5][5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					arr[i][j][k] = sc.nextInt();
					
				}
			}
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				for(int k=0; k<3; k++) {
					System.out.print(arr[i][j][k]+ " " );
					
				}
				
				System.out.println();
			}
			System.out.println();
		}
	}
}
