import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class menuDrivenConsole{
    public static void main(String[] args) {
        displayMenu();
    }


    public static int[] createArr(int num){

        Random rand = new Random();
        
        int[] arr = new int[num];
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
    

    public static int[] AvgDiff(int[] array) {
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


    public static int oddSum(int[] array) {
        int sum = 0;
        
        for(int i = 0; i<array.length ; i++) {
            if(i%2 != 0) {
                sum += array[i]; 
            }
        }

        return sum;
    }


    public static int evenSum(int[] array) {
        
        int sum = 0;
        
        for(int i = 0; i<array.length ; i++) {
            if(i%2 == 0) {
                sum += array[i]; 
            }
        }

        return sum;
    }


    public static void displayMenu() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array that will contain random integers in the range [0,100]: ");

        int length = in.nextInt();

        int[] array = createArr(length);

        System.out.println("Your array is:    " + Arrays.toString(array));


        Boolean KeepGoing = true;

        while(KeepGoing) {

            System.out.println("-----------------------------\n1-Find the minimum value of the array\n2-Find the maximum value of the array\n"
            + "3-Display how each element of the array differs from the average\n4-Find the sum of elements with odd-numbered indexes\n5-Find the sum of elements with even-numbered indexes\n6-Exit!");


            int input = in.nextInt();

            if(input==1) {
                System.out.println("Minimum value of this array is: " + findMin(array));
            }

            else if(input==2) {
                System.out.println("Maximum value of this array is: " + findMax(array));
            }

            else if(input==3) {
                System.out.println(Arrays.toString(AvgDiff(array)));
            }

            else if(input==4) {
                System.out.println("Sum of the elements with odd numbers is: " + oddSum(array));
            }

            else if(input==5) {
                System.out.println("Sum of the elements with even numbers is: " + evenSum(array));
            }

            else if(input==6) {
                KeepGoing = false;
                System.out.println("Bye");
            }

        }

        in.close();
    }
}