You are given a string consisting of n lowercase Latin letters. You must find the count of number of larger alphabets for every character of the string (according to lexicographical order).

Input
The first line of input contains an integer n, the length of the given string.
The second line of input contains a string.

Output
Print the count of number of larger alphabets for every character of the string on a single line. Separate elements by white spaces.

Constraints
1 <= n <= 100

Example#1
Input
3
abc
Output
2 1 0
Explanation: a - 2: 'a' < 'b', 'a' < 'c'. 'b' - 1: 'b' < 'c'. 'c' - 0: There is no letter in this string, which is larger than 'c'.
Example#2
Input
5
aaabb
Output
2 2 2 0 0
Explanation: a - 2: 'a' < 'b' (b at index 3 and index 4). There is no letter in this string, which is larger than 'b'.
