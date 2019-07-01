package day06.Iterator;

import java.util.Iterator;

public class SimpleList {
    private Link first;
    private Link last;

    public void append(Object item) {
        if (first == null) {
            first = new Link(item);
            last = first;
        } else
            last = last.append(item);
    }

    public Iterator iterator() {
        return new SimpleListIterator();
    }

    private class SimpleListIterator implements Iterator {
        private Link current = null;

        public boolean hasNext() {
            if (current == null)
                return first != null;
            else
                return current.getNext() != null;
        }

        public Object next() {
            Object item = null;

            if (current == null)
                current = first;
            else
                current = current.getNext();

            if (current != null)
                item = current.getItem();

            return item;
        }

        // Remove current item
        public void remove() {
            // TODO:

            if (current == first) {
                first = first.getNext();
                return;
            }

            Link temp = first;
            while (temp.getNext() != null) {
                if (temp.getNext() == current) {
                    Link prev = temp;
                    if (current == last) {
                        last = prev;
                    }
                    prev.setNext(current.getNext());
                    return;
                }
                temp = temp.getNext();
            }


        }
    }

    // Using its own Iterator
    public int count() {
        int count = 0;


        for (Iterator iterator = this.iterator(); iterator.hasNext(); ) {
            iterator.next();
            count++;
        }


        // TODO:

        return count;
    }
}
