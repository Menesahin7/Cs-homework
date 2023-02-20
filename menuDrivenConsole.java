public class menuDrivenConsole{
    public static void main(String[] args) {
        int[] hello ={1,2,2,4,5,7};
        System.out.println(findMin(hello)); 
        System.out.println(findMax(hello)); 
    }


    public static int findMin(int[] numbers)
    {
        int min = 101;
        for (int i : numbers) {
            if(i<min){
                min=i;
            }
            
        }

        return min;
    }

    public static int findMax(int[] numbers)
    {
        int max = -1;
        for (int i : numbers) {
            if(i>max){
                max=i;
            }
            
        }

        return max;
    }
}