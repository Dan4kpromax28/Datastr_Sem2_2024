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
            counter++;
        }
        else{
            MyListNode newNode = new MyListNode(element);
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
            counter++;
        }
    }

    public void print() throws Exception{
        if(isEmpty()) throw new Exception("List is empty");

        MyListNode temp = first;

        for (int i = 0; i < counter; i++){
            System.out.println();
        }
    }
}
