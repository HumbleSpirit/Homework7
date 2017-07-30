/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework7;

import java.util.Scanner;

/**
 *
 * @author sergey
 */
public class Homework7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        
        /*System.out.println("Task 1");
        System.out.println("Enter array of 5 elements and print it in reverse order");
        int a = 5;
        int array[] = new int[a];
        
        for (int i = 0; i < array.length; i++) 
            {
                System.out.println("Please enter " + i + " element");
                array[i] = in.nextInt();
            }
        System.out.println("\n");
        
        for (int i = 0; i < array.length; i++) 
            {
                System.out.print(array[i] + " ");
            }
        System.out.println("\n");
        
        int temp = 0;
        for (int j = 0; j < array.length/2; j++)
            {
                temp = array[j];
                array[j] = array[array.length - j - 1];
                array[array.length -j - 1] = temp;
            }
        for (int i = 0; i < array.length; i++) 
            {
                System.out.print(array[i] + " ");

            }
        System.out.println("\n");
        array = null;
        
        
        System.out.println("Task 2");
        System.out.println("Display even indices from elements of array of  20 random numbers");
        int b = 20;
        int arrayB[] = new int[b];
        
        for (int i = 0; i < arrayB.length; i++)
            {
                 arrayB[i] = ((int)(Math.random()*105));
            }
        for (int i = 0; i < arrayB.length; i++) 
            {
                if (i % 2 == 0)
                System.out.println(i + " " + arrayB[i] + "; ");
            }
        
        System.out.println("Task 3");
        System.out.println("Display median of positive elements in array of 10 random numbers from -20 to 20");
        int c = 10;
        int minRangeC = -20;
        int maxRangeC = 20;
        int summOfPositiveNumbers = 0;
        int countOfPositeveNumbers = 0;
        int arrayC[] = new int[c];
        for (int i = 0; i < arrayC.length; i++)
            {
                 arrayC[i] = (int)(Math.random() * (maxRangeC - minRangeC + 1) + minRangeC);
            }
        for (int i = 0; i < arrayC.length; i++) 
            {
                if (arrayC[i] >= 0)
                    {
                        summOfPositiveNumbers += arrayC[i];
                        countOfPositeveNumbers++;
                        System.out.println(i + " " + arrayC[i] + "; ");
                    }
            }
        System.out.println(summOfPositiveNumbers / countOfPositeveNumbers);
        System.out.println("\n");

        System.out.println("Task 4");
        System.out.println("Count number of positive, negative and zero elements in array of 10 random numbers from -5 to 5");
        int d = 10;
        int minRangeD = -5;
        int maxRangeD = 5;
        int countOfPositiveValues = 0;
        int countOfNegativeValues = 0;
        int countOfZeroValues = 0;
        
        int arrayD[] = new int[d];
        for (int i = 0; i < arrayD.length; i++)
            {
                 arrayD[i] = (int)(Math.random() * (maxRangeD - minRangeD + 1) + minRangeD);

                 if (arrayD[i] > 0)
                 {
                     countOfPositiveValues++;
                 }
                 else if (arrayD[i] < 0)
                 {
                     countOfNegativeValues++;
                 }
                 else
                 {
                     countOfZeroValues++;
                 }
            }
        System.out.println("Number of positive values is " + countOfPositiveValues);
        System.out.println("Number of negative values is " + countOfNegativeValues);
        System.out.println("Number of zero values is " + countOfZeroValues);
        
        
        System.out.println("Task 5");
        System.out.println("Count summ of values of positive indices and median of values of negative indices of elements in array of 10 random numbers ");
        int e = 10;
        int summOfPositiveIndices = 0;
        int medianOfNegativeIndices = 0;
        int countOfNegativeIndices = 0;
        int arrayE[] = new int[e];
        for (int i = 0; i < arrayE.length; i++)
            {
                 arrayE[i] = ((int)(Math.random()*100));
            }
        for (int i = 0; i < arrayE.length; i++) 
            {
                if (i % 2 == 0)
                {
                    summOfPositiveIndices += arrayE[i];
                }
                else
                {
                    countOfNegativeIndices++;
                    medianOfNegativeIndices += arrayE[i];
                }
            }
        System.out.println("Summ of values of positive indices is " + summOfPositiveIndices);
        System.out.println("Median of values of negative indices is " + medianOfNegativeIndices / countOfNegativeIndices);
        
        
        System.out.println("Task 6");
        System.out.println("Count occurences of user entered number in array");
        int f = 0;
        int userInput1 = 0;
        int compareCounter = 0;
        System.out.println("Please enter a size of array");
        f = in.nextInt();
        int arrayF[] = new int[f];
        for (int i = 0; i < arrayF.length; i++)
            {
                 arrayF[i] = ((int)(Math.random()*100));
            }
        System.out.println("Please enter a number in range from 0 to 100");
        userInput1 = in.nextInt();  
        
        for (int i = 0; i < arrayF.length; i++) 
            {
                if (userInput1 == arrayF[i])
                {
                    compareCounter++;
                }
            }
        System.out.println("User entered number " + userInput1 + " had been appeared in array of "+ f +" elements " + compareCounter + " times");
        
        
        System.out.println("Task 7");
        System.out.println("Create array of 10 random elements from 0 to 100. Count numbers, which aliquot 3, 5, 7");
        int g = 1000;
        int arrayG[] = new int[g];
        int aliquotTo_3 = 0;
        int aliquotTo_5 = 0;
        int aliquotTo_7 = 0;
        int aliquotTo_3a = 0;
        int aliquotTo_5a = 0;
        int aliquotTo_7a = 0;
        for (int i = 0; i < arrayG.length; i++)
            {
                 arrayG[i] = (int)(Math.random() * 101);
            }
        for (int i = 0; i < arrayG.length; i++)
            {
                
               // Так как в задаче стоит проверка на делимость 3, 5, 7 то необходимо учитывать проверку 
               // на делимость на каждое число, а не только на первое выпавшее
                
                //Если условие "или" для каждого делителя, то добавить "else" во втором и третьем "if",
                //тогда потеряются 15 для 5, 21 для 7 , 30 для 5, 35 для 7, 42 для 7 , 45 для 5, 60, 63...
                //Значение для "3" всегда будут одинаковыми
                //Увеличил для наглядности размер массива
                //Проверка во втором цикле
                
                 if (arrayG[i] % 3 == 0)
                 {
                     aliquotTo_3++;
                 }
                 if (arrayG[i] % 5 == 0)
                 {
                     aliquotTo_5++;
                 }
                 if (arrayG[i] % 7 == 0)
                 {
                     aliquotTo_7++;
                 }
                 
            }
        System.out.println("3; " + aliquotTo_3);
        System.out.println("5; " + aliquotTo_5);
        System.out.println("7; " + aliquotTo_7);
        
        for (int i = 0; i < arrayG.length; i++)
            {
                if (arrayG[i] % 3 == 0)
                {
                    aliquotTo_3a++;
                }
                else if (arrayG[i] % 5 == 0)
                {
                    aliquotTo_5a++;
                }
                else if (arrayG[i] % 7 == 0)
                {
                    aliquotTo_7a++;
                }
            }
        System.out.println("3a; " + aliquotTo_3a);
        System.out.println("5a; " + aliquotTo_5a);
        System.out.println("7a; " + aliquotTo_7a);*/
        
        
        
        System.out.println("Task 8");
        System.out.println("Create array of 10 random elements from 0 to 100. Count numbers, which aliquot to 3 but not to 5");
        int h = 10;
        int arrayH[] = new int[h];
        int aliquotTo_3 = 0;
        int not_AliquotTo_5 = 0;
        
        for (int i = 0; i < arrayH.length; i++)
            {
                 arrayH[i] = (int)(Math.random() * 101);
            }
        for (int i = 0; i < arrayH.length; i++)
            {
                 if (arrayH[i] % 3 == 0)
                    {
                        aliquotTo_3 += arrayH[i];
                    }
                 else if (arrayH[i] % 5 != 0)
                    {
                        not_AliquotTo_5 += arrayH[i];
                    }
                 
            }
        System.out.println("3; " + aliquotTo_3);
        System.out.println("not 5; " + not_AliquotTo_5);
    }
    
    
    
}
