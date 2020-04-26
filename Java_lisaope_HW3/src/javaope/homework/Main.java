package javaope.homework;

import java.util.Scanner;
import java.io.*;

public class Main {

    private static final String FILE_PATH = "C:/Users/IBM/Desktop/Cleveron/Java_lisaope_HW3/src/javaope/homework/%s.txt";


    //private static int data[] = new int[5]M
    private static String data[] = new String[5];
    private static String city;
    private static int lines = 0;
    private static int shows = 0;


    public static void main(String[] args) throws IOException, FileNotFoundException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the .txt file name to proceed: ");
        String file = String.format(FILE_PATH, br.readLine());

        file_reader(file);

    }

    public static void count_lines(String FILE_PATH) throws IOException, FileNotFoundException {
        LineNumberReader lineReader = new LineNumberReader(new FileReader(FILE_PATH));

        while((lineReader.readLine()) != null) {
            lines++;
        }

        lineReader.close();
    }

    public static void file_reader(String FILE_PATH) throws IOException, FileNotFoundException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        count_lines(FILE_PATH);

        Scanner input = new Scanner(new FileReader(FILE_PATH));

        data_process(input.nextLine());

        show_data(data, city);

        shows++;

        for (int i = shows; shows < lines; i++) {
            System.out.println("Theres more data. Want to see it? y/n");
            if(br.readLine().equals("y")) {
                data_process(input.nextLine());
                show_data(data, city);
                shows++;
                if (shows == lines)
                    System.out.println("No more data to show.");
            } else {
                System.out.println("You dont want to see more of my data? :( okay");
                break;
            }
        }

        input.close();
    }

    public static void data_process(String whole_line) {
        int first_digit = 0;

        for (char c : whole_line.toCharArray()) {
            if (Character.isDigit(c)) {
                first_digit = whole_line.indexOf(c);
                break;
            }
        }

        city = whole_line.substring(0, first_digit -1);

        //data = whole_line.indexOf(first_digit);
        data = whole_line.substring(first_digit).split(" ");


    }

    public static int lowest_temp(String[] data) {
        int min = Integer.parseInt(data[0]);
        for (int i = 0; i < data.length; i++) {
            if (min > Integer.parseInt(data[i])) {
                min = Integer.parseInt(data[i]);
            }
        }

        return min;

    }

    public static int highest_temp (String[] data) {
        int max = Integer.parseInt(data[0]);
        for (int i = 0; i < data.length; i++) {
            if (max < Integer.parseInt(data[i])) {
                max = Integer.parseInt(data[i]);
            }
        }

        return max;

    }

    public static double avg_temp(String[] data) {
        double sum_of_temps = 0;

        for (int i = 0; i < data.length; i++) {
            sum_of_temps += Double.parseDouble(data[i]);
        }

        double avg = sum_of_temps / data.length;
        return avg;
    }

    public static double avg_temp_without_min_max(String[] data) {
        double sum_of_temps = 0;

        for (int i = 0; i < data.length; i++) {
            if(Double.parseDouble(data[i]) == highest_temp(data) || Double.parseDouble(data[i]) == lowest_temp(data)) {
                continue;
            } else {
                sum_of_temps += Double.parseDouble(data[i]);
            }
        }
        double avg = sum_of_temps / (data.length -2);
        return avg;
    }

    public static void show_data(String[] data, String city) {
        System.out.println(String.format("Lowest temperature for %s was %d!", city, lowest_temp(data)));

        System.out.println(String.format("Highest temperature for %s was %d!", city, highest_temp(data)));

        System.out.println(String.format("Average temperature for %s was %f!", city, avg_temp(data)));

        System.out.println(String.format("Without lowest and highest temperature, the average temperature for %s was %f!", city, avg_temp_without_min_max(data)));
    }
}
