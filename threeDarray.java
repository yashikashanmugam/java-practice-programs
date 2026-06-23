public class threeDarray {
    public static void main(String args[])
    {
        int arr[][][] = {
            {
                {1, 2},
                {3, 4}
            }
            {
                {1, 2},
                {3, 4}
            }
        };

        for(int i = 0; i < 1; i++)
        {
            for(int j = 0; j < 2; j++)
            {
                for(int k = 0; k < 2; k++)
                {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
