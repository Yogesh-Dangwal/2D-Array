// public class SearchInSortedMatrix {//Stair case search
//     public static void StairCaseSearch(int matrix[][], int key){
//         int row=0, col = matrix[0].length-1;
//         while(row < matrix.length && col >= 0)
//         if(key == matrix[row][col]){
//             System.out.println("Key fount at index ("+ row + "," + col + ")");
//             return;
//         }
//         else if(key < matrix[row][col]){
//             col--;
//         }
//         else{
//             row++;
//         }
//         System.out.println("Key not found");
//     }
//     public static void main(String[] args) {
//         int matrix[][]={{1,2,3,4},
//                         {5,6,7,8},
//                         {9,10,11,12},
//                         {13,14,15,16}};
//         int key = 101;
//         StairCaseSearch(matrix , key);
//     }
// }

public class SearchInSortedMatrix {//Stair case search
    public static void StairCaseSearch(int matrix[][], int key){
        int row=matrix.length-1, col = 0;
        while(row >= 0 && col < matrix[0].length-1)
        if(key == matrix[row][col]){
            System.out.println("Key fount at index ("+ row + "," + col + ")");
            return;
        }
        else if(key < matrix[row][col]){
            row--;
        }
        else{
            col++;
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        int key = 10;
        StairCaseSearch(matrix , key);
    }
}