## Input
There are many different ways to get user input. We are going to use the `Scanner` class. In order to use the class to get input, we must

1. `import java.util.scanner;`
2. Create a Scanner object
3. Output prompt to guide user

`Scanner user = new Scanner(System.in);`

### Input Types
1. `nextInt()` reads integer value from user
2. `nextFloat()` or `nextDouble()` reads a decimal value from user
3. `nextBoolean()` reads boolean value from user
4. `nextLine()` reads a String value

## String
A collection of characters. Strings are immutable, which means they cannot be changed.

Ex: `"My name is Aileen"`
Ex: `"I have 4 dogs"`

### Constructing String Objects
We can construct string objects similar to primitive data types.
`String name = "Aileen";`

### Concatentation of Strings

Strings can be added together using an operator called concatentation. (+)

Example:

`String firstName = "Aileen";`

`String lastName = "Zhu";`

`String fullName = firstName + lastName;`

Example:

`String id = 5;`

### Comparing Strings
In Java, you can compare strings using two different methods.
- `equals()` method
- `comparesTo()` method

**For the equals() method:**

`string1.equals(string2);`, this returns a boolean value, either true if the two strings are equal, or false otherwise.

Example:

`String dog = "Dog";`

`String cat = "Cat";`

`System.out.println(dog.equals(cat));` results in false

**For the compareTo() method:**

`string1.compareTo(string2);`

This method returns:
- Returns 0 if the two strings are equal
- Returns a value less than 0 if the first string precedes the second string in the dictionary
- Returns a value greater than 0 if the second string precedes the first string in the dictionary

### Indexing Strings

Even though strings are immutable, you are able to take parts of a string to use for a new string.

**Method: substring()**
The substring() method has two different forms:
- string1.substring(Integer num)
  - The first for takes a single integer input and returns the character of the string from the index of the input to the end
Example:

`String dinasaur = "Triceratops";`

`String half = dinasaur.substring(5);`

- `string1.substring(Integer num1, Integer num2);`
  - The second form takes two integer inputs and returns the characters of the string from the index of the first input to the character before the index of the second input.
Example:

`String dinasaur = "Triceratops";`

`String part = dinasaur.substring(2, 6);`

### Other String methods
There are other string methods that are useful!

String length:

To find the length of a string, you can use the method length(). This method returns the length of the string as an integer. 

Example:

`String name = "Nicholas";`
`int length = name.length();` returns the integer value 8.