//$Id$
package com.codelab.matrixmultiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MatrixMultiplication {

/**
 * @param args
 * @throws IOException
 */
/**
 * @param args
 * @throws IOException
 */
public static void main(String[] args) throws IOException{
	
	int rowA ;
	int colA ;
	int rowB ;
	int colB ;
	int sum = 0;
	
	
	System.out.println("Enter the dimensions of first matrix; ");
	InputStreamReader inputstream = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(inputstream);
	String rowAstr = br.readLine();
	rowA = Integer.parseInt(rowAstr);
	String colAstr = br.readLine();
	colA = Integer.parseInt(colAstr);	
	
	System.out.println("The dimension of second matrix is: "+rowA+"x"+colA);
	
	int matA[][] = new int[rowA][colA];
	

	for(int i = 0; i < rowA; i++){
		
		for(int j = 0; j < colA; j++){
			
			String matAstr = br.readLine();
			matA[i][j] = Integer.parseInt(matAstr);
			
		}
		
	}

		for(int i = 0; i < rowA; i++){
		
			for(int j = 0; j < colA; j++){
			
			System.out.print(" "+matA[i][j]);
			
		}
		System.out.println();
	}


		System.out.println("Enter the dimenstions of second Matrix: ");
		String rowBstr = br.readLine();
		rowB = Integer.parseInt(rowBstr);
		String colBstr = br.readLine();
		colB = Integer.parseInt(colBstr);
		
		System.out.println("The dimension of first matrix is: "+rowB+"x"+colB);
		
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
		
		System.out.println();
		
		int matResult[][] = new int[rowA][colB];
		
		if(colA == rowB){
			
			for(int i = 0;i<rowA;i++){
				
				for(int j = 0;j < colB;j++){
					
					for(int k = 0;k < colA;k++){
						
						sum += matA[i][k]*matB[k][j];
						
					}
					
					matResult[i][j] = sum;
					sum = 0;
					
				}
			}

			for(int i = 0;i < rowA;i++){
				
				for(int j = 0;j < colB;j++){
					
					System.out.print(+matResult[i][j]+" "); 
				}
				
				System.out.println();
			}

			
		}
		
		else{
			System.out.println("Sorry input is not valid for multiplication.");
		}
		
		
	
	}
}
