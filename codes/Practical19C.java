public class Practical19C {
public static void main(String[] args) {
          // Define a sample string
          String sampleString = "Hello, World!";
int length = sampleString.length(); System.out.println("Length of the string: " + length);
          // Concatenation
String name = "John";
String greeting = "Hello, " + name + "!"; System.out.println("Concatenated string: " + greeting);
          // Substring extraction
String substring = sampleString.substring(7); System.out.println("Substring: " + substring);
char character = sampleString.charAt(0); System.out.println("First character: " + character);
int indexOfWorld = sampleString.indexOf("World"); System.out.println("Index of 'World': " + indexOfWorld);
          // Case conversion
String uppercase = sampleString.toUpperCase(); String lowercase = sampleString.toLowerCase(); System.out.println("Uppercase: " + uppercase); System.out.println("Lowercase: " + lowercase);
          // String comparison
String str1 = "java";
String str2 = "Java";
boolean isEqual = str1.equals(str2);
boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); System.out.println("Are str1 and str2 equal? " + isEqual);
// Length of the string
// Character extraction
// Index of a substring
System.out.println("Are str1 and str2 equal (ignoring case)? " + isEqualIgnoreCase);
// String trimming
String stringWithWhitespace = " Hello ";
String trimmedString = stringWithWhitespace.trim(); System.out.println("Trimmed string: '" + trimmedString + "'");
// String replacement
String replacedString = sampleString.replace("Hello", "Hi"); System.out.println("Replaced string: " + replacedString);
// Splitting a string
String csvData = "Ram,Leela,30"; String[] splitData = csvData.split(","); System.out.println("Split data:");
for (String item : splitData) {
System.out.println(item); }
} }