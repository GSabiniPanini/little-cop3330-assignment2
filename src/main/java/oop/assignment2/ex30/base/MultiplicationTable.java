package oop.assignment2.ex30.base;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Glenroy Little
 */
public class MultiplicationTable
{
     private static final int TABLESIZE = 12;

     public void printtable()
     {
          for(int i=0; i<TABLESIZE; i++)
          {
               for(int j=0; j<TABLESIZE; j++)
               {
                    int output = rowoutput(j, i);
                    System.out.format("%4d ", output);
               }
               System.out.println();
          }
     }

     public int rowoutput(int row, int column)
     {
          int output = (row+1) * (column+1);
          return output;
     }
}
