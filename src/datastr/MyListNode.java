package datastr;

public class MyListNode<T> {
    //TODO
    //1.variables - element, next un previous
    //2.get and set
    //3.constructors
    //4.toString

    private T element;
    private MyListNode next = null;
    private MyListNode previous = null;


    public T getElement() {
        return element;
    }

    public MyListNode getNext() {
        return next;
    }

    public MyListNode getPrevious() {
        return previous;
    }

    public void setElement(T element) {
        if (element != null){
            this.element = element;
        }else
            this.element = (T) new Object();
    }

    public void setNext(MyListNode next) {
        this.next = next;
    }

    public void setPrevious(MyListNode previous) {
        this.previous = previous;
    }

    public MyListNode(T element){
        setElement(element);
    }

    @Override
    public String toString() {
        return ""+element;
    }
}
