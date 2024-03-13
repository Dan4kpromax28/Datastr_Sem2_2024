package datastr;

public class MyLinkedList<T> {
    private MyListNode first = null;
    private MyListNode last = null;
    private int counter = 0;

    // pec moklusejuma ir bezargumenta konstruktors -> MyLinked List

    public boolean isEmpty(){
        return (counter==0);
    }

    //TODO padomat un izveidot isFull() funkciju

    public int howManyElements(){
        return counter;
    }
}
