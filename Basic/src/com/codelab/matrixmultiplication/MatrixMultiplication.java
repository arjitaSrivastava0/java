//$Id$
package com.codelab.matrixmultiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	
	int rowA;
	int colA;
	int rowB;
	int colB;
	int matA;
	int matB;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the dimention for matA: ");
	matA = Integer.parseInt(br.readLine());
	System.out.println("Enter the row values of first matrix: ");
	rowA = Integer.parseInt(br.readLine());
	System.out.println("Enter the column values of first matrix: ");
	colA = Integer.parseInt(br.readLine());
	
	System.out.println("Enter the dimention for matB: ");
	matB = Integer.parseInt(br.readLine());
	System.out.println("Enter the row values of second matrix: ");
	rowB = Integer.parseInt(br.readLine());
	System.out.println("Enter the column values of second matrix: ");
	colB = Integer.parseInt(br.readLine());
	
	System.out.println("A matrix is: "+rowA+" "+colA);
	
	}
}
