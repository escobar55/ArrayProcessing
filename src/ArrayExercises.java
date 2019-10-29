
public class ArrayExercises {
    public static void main(String[] args) {

     //1. find the sum of elements in the array

        /* create an array and add elements
           declare a sum variable
           run through the array with a for loop
           add each element of the array into the sum variable
           obtain the total of the sum variable
         */

        //create an array
        int [] numbers = new int [] {1,2,3,4,5,6,7,8,9,10};
        //declare a variable sum
        int sum = 0;

        //loop through the array
        for (int i = 0; i < 10; i++){
            sum = sum + numbers[i];
        }
        //display the result of the sum
        System.out.println("The sum of the elements in the array is: " + sum);

        //2. find the mean average

        /*Creat an array and hold elements in the array
          declare a variable sum
          loop through the array with a for loop
          inside the loop add each element to the sum
          exit the lopp
          print the result with the sum/elements in the array
         */

        //create an array
        int [] numbers2 = new int [] {1,2,3,4,5,6,7,8,9,10};
        //declare a variable sum
        int sum2 = 0;

        //loop through the array
        for (int i = 0; i < 10; i++){
            sum2 = sum2 + numbers2[i];
        }
        //display the result of the sum/elements in the array (10)
        System.out.println("The mean average of the sum of the elements in the array is: " + (sum2/10));


    }
}
