package patterns;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class StreamExamples {
        public static void main(String[] args) {


            ///////////////////// GET EVEN AND ODD NUMBERS //////////////////////////

            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            // Separate even and odd numbers using Stream API
            Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
                    .collect(Collectors.partitioningBy(num -> num % 2 == 0));


            // Extracting even and odd lists
            List<Integer> evenNumbers = evenOddMap.get(true);
            List<Integer> oddNumbers = evenOddMap.get(false);

            // Display the results
            System.out.println("Original list: " + numbers);
            System.out.println("Even numbers: " + evenNumbers);
            System.out.println("Odd numbers: " + oddNumbers);

            
            ///////////////////// COUNT FREQUENCY OF STRING FROM LIST //////////////////////////

            List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

            // Count occurrences using Stream API
            Map<String, Long> occurrences = strings.stream()
                    .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

            // Display the result
            System.out.println("String occurrences: " + occurrences);

            
            ///////////////////// REVERSE NUMBER //////////////////////////

            // Convert the integer to a string and check for negative sign
            int number=123456;
            //boolean isNegative = number < 0;
            String numberStr = String.valueOf(Math.abs(number));

            // Reverse the digits using Stream API
            String reversedStr = numberStr.chars() // Convert string to IntStream
                    .mapToObj(c -> (char) c)       // Convert each char code to a Character
                    .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
                        java.util.Collections.reverse(list); // Reverse the list
                        return list.stream();
                    }))
                    .map(String::valueOf)          // Convert each Character back to String
                    .collect(Collectors.joining()); // Join reversed digits

            // Convert the reversed string back to an integer
            int reversedNumber = Integer.parseInt(reversedStr);
            System.out.println(reversedNumber);
            //from new Branch

    }
}
