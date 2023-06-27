import java.util.NoSuchElementException;

class Element<T>{

    private T data;
    private Element next;

    public Element(T data,Element next) {
        this.data = data;
        this.next = next;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }

}

class SimpleLinkedList<T> {

    private int size;
    private Element head;
    SimpleLinkedList() {
        size = 0;
        head = null;
    }

    SimpleLinkedList(T[] values) {
        for (int i = 0; i < values.length; i++) {
            this.push(values[i]);
        }
    }

    void push(T value) {

        head = new Element(value,head);
        size++;

    }

    T pop() throws NoSuchElementException {
        if(size == 0) throw new NoSuchElementException();

        T val = (T) head.getData();
        head = head.getNext();
        size--;
        return  val;

    }

    void reverse() {


        Element prev = head.getNext();
        head.setNext(null);

        while(prev!=null){
            Element temp = prev.getNext();
            prev.setNext(head);
            head = prev;
            prev = temp;
        }

    }

    T[] asArray(Class<T> clazz) {
        Object[] result = new Object[size];
        Element temp = head;
        int i = 0;
        while(temp!=null){
            result[i++] = temp.getData();
            temp = temp.getNext();
        }
        return (T[]) result;
    }

    int size() {
        return size;
    }
}
