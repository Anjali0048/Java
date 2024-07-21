public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int nums[] = {1,3,2,5,2};

        for(int i : nums) {
            System.out.println(i);
        }

        int matrix[][] = new int[3][4];
        int random = 0;

        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                matrix[i][j] = (int)(Math.random() * 100);
            }
        }

        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                // System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i[] : matrix) {
            for(int j : i) {
                // System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // for(int i=0; i<5; i++) {
        //     System.out.print(arr[i]);
        //     System.out.print(nums[i]);
        // }

        int mat[][] = new int[3][];  // jagged array
        mat[0] = new int[4];
        mat[1] = new int[5];
        mat[2] = new int[2];

        for(int i[] : mat) {
            for(int j : i) {
                // System.out.print(j + " ");
            }
            System.out.println();
        }



    }  
}
