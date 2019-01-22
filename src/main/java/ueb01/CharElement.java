package ueb01;

public class CharElement {
    public char value;
    public CharElement next;

    public CharElement(char v, CharElement e) {
        value = v;
        next = e;
    }
}
