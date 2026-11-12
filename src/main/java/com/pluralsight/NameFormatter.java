package com.pluralsight;

public class NameFormatter {
    public static void main(String[] args) {


}

    public static String format(String firstName, String lastName) {
        return lastName + " " + firstName;
    }

    public static String format(
            String prefix,
            String firstName,
            String middleName,
            String lastName,
            String suffix){

        return prefix + " " + firstName + " " + middleName + " " + lastName + ", " + suffix;
    }

    public static String format(String fullName) {
        String[] parts = fullName.split(" ");
        if (parts.length == 2) {
            return format(parts[0], parts[1]);
        }
        return "test";
    }
}
