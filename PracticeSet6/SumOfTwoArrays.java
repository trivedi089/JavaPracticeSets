import java.util.*;

public class SumOfTwoArrays {

    public static void main(String[] args){
    
    int[][] array1 = new int[5][5];

    array1 = new int[][] {
        {1,2,3,4,5},
        {1,2,3,4,5},
        {1,2,3,4,5},
        {1,2,3,4,5},
        {1,2,3,4,5}
    };

    int[][] array2 = new int[5][5];

    array2 = new int[][] {
        {3,4,5,6,7},
        {3,4,5,6,7},
        {3,4,5,6,7},
        {3,4,5,6,7},
        {3,4,5,6,7}
    };

    int[][] resultantArray = new int[5][5];

    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            resultantArray[i][j]=array1[i][j]+array2[i][j];
        }
    }

    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            System.out.print(resultantArray[i][j]+" ");
        }
        System.out.println();
    }

}
}
