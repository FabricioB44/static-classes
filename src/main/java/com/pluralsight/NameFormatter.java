package com.pluralsight;

public class NameFormatter {
    public static void main(String[] args) {
        System.out.println(format("Dr. Mel B Johnson, PhD"));
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

        return lastName + " " + prefix + " " + firstName + " " + middleName + ", " + suffix;
    }

    public static String format(String fullName) {
        String[] parts = fullName.split(" ");

        switch (parts.length) {
            case 2:
                return format(parts[0], parts[1]);

            case 3:
                if (parts[0].contains(".")) {
                    return parts[2] + ", " + parts[0] + " " + parts[1];
                } else if (parts[1].contains(",")) {
                    return parts[1] + " " + parts[0] + ", " + parts[2];
                } else {
                    return parts[2] + ", " + parts[0] + " " + parts[1];
                }

            case 4:
                if (parts[0].contains(".") && parts[2].contains(",")) {
                    return parts[2] + " " + parts[0] + " " + parts[1] + ", " + parts[3];
                } else if (parts[0].contains(".")) {
                    return parts[3] + ", " + parts[0] + " " + parts[1] + " " + parts[2];
                } else {
                    return parts[2] + " " + parts[0] + " " + parts[1] + ", " + parts[3];
                }

            case 5:
                return format(parts[0], parts[1], parts[2], parts[3], parts[4]);

            default:
                return "Invalid Name Input";
        }
    }
}
