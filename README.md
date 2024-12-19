# Java Problem Solving

1. Here is the 10 students CGPA [3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75]  
   Find out who achieved the 2nd highest score. (without sorting, use linear searching algorithm)  
   **Approach Description**:  
   This program finds the second highest score in a CGPA array using a single traversal approach. It initializes two variables, highestScore and secHighestScore, to track the largest and second-largest values. During iteration, if a value is greater than highestScore, it updates both variables; otherwise, it checks and updates secHighestScore if the value is smaller than highestScore but larger than the current secHighestScore.

2. Sort the above scores from according to the order of highest CGPA (don’t use Arrays.sort() method, do it programmatically)  
   **Approach Description**:  
   The program uses a nested loop sorting algorithm to sort an array of CGPA values in descending order. It compares each CGPA with the rest of the array and swaps values when a larger CGPA is found. This ensures the largest values are placed at the beginning of the array iteratively. The sorted CGPAs are then printed in descending order.

3. Take a CGPA as user input. Now from the given array find if your input CGPA is present using binary search algorithm  
   **Approach Description**:  
   This program sorts an array of CGPA values in ascending order using a nested loop and then performs a binary search to efficiently locate a specific CGPA entered by the user. The binary search algorithm ensures fast and accurate retrieval by dividing the sorted array into halves iteratively until the target is found or determined to be absent.

4. Generate random 10 integer numbers in an array and print out all the numbers from the array and also print the max and min number from the array.  
   **Approach Description**:  
   This program generates an array of 10 random integers between 1 and 100 using the Random class in Java. It then iterates through the array to determine the maximum and minimum values by initializing both to the first element and comparing each value. Finally, it prints the generated numbers along with the identified maximum and minimum values.

5. Write a program that will break down the amount and count notes for any given amount. Here is the notes in the given array:  
   notes=[1000,500,200,100,50,20,10,5,2,1]  
   **Input**: 546  
   **Output**:  
   500 1  
   20 2  
   5 1  
   1 1  
    **Approach Description**:  
   This Java program calculates the breakdown of currency notes for a given amount using a predefined array of denominations. It leverages a for-each loop to iterate through the notes, computes the count of each denomination using division, and updates the remaining amount with the modulus operator. It ensures input validation by checking if the entered amount is greater than zero.

6. Write a program that will give following output:  
   12345  
   1234  
   123  
   12  
   1  
   12  
   123  
   1234  
   12345  
   **Approach Description**:
   This program prints a symmetrical numeric pattern, starting with descending sequences followed by ascending sequences. It uses nested for loops, where the outer loop controls the rows and 
   the inner loop manages the numbers printed in each row. The approach ensures a clean and structured output by systematically iterating through the range of numbers.

7. Take input as height of 10 babies in cm. Now find out the 2 lowest height of babies. (Don’t use Arrays.sort() method)
   
   **Approach Description**:
   This Java program reads the heights of 10 babies and identifies the two lowest heights from the input. It uses the Scanner class for user input, and implements a simple logic with 
   conditional checks to track the lowest and second-lowest values. The program ensures that the second-lowest height is distinct from the lowest height by comparing each input with both 
   values.

8. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:  
   **Input**: I am a SQA Engineer  
   **Output**:  
   Words: 5  
   Chars: 15  
   Vowel: 8  
   Consonant: 7
   
   **Approach Description** : 
   This Java program takes a sentence as input and counts the total number of words, characters, vowels, and consonants. It uses a loop to iterate through the string, utilizing conditional statements to identify spaces, vowels, and consonants. The isVowel method checks whether a character is a vowel by converting it to lowercase for case-insensitive comparison.

9. Write a program that evaluates a string entered by the user to determine whether it is binary or not.  
   **Example 1 input**: 1001  
   **Output**: true  
   **Example 2 input**: 2001  
   **Output**: false
    
    **Approach Description**: 
   This Java program checks whether a given string is a valid binary string (containing only '0' and '1'). It uses a Scanner to take user input and a loop to iterate through the string, validating each character. The isBinary() method returns true if all characters are binary, otherwise false.

10. Generate random password which length is 8. Should follow this password strategy: Min 1 capital letter, min 1 small letter, min 1 digit and min 1 special character.  
    **Sample output**: 1eGh$3pH
    
    **Approach Description**:
    This Java program generates a random password of specified length, ensuring it includes at least one uppercase letter, one lowercase letter, one digit, and one special character. It uses the Random class to select characters from predefined sets and then shuffles the final password to ensure randomness. The password length must be at least 8 characters to meet security requirements.

11. Remove Vowels from a String  
    **Input**: I am a SQA Engineer  
    **Output**: m sq ngnr
    
    **Approach Description**:  
    This Java program removes vowels (a, e, i, o, u) from an input string while maintaining the remaining characters. The approach converts the input to lowercase, iterates through each character, and checks if it's a vowel. Non-vowel characters are appended to a StringBuilder, and the final string is cleaned of extra spaces before being printed. It uses StringBuilder for efficient string manipulation and replaceAll for trimming spaces.

12. A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount? [Extract the digits from the paragraph and calculate the price]

    **Approach Description**:
    This program calculates the total cost of purchasing a laptop and a gaming mouse after applying a 15% discount. It extracts numerical values from a descriptive sentence using regular expressions, processes the data to compute the pre-discount total cost, calculates the discount amount, and outputs the final cost after the discount. Key functionalities include string manipulation, parsing, and basic arithmetic operations.

13. Extract Transaction Id from the given html:  
    ```html
    <!DOCTYPE html>
    <html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Transactions</title>
    </head>
    <body>
        <div>
            <div class="button">
                <p>Transaction Id: TXN1234</p>
            </div>
        </div>
    </body>
    </html>
    ```  
    **Output**:  
    Transaction Id: TXN1234
    
    **Approach Description**:This Java program uses the Jsoup library to parse an HTML document and extract a transaction ID from a specific paragraph tag element within a nested div with a class "button". It selects the element using a CSS selector (div.button > p), retrieves the text and prints the transaction ID. If the element is not found, it outputs a message indicating that the transaction ID is missing.

14. Check if an IP address is valid or invalid. Conditions:  
    IP address must be in this pattern: [digit]:[digit]:[digit]:[digit]. First digit should not be 0 or not be single digit;  
    **Example 1 input**: 192.168.0.1  
    **Output**: Valid IP  
    **Example 2 input**: 172.16.56  
    **Output**: Invalid IP  
    **Example 3 input**: 0.0.0.1  
    **Output**: Invalid IP  
    **Example 4 input**: 1.12.72.2  
    **Output**: Invalid IP
    
    **Approach Description**:
    The Prb14_IP_Validator Java program checks the validity of IP addresses by splitting the input into segments and verifying each segment against standard IPv4 rules. It ensures that the first segment does not start with "0" and that all segments are within the range of 0 to 255. Invalid IPs are flagged, and valid IPs are confirmed. The program uses string splitting and integer parsing for validation.

15. In a question paper, there are total 15 questions. Some question mark is 10 and some question mark is 5  
    How much question needed if I totaling 100 mark for 5 marks and 10 marks?  
    **Output**:  
    5 marks question is 10  
    10 marks question is 5
    
    **Approach Description**:
    This Java program solves the problem of distributing 15 questions with a total of 100 marks into 5-mark and 10-mark questions. It iterates through possible numbers of 5-mark questions, calculating the corresponding 10-mark questions, and checks if the total marks equal 100. The solution is printed once the condition is met. It uses a simple for-loop and conditional statements to determine the distribution.
