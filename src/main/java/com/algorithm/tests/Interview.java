package com.algorithm.tests;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Interview {

    public static void main(String[] args) {

       String date ="30-April-2021";
        String formatedDate = getFullDateFormatter(date);
        System.out.println(formatedDate);


        int[] numbers = {1,3,6,5,7,9,11};

        int[] ints = bubbleSort(numbers);
        Arrays.stream(ints).forEach(System.out::println);
    }

    public static String getFormatedDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        String formattedDate =null;
        try {
            formattedDate = LocalDate.parse(date, formatter).toString();

        }catch (Exception e){

        }
        return formattedDate;
    }

    public static String getFullDateFormatter(String date){
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .parseCaseInsensitive()
                .appendPattern("d-MMMM-yyyy")
                .toFormatter(Locale.US);
        String formattedDate = null;
        try {
            formattedDate = LocalDate.parse(date.replace(" ", "-"), formatter).toString();
        }catch (Exception e){
            e.printStackTrace();
        }
        return formattedDate;


    }

    //bubble sort
    public static int[]  bubbleSort(int[] numbers){
        int temp;
        for (int i =0; i<numbers.length; i++){
            for (int j =0; j<numbers.length-1; j++){
                if (numbers[j]>numbers[j+1]){
                    temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        return numbers;
    }

    //get buy and sell days
    public static void getBuySellDays(int[] numbers){
        int buyDay = 0;
        int sellDay = 0;
        int maxProfit = 0;
        for (int i =0; i<numbers.length; i++){
            for (int j =i+1; j<numbers.length; j++){
                int profit = numbers[j]-numbers[i];
                if (profit>maxProfit){
                    maxProfit = profit;
                    buyDay = i;
                    sellDay = j;
                }
            }
        }
        System.out.println("buyDay = "+buyDay);
        System.out.println("sellDay = "+sellDay);
        System.out.println("maxProfit = "+maxProfit);
    }

}
