interface Myinterface {
  void diagonalMinMax(int arr[][]);
}

class Main implements Myinterface {
  public void diagonalMinMax(int arr[][]) {
  
    int n=arr.length;
    int min=arr[0][0];
    int max=arr[0][0];
    int min1=arr[n-1][0];
    int max1=arr[n-1][0];
   for(int i=0;i<arr.length;i++)
     {
     for(int j=0;j<arr.length;j++)
      {
       if(i==j)
       {
        if(arr[i][j]>max)
          max=arr[i][j];
        if(arr[i][j]<min)
           min=arr[i][j];
        }
       }
       }
      for(int i=0;i<arr.length;i++)
    {
     for(int j=0;j<arr.length;j++)
      {
       if((i+j)==n-1)
       {
        if(arr[i][j]>max1)
          max1=arr[i][j];
        if(arr[i][j]<min1)
           min1=arr[i][j];
        }
       }
      }
    System.out.println("maximum number in first diagonal  "+max);
    System.out.println("minimum number in first diagonal  "+min);
    System.out.println("maximum number in second diagonal  "+max1);
    System.out.println("minimum number in second diagonal  "+min1);
    }
  public static void main(String args[]) {
    int[][] arr= {
            { 1, 2, 3},
            { 5, 6, 7},
            { 4, 9, 7}
        };
    Main m = new Main();
    m.diagonalMinMax(arr);
  }
}

/* output 
PS C:\exercise\Assignments\Day-26\OOPS CONCEPTS\MinMaxDiagonal> java Main      
maximum number in first diagonal  7
minimum number in first diagonal  1
maximum number in second diagonal  6
minimum number in second diagonal  3
*/