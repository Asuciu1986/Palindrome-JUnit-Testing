# Palindrome JUnit Testing

## Abstract

<table>
<tr>
<td>
<p align="justify">Write a program to test if the input String is a Palindrome in Java. Input can be a Word, Number or even a Phrase.
</p>
<ul>
  <li>White space - acceptable</li>
  <li>Punctuation marks - not acceptable</li>
  <li>Any Case - acceptable</li>
</ul>
<p align="justify">Perform Unit testing with all possible:</p>
<ul>
  <li>Annotations</li>
  <li>Assert Statements</li>
  <li>Test any Exception</li>
</ul>
</td>
</tr>
</table>

## Installation

1. Download/Clone this repository.
2. Import the downloaded Java Project into some IDE (e.g., IntelliJ, Eclipse, etc.)
3. Run the [Palindrome.java](src/Palindrome.java) file for Palindrome Logic.
4. Run the [PalindromeTest.java](test/PalindromeTest.java) file for JUnit Test Cases.

## JUnit Test Cases

- Null String Test
```java
Input: null
Expected Output: NullPointerException
```

- Empty String Test
```java
Input: ""
Expected Output: true (Is a Palindrome)
```

- Multiple White Space Test
```java
Input: "A   Santa         at Nasa"
Expected Output: true (Is a Palindrome)
```

- Single Character Test
```java
Input: "H"
Expected Output: true (Is a Palindrome)
```

- Punctuation Test
```java
Input: "Eva, can I see bees in a cave?"
Expected Output: false (Not a Palindrome)
```

- Unicode Test
```java
Input: "\u20A9 My gym \u20A9"
Expected Output: false (Not a Palindrome)
```

- Alpha Numeric Test
```java
Input: "Air 2 an a2ria"
Expected Output: true (Is a Palindrome)
```

- Valid Palindrome Test
```java
Input: "No lemon no melon"
Expected Output: true (Is a Palindrome)
```

- Invalid Palindrome Test
```java
Input: "I am a tester"
Expected Output: false (Not a Palindrome)
```

## Credits

Abstract - Prof. Santhi Narayanankutty

## Contributor
| [![Nrupesh Patel](https://avatars.githubusercontent.com/nrupesh29?s=100)<br /><sub>Nrupesh Patel<br />CMPE 287</sub>](https://github.com/Nrupesh29)<br /> |
| :---: |
