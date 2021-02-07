//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Ryan Paik, Period 2

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  //Declare and initialize a new ArrayList of ints that is empty
  ArrayList<Integer> listFactors = new ArrayList<Integer>();
  //Use a for loop that begins at 2, and iterates up to the int/number
  for(int i = 2; i < number; i++)
  {
    //use an if statement to check if the number is divisible by the current one(remainder = 0)
    if(number % i == 0)
    {
      //add the current number to the arrayList
      listFactors.add(i);
    }
  }
  //return the arrayList
  return listFactors;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 { 
   //use a for loop that traverses through each number in nums
  //int i equals size of array list minus 1, i is greater than or equal to 0, decrement i each time
   for(int i = nums.size()-1; i >= 0; i--)
   {
     //declare int myNums and initialize it to be equal to nums.get(index i)
     int myNums = nums.get(i);
     //Use an if statement to check if size of array list of myNums from getListOfFactors is equal to 0
     if(getListOfFactors(myNums).size() == 0)
     {
       //remove element at index i of array list nums
       nums.remove(i);
     } 
   }
 }
}