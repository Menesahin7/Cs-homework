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
    

    public int[] AvgDiff(int[] array) {
        int[] AvgDiff = new int[array.length];

        int sum = 0;
        for(int i = 0; i<array.length ; i++) {
            sum += array[i];
        }

        int average = sum/array.length;

        for(int i = 0; i<array.length ; i++) {
            AvgDiff[i] = array[i] - average;
        }

        return AvgDiff;
    }


    public int oddSum(int[] array) {
        int sum = 0;
        
        for(int i = 0; i<array.length ; i++) {
            if(i%2 != 0) {
                sum += array[i]; 
            }
        }

        return sum;
    }


    public int evenSum(int[] array) {
        
        int sum = 0;
        
        for(int i = 0; i<array.length ; i++) {
            if(i%2 == 0) {
                sum += array[i]; 
            }
        }

        return sum;
    }
}