import java.util.*;
public class RowColumnSum {
    public static void main(String[] args){
        int row=0;
        int column=0;
        int rowsum=0;
        int columnsum=0;
        int sum=0;
        int a[][]=null;
        Scanner sc = new Scanner(System.in);
         row=sc.nextInt();
         column=sc.nextInt();
        a=new int[row][column];
        for (int i=0; i<a.length; i++){
            for (int j=0; j<a[0].length; j++){
                a[i][j]=sc.nextInt();
                sum=sum+a[i][j];
            }
        }
        for(int i=0;i<row;i++){
             for(int j=0; j<column; j++){
                  rowsum+=a[i][j];
                  columnsum+=a[j][i];
                  System.out.println( "row "+ (i+1)+"sum = "+rowsum);
                  System.out.println( "column "+ (i+1)+"columun = "+columnsum);
             }
            }
            System.out.println("total sum of elements in matrix : "+sum);
        sc.close();
    }
    
}
