public class menuDrivenConsole{
    public static void main(String[] args) {
        
    }


    public int findMin(int[] numbers)
    {
        int min = 101;
        for (int i : numbers) {
            if(i<min){
                min=i;
            }
            
        }

        return min;
    }

    public int findMax(int[] numbers)
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