
package hw16_matrixfunctions;
import java.util.Scanner; 
public class HW16_MatrixFunctions {

    public static void main(String[] args) {
    
printMatrixMultiplicationBanner();
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers by m");
        int m = in.nextInt();
        System.out.println("Enter the numbers by n");
        int n = in.nextInt();
        System.out.println("Enter the numbers by p");
        int p = in.nextInt();

        int U[][] = new int[m][n];
        int V[][] = new int[n][p];
        int W[][] = new int[m][p];

        computeMatrixMultiplication(m, n, U, p, V, W);

        System.out.println("-Matrix U-");
        System.out.println("----------");
        showMatrix(U, m, n);
        System.out.println("-Matrix V-");
        System.out.println("----------");
        showMatrix(V, n, p);
        System.out.println("-Matrix W-");
        System.out.println("----------");
        showMatrix(W, m, p);
       

    }

    public static void printMatrixMultiplicationBanner() {
        // In Linear Algebra the multiplications
        // of matrixs will be posible;
        // when A = M(m*n)E(K) and B = M(m*n)E(K)
        // have the same columns and rows, where
        // (n=columns of A & m=rows of B).
        
        System.out.println("****************************************************************************************************");
        System.out.println("*Hi, Edison Lascano, PhD. My name's Paul Escobar in this case I show you, the matrix multiplication*");
        System.out.println("****************************************************************************************************");
        System.out.println("");
    }

    public static void computeMatrixMultiplication(int m, int n, int[][] U, int p, int[][] V, int[][] W) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                U[i][j] = (i + 1) * j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                V[i][j] = (j + 1) * i;
            }

        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    W[i][j] += U[i][k] * V[k][j];
                }
            }
        }
    }

    public static void showMatrix(int m[][], int f, int c) {
        for (int i = 1; i < f; i++) {
            for (int j = 1; j < c; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}
        
        
        
       