package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
<<<<<<< HEAD
import java.util.*;
=======
import java.util.NoSuchElementException;
>>>>>>> 285bfe17c286f438361b85b4f708b43f85f5fa8e


public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;

  // TODO why don't we need an explicit constructor?

  @Override
  public E push(final E obj)
  {
    // TODO
<<<<<<< HEAD
    // DONE
    top = new Node<>(obj, top);
    return null;
=======
    top = new Node<>(obj, top);
    return obj;
>>>>>>> 285bfe17c286f438361b85b4f708b43f85f5fa8e
  }

  @Override
  public E peek()
  {
    // TODO
<<<<<<< HEAD
    if (isEmpty()){
=======
    if (isEmpty())
    {
>>>>>>> 285bfe17c286f438361b85b4f708b43f85f5fa8e
      throw new NoSuchElementException();
    }
    return top.data;
  }

  @Override
  public E pop()
  {
    // TODO
<<<<<<< HEAD
    // DONE
    if(isEmpty()){
      throw new NoSuchElementException();
    }
    else{
=======
    if (isEmpty()) {
      throw new NoSuchElementException();
    }
    else {
>>>>>>> 285bfe17c286f438361b85b4f708b43f85f5fa8e
      E newTop = top.data;
      top = top.next;
      return newTop;
    }
  }

  @Override
  public boolean isEmpty()
  {
    // TODO
<<<<<<< HEAD
    // DONE
    if (top == null){
    return true;
    }
    else{
    return false;
    }
=======
    if (top == null)
      {return true;}
    else
      {return false;}
>>>>>>> 285bfe17c286f438361b85b4f708b43f85f5fa8e
  }

  @Override
  public List<E> asList()
  {
    // TODO implement using an ArrayList preallocated with the right
    List<E> preallocatedList = new ArrayList<E>();
    while (top != null)
    {
      preAlList.add(top.data);
      top = top.next;
    }
    // TODO add any instance variable(s) required to support this
<<<<<<< HEAD
    
    
    List<E> preAlList = new ArrayList<E>();
    while(top != null){
      preAlList.add(top.data);
      top = top.next;
    }
=======
>>>>>>> 285bfe17c286f438361b85b4f708b43f85f5fa8e
    return preAlList;
  }
}
