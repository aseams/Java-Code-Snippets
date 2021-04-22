# Java-Code-Snippets
Contains various Java programs I've written for both personal and school-related projects

## Anagram-Generator
Using recursion, the input will be jumbled and output to stdout for all combinations of the input.

## Circle-Money
x number of people in a circle. Starting at person 1, give a bill to each, and move on. Who gets to $500 first?
Available bills: 1,5,10,20,50,100

## Easy-Numbers
Original Problem: https://www.codechef.com/problems/EZNO

While studying representation of numbers in various bases, Chef discovered an interesting properties of some positive numbers, which Chef believed are somewhat easy to memorize. Chef called such positive numbers easy numbers.

These numbers had an interesting property: Let the base Chef is currently studying be b. Represent the number in base b (without leading zeros). For each prefix of length k (from 1 to number of digits in number in the base), the number formed by considering the digits of the prefix in base b is divisible by k.

For example, let base Chef is studying be 2.

1 is an easy number as its prefix of length 1 (i.e. 1) is divisible by 1.
2 is also an easy number, as its prefix of length 1 (i.e. 1) is divisible by 1 and the prefix of length 2 (i.e. 2, represented as 10 in base 2) is also divisible by 2.
3 is not an easy number, as its prefix of length 2 (i.e. 3, represented as 11 in base 2) is not divisible by 2.
Now Chef finds these numbers easy and thinks that following question related to easy numbers will be easy for you too. He asks you to find the number of easy numbers represented in base b and consisting of exactly d digits. As the answer could be quite large, output it modulo 109 + 7.

## FizzBuzz
Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".

## Multiplicative-Persistence
The persistence of an integer is the number of times you can perform the following before ending up at a single digit:
1) Take the digits of the integer and multiply them together to give a new integer.
2) Repeat #1 using the new integer.

## Pascals-Triangle
In Pascal's triangle, each number is the sum of the two numbers directly above. Given an integer numRows, return the first numRows of Pascal's triangle.

## Payroll-Overtime-Calculator
Custom homework problem from an Intro to Java course. Calculates all payroll given hours worked, hourly pay, and number of dependents.

## Roulette
Semi-useful text-based game of Roulette (the casino game). 

## Sales_demo
Custom homework problem from an Intro to Java course. Calculates average sales, commission %, sales commission, and total pay for a given employee.

## Slot-Machine
Semi-usable text-based slot machine. Written as a personal project to try incorporating as many concepts as I could. 

## Stock-Market-Simulation
Custom homework problem from an Intro to Java course. I do not have the writeup anymore, so I'm not sure what the exact requirements were. 

## Sunlight-Problem
Given are the heights of certain Buildings which lie adjacent to each other. Sunlight starts falling from left side of the buildings. If there is a building of certain Height, all the buildings to the right side of it having lesser heights cannot see the sun. The task is to find the total number of such buildings that receive sunlight.
Example Input:      Expected Output:
6 2 8 4 11 13       Number of building receiving sunlight = 4

## Surpasser-Count
Original Problem: https://practice.geeksforgeeks.org/problems/surpasser-count0615/1
A surpasser of an element of an array is a greater element to its right, therefore x[j] is a surpasser of x[i] if i < j and x[i] < x[j]. The surpasser count of an element is the number of surpassers. Given an array of distinct integers, for each element of the array find its surpasser count i.e. count the number of elements to the right that are greater than that element.
Example Input       Expected Output
4 5 1 2 3           1 0 2 1 0

## Z-Score-Table
Custom homework assignment from a statistics course. Program generates a table of Z-Scores up to a given value. To calculate Z:
<a href="https://www.codecogs.com/eqnedit.php?latex=\dpi{150}&space;\bg_white&space;\large&space;{\color{Black}&space;Z=\frac{\chi-\mu}{\sigma}}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?\dpi{150}&space;\bg_white&space;\large&space;{\color{Black}&space;Z=\frac{\chi-\mu}{\sigma}}" title="\large {\color{Black} Z=\frac{\chi-\mu}{\sigma}}" /></a>
