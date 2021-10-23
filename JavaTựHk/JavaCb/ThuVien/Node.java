package ThuVien;

public class Node {
    private ThongTin data;
    private Node next;

    public Node() {
        data = null;next=null;
    }

    public Node(ThongTin data, Node next) {
        this.data = data;
        this.next = next;
    }

    public ThongTin getData() {
        return data;
    }

    public void setData(ThongTin data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
