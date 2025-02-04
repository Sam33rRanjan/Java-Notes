class L06_Arrays {
    public static void main(String[] args) {
        // Array Declaration
        int[] arr1 = new int[5];
        System.out.println(arr1); // Address of 1st element of array
        int arr2[][] = new int[2][3];
        System.out.println(arr2);

        // Array Initialization
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = new int[]{1, 2, 3, 4, 5};

        // Accessing Array Elements
        System.out.println(arr3[0]); // 1
        System.out.println(arr3[1]); // 2
        System.out.println(arr3[2]); // 3
        System.out.println(arr3[3]); // 4
        System.out.println(arr3[4]); // 5

        // Array Length
        System.out.println(arr4.length); // 5

        // Iterating Array
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // Enhanced For Loop
        for (int i : arr3) {
            System.out.println(i);
        }

        // Array of Strings
        String[] names = {"John", "Doe", "Jane"};
        for (String name : names) {
            System.out.println(name);
        }

        // Two-Dimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Multi-Dimensional Array
        int[][][] cube = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            }
        };
        System.out.println(cube[0][0][0]); // 1
    }
}