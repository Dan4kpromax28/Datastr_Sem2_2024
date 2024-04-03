package datastr;

public class MyLinkedList<T> {
    private MyListNode first = null;
    private MyListNode last = null;
    private int counter = 0;

    // pec moklusejuma ir bezargumenta konstruktors -> MyLinked List

    public boolean isEmpty() {
        return (counter == 0);
    }

    //TODO padomat un izveidot isFull() funkciju

    public int howManyElements() {
        return counter;
    }

    public void add(T element) throws Exception {
        if (element == null) throw new Exception("Problems with elements");

        if (isEmpty()) {
            MyListNode newNode = new MyListNode(element);
            first = newNode;
            last = newNode;
            counter++;
        } else {
            MyListNode newNode = new MyListNode(element);
            newNode.setPrevious(last);
            last.setNext(newNode);
            last = newNode;
            counter++;
        }
    }

    public void print() throws Exception {
        if (isEmpty()) throw new Exception("List is empty");
        MyListNode temp = first;

        for (int i = 0; i < counter; i++) {
            System.out.println();
        }
    }

    public void add(T element, int position) throws Exception {
        if (element == null) throw new Exception("Problems with element");
        //1 parbaude uz position
        if (position < 0 || position > counter) throw new Exception("Problems with position input");
        //ja saraksts ir tukss c;
        if (isEmpty() && position == 0) {
            add(element);
            //TODO tas pats ka funkcija
            /*MyListNode newNode = new MyListNode(element);
            first = newNode;
            last = newNode;
            counter++;*/
        } else if (isEmpty() && position != 0) {
            throw new Exception("Problems with position");
        } else if (position == 0) {
            MyListNode newNode = new MyListNode(element);
            newNode.setNext(first);
            first.setPrevious(last);
            first = newNode;
            counter++;
        }
        //2 pievienot elementu prieksa
        else if (position == counter) {
            add(element);
            /*MyListNode newNode = new MyListNode(element);
            newNode.setPrevious(last);
            last.setNext(first);
            last = newNode;
            counter++; */
        } else {
            MyListNode temp = first;
            for (int i = 0; i < position; i++) {
                temp = temp.getNext();
            }

            MyListNode rightNode = temp;
            MyListNode leftNode = temp.getPrevious();
            MyListNode newNode = new MyListNode(element);

            newNode.setNext(rightNode);
            newNode.setPrevious(leftNode);
            leftNode.setNext(newNode);

            counter++;
        }

        //3 pielikt elementu beigas

        //4 pielikt elementu pa vidu
    }

    //delete
    //funkcijas deklaracija
    //parbaude uz isEmpty
    //parbaude uz position

    // 1. ja dzesam pirmo elementu
    // 2. ja dzesam pedejo elementu
    // 3. ja dzesam kadu pa vidu

    public void delete(int position) throws Exception {
        if (isEmpty()) throw new Exception("There is no element to delete");
        if (position < 0 || position > counter) throw new Exception("Incorrect position input");
        if (position == 0) {
            MyListNode theNewFirst = first.getNext();
            theNewFirst.setPrevious(null);
            first = theNewFirst;
            counter--;
            System.gc();
        } else if (position == counter) {
            MyListNode theNewLast = last.getPrevious();
            theNewLast.setNext(null);
            last = theNewLast;
            counter--;
            System.gc();
        } else {
            MyListNode temp = first;
            for (int i = 0; i < position; i++){
                temp = temp.getNext();
            }
            MyListNode rightNode = temp;
            MyListNode leftNode = temp.getPrevious();


        }


    }


}
