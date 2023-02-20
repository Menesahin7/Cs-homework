import java.util.Random;
public class menuDrivenConsole{
    public static void main(String[] args) {
        
    }


    public int[] createArr(int num){

        Random rand = new Random();
        
        int[] arr = new int[10];
        int randNum = -1;
        
        for( int i = 0; i<arr.length; i++)
        {
            randNum = rand.nextInt(101);
            arr[i] = randNum;
        }
        return arr;
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