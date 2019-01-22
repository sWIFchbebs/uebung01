package ueb01;

import java.util.NoSuchElementException;

class CharStackImpl implements CharStack {
    private CharElement head;

    @Override
    public void push(char c){
        if (head == null) {
            head = new CharElement(c,null);
            return;
        }

        CharElement ct = head;
        while(ct.next != null){
            ct = ct.next;
        }

        ct.next = new CharElement(c,null);
    }

    @Override
    public char pop(){

        if(size() == 0) {
            throw new NoSuchElementException("Stack is empty");
        } else if(size() == 1) {
            char r = head.value;
            head = head.next;
            return r;
        }else {
            CharElement cr = head;
            CharElement rem = cr;
            while (cr.next != null) {
                rem = cr;
                cr = cr.next;
            }
            CharElement r = cr;
            rem.next = null;
            return r.value;
        }
    }

    @Override
    public int size(){
        int length = 1;

        if(head != null) {
            CharElement cr = head;
            while(cr.next != null){
                cr = cr.next;
                length++;
            }
        } else {
            length = 0;
        }

        return length;
    }
}
