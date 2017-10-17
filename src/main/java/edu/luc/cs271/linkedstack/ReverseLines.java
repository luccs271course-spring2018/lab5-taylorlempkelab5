package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order
<<<<<<< HEAD
    LinkedStack<String> stack = new LinkedStack<String>();

    final Scanner input = new Scanner(System.in);
    String line;
    
    while(input.hasNextLine())
=======

    LinkedStack<String> stack = new LinkedStack<String>();
    final Scanner input = new Scanner(System.in);
    String line;

    while (input.hasNextLine())
>>>>>>> 285bfe17c286f438361b85b4f708b43f85f5fa8e
    {
      line = input.nextLine();
      stack.push(line);
      if (line.equals(null))
      {
        break;
      }
<<<<<<< HEAD
    }
    
    while (!stack.isEmpty());
    {
      System.out.println(stack.pop());
=======
>>>>>>> 285bfe17c286f438361b85b4f708b43f85f5fa8e
    }

    while (!stack.isEmpty())
    {
      System.out.println(stack.pop());
    }
  }
}

