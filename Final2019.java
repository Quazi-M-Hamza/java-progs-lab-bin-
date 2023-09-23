import java.io.*;
class Final2019
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter the size of the Squar Matrix: ");
    int N = Integer.parseInt(br.readLine());
    if(N <= 0 || N >= 20)
    {
      System.out.println("Invalid size");
      System.exit(0);
    }
    int[][] A = new int[N][N];
    for (int i = 0; i < N; i++)
    {
      for (int j = 0; j < N; j++)
      {
        System.out.print("Element for row " + i + ", column " + j + ": ");
        int m = Integer.parseInt(br.readLine());
        if (m < 0)
        {
          System.out.println("\nPlease enter a positive integer.");
          j--;
          continue;
        }
        else { A[i][j] = m; }
      }
    }
    int saddlePoint = -1;
    for (int i = 0; i < N; i++)
    {
      int minX = 0;
      for (int j = 1; j < N; j++)
      {
        if (A[i][minX] > A[i][j])
        {
          minX = j;
        }
      }
      int maxY = 0;
      for (int k = 0; k < N; k++)
      {
        if (A[maxY][minX] < A[k][minX])
        {
          maxY = k;
        }
      }
      if (i == maxY)
      {
        saddlePoint = A[maxY][minX];
        break;
      }
    }
    for (int i = 0; i < N; i++)
    {
      for (int j = 0; j < N; j++)
      {
        System.out.print(A[i][j] + "\t");
      }
      System.out.println();
    }
    if (saddlePoint == -1)
    {
      System.out.println("NO SADDLE POINT");
    }
    else
    {
      System.out.println("SADDLE POINT = " + saddlePoint);
    }
    for (int i = 0; i < N; i++)
    {
      int j = 0;
      int y = A[i][i];
      for (j = i; j >= 0 && y <= A[j][j]; j--)
      {
        int t = A[i][i];
        A[i][i] = A[j][j];
        A[j][j] = t;
      }
    }
    System.out.println("MATRIX AFTER SORTING THE PRINCIPLE DIAGONAL");
    for (int i = 0; i < N; i++)
    {
      for (int j = 0; j < N; j++)
      {
        System.out.print(A[i][j] + "\t");
      }
      System.out.println();
    }
  }
}
