// fixed arrays
public class ArraysAndLists {
    public static void main(String[] args){
        // setting this array size means you cannot add or subtract the size 
        int[] myArray = new int[5];
        // just prints [I@15db9742
        // System.out.println(myArray);
        myArray[0]= 4;
        myArray[1]= 8;
        myArray[2]= 2;
        myArray[3]= 3;
        myArray[4]= 1;
        // If array is empty, by default this adds five 0s to an array when printed
        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
        // Arrays when initialized must have curly brackets in java!!!!!
        String[] fruits = {"Banana","Strawberry","Mango","Dragon Fruit"};
        // setting default placeholder value
        String temp= fruits[0];
        // Selecting the last index position
        fruits[0]= fruits[fruits.length -1];
        // setting the last item in the array eqaul to another variable
        fruits[fruits.length -1]= temp;
        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }
}
