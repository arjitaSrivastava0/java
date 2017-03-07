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
	
	System.out.println("Enter the dimensions of first matrix; ");
	InputStreamReader inputstream = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(inputstream);
	String rowAstr = br.readLine();
	System.out.println("rowA "+rowAstr);
	rowA = Integer.parseInt(rowAstr);
	System.out.println("rowA "+rowA);
	String colAstr = br.readLine();
	System.out.println("colA "+colAstr);
	colA = Integer.parseInt(colAstr);
	System.out.println("colA "+colA);
	/*System.out.println("Enter a strin: ");
	StringBuffer name = new StringBuffer(br.readLine()).;
	System.out.println("reverse name : "+name);*/
	
	
	int matA[][] = new int[rowA][colA];
	//int matB[][] = matB = new int[i2][j2];
	

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


		
		
		
		
	
	}
}
