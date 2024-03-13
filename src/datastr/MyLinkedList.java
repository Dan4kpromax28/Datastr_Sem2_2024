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

    public void add(T element) throws Exception {
        if (element == null ) throw new Exception("Problems with elements");

        if(isEmpty()){
            MyListNode newNode = new MyListNode(element);
            first = newNode;
            last = newNode;
        }
        else{
            MyListNode newNode = new MyListNode(element);
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
            counter++;
        }
    }
}
