package com.example.pointManagement.Helper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.security.SecureRandom;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;


public class Utils {

    public static boolean isDateBeforeByDays(LocalDate date1, LocalDate date2, int numberOfDays) {
        // Calculate the difference in days between the two dates
        long daysBetween = ChronoUnit.DAYS.between(date1, date2);

        // Check if the first date is before the second date by more than the specified number of days
        return daysBetween > numberOfDays;
    }




    public static boolean isSameDay(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(date1);
        cal2.setTime(date2);

        return cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
                cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH) &&
                cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH);
    }

    public static String generateRandomChars(int length) {
          final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        final SecureRandom RANDOM = new SecureRandom();
        StringBuilder code = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            code.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return code.toString();
    }


    @Converter
    public static class StringListConverter implements AttributeConverter<List<String>, String> {
        private static final String SPLIT_CHAR = "-----";

        @Override
        public String convertToDatabaseColumn(List<String> stringList) {
            return stringList != null ? String.join(SPLIT_CHAR, stringList) : "";
        }

        @Override
        public List<String> convertToEntityAttribute(String string) {
            return string != null ? Arrays.asList(string.split(SPLIT_CHAR)) : new ArrayList<>();
        }
    }
    public static String getNowTimeInString(){
        Date date = new Date();
        return getTimeInString(date);
    }

    public static String getTimeInString(Date date){
        long timestampInMillis = date.getTime();
        int timestampAsInt = (int) (timestampInMillis / 1000);
        return String.valueOf(timestampAsInt);
    }

    public static Date getDateFromString(String time){
        // Parse the string to an integer and multiply by 1000 to convert to milliseconds
        long timestamp = Long.parseLong(time) ;


        // Convert the timestamp to an Instant
        Instant instant = Instant.ofEpochMilli(timestamp);

        // Convert the Instant to LocalDateTime in UTC
        Date dateTime = Date.from(instant);

        // Print the dateTime for debugging
        System.out.println("date time=" + dateTime);


        // Return the LocalDateTime
        return dateTime;
    }

    public static String getTimeInMillisecond(Date date){

        long timestampInMillis = date.getTime();
        System.out.println(timestampInMillis);
        return String.valueOf(timestampInMillis);
    }




}
