/**
 * @author Belinda Nguyen
 * 
 */


import java.io.*;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {


	/**
	 * 
	 * @param file
	 * @return
	 */
    public static double[][] readFile(File file) {
        double[][] arr = null;
        try {
            Scanner in = new Scanner(file);
            int rows = 0;
            while(in.hasNextLine()){
                ++rows;
                in.nextLine();
            }
            in.close();
            in = new Scanner(file);
            String line;
            arr = new double[rows][];
            for(int i = 0; i < arr.length; ++i){
                line = in.nextLine();
                String[] nums = line.split(" ");
                arr[i] = new double[nums.length];
                for(int j = 0; j < arr[i].length; ++j){
                    arr[i][j] = Double.valueOf(nums[j]);
                }
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }
/**
 * 
 * @param arr
 * @param file
 * //writes the file
 */
    
    public static void writeToFile(double[][] arr, File file){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for(int i = 0; i < arr.length; ++i){
                for(int j = 0; j < arr[i].length; ++j){
                    bw.write(arr[i][j] + " ");
                }
                bw.write("\n");
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   
     
/**
 * 
 * @param arr
 * @return
 * 
 *   //grabs the total of the 2d array
 */
    public static double getTotal(double[][] arr){
        double total = 0;
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr[i].length; ++j){
                total += arr[i][j];
            }
        }
        return total;
    }
  
   /**
    * 
    * @param arr
    * @return
    *  //grabs the average
    */
    public static double getAverage(double[][] arr)

    {

         double total=0;

         int nCnt=0;

         for(int i=0;i<arr.length;i++)

         {

             for(int j=0;j<arr[i].length;j++)

             {   

                  total += arr[i][j];

                  nCnt += 1;

             }

         }

         return new Double(total/nCnt);

    }
    
  /**
   * 
   * @param arr
   * @param row
   * @return
   * 
   *   //gets the row total
   */
    public static double getRowTotal(double[][] arr, int row) {
        double total = 0;
        for(int i = 0; i < arr[row].length; ++i){
            total += arr[row][i];
        }
        return total;
    }

 /**
  * 
  * @param arr
  * @param col
  * @return
  *    //the row total
  */
    public static double getColumnTotal(double[][] arr, int col) {
        double total = 0;
        for(int i = 0; i < arr.length; ++i){
            if(col < arr[i].length)
            	
                total += arr[i][col];
        }
        return total;
    }
  /**
   * 
   * @param arr
   * @param idd
   * @return
   *   //get highest in the row
   */
    public static double getHighestInRow(double[][] arr,int idd)

    {

         double highElem=arr[idd][0];

         for(int aa=0;aa<arr[idd].length;aa++)

         {   

             if(arr[idd][aa]>highElem)

                  highElem= arr[idd][aa];

            

         }

         return highElem;

    }
    /**
     * 
     * @param arr
     * @param idd
     * @return
     * //finds the lowest in the row
     */
    public static double getLowestInRow(double[][] arr,int idd)

    {

         double LwElem=arr[idd][0];

         for(int aa=0;aa<arr[idd].length;aa++)

         {   

             if(arr[idd][aa]<LwElem)

                  LwElem= arr[idd][aa];

            

         }

         return LwElem;

    }
    
    /**
     * 
     * @param arr
     * @param idd
     * @return
     * //Get highest in column
     */
    public static double getHighestInColumn(double[][] arr,int idd)

    {
         double highElem=arr[0][idd];
         for(int kk=0;kk<arr.length;kk++)

         {

             if(idd<=arr[kk].length-1)

             {                 

                  if(arr[kk][idd]>highElem)

                  highElem= arr[kk][idd];

             }

            
         }

         return highElem;       

    }
    
   /**
    * 
    * @param arr
    * @param idd
    * @return
    *  //Gets the  lowest in column
    */
    public static double getLowestInColumn(double[][] arr,int idd)

    {

         double LwElem=arr[0][idd];

         for(int kk=0;kk<arr.length;kk++)

         {

             if(idd<=arr[kk].length-1)

             if(arr[kk][idd]<LwElem)

                  LwElem= arr[kk][idd];

         }

         return LwElem;    

    }
    
/**
 *     //Gets the highest element
 * @param arr
 * @return
 */
    public static double getHighestInArray(double[][] arr)

    {

         double highElem=arr[0][0];

         for(int kk=0;kk<arr.length;kk++)

         {

             for(int aa=0;aa<arr[kk].length;aa++)
             {   

                  if(arr[kk][aa]>highElem)

                       highElem= arr[kk][aa]; 

             }

         }

         return highElem;

    }
    
   /**
    *  //Gets the lowest element   
    * @param arr
    * @return
    */
    public static double getLowestInArray(double[][] arr)

    {

         double LwElem=arr[0][0];

         for(int kk=0;kk<arr.length;kk++)

         {

             for(int aa=0;aa<arr[kk].length;aa++)

             {   

                  if(arr[kk][aa]<LwElem)

                       LwElem= arr[kk][aa];
                

             }

         }

         return LwElem;

    }

}