//$Id$
package com.codelab.matrixmultiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SampleMultiplication {

	
	public static void main(String[] args) throws IOException {
		
		int rowB;
		int colB;
		
		System.out.println("Enter the dimenstions of second Matrix: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String rowBstr = br.readLine();
		rowB = Integer.parseInt(rowBstr);
		System.out.println("rowA: "+rowB);
		String colBstr = br.readLine();
		colB = Integer.parseInt(colBstr);
		System.out.println("colB: "+colB);
		
		int matB[][] = new int[rowB][colB];
		
		for(int i = 0;i < rowB;i++){
			
			for(int j = 0;j < colB;j++){
				
				String matBstr = br.readLine();
				matB[i][j] = Integer.parseInt(matBstr);
			}
			
		}
		
		
		for(int i = 0;i < rowB;i++){
			
			for(int j = 0;j < colB;j++){
				
				System.out.print(" "+matB[i][j]); 
			}
			
			System.out.println();
		}
		
		
		
	}
}
