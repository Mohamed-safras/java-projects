package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a [][] =
                {
                {2,3,4},
                {1,5,3},
                {2,5,7}
                };
        int b [][]=
                {
                {2,4,3},
                {1,5,3},
                {2,5,3}
                };

        fun(a,b);
    }

    static void fun(int [][]a, int [][]b){
        int aNumRow = a.length;
        int aNumCol = a[0].length;
        int bNumRow = b.length;
        int bNumCol = b[0].length;
        int [][] result = new int[aNumRow][bNumCol];
        if(aNumCol != bNumRow){
            System.out.println("you cant multiply this matrix");
        }
        int sum = 0;
        for (int i = 0; i < aNumRow;i++){
            for(int j =0; j < bNumCol;j++){
                for(int k =0; k < aNumCol;k++){
                    sum+= a[i][k] * b[k][j];
                }
                result[i][j] = sum;
                sum =0;
            }
        }

        for(int i = 0 ; i< aNumRow;i++){
            for(int j = 0; j < bNumCol;j++){

                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }

    }
}
