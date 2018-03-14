package LinkedList;

public class LinkedList<Item> {
    private Node first;
    private Node last;
    private int N;

    private class Node{
        Node next;
        Item item;
    }

    public boolean isEmpty(){
        return first == null;
    }

    //从链表尾部添加结点
    public void add(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()){
            first = last;
        }else{
            oldlast.next = last;
        }
        N++;
    }

    //从链表尾部删除结点
    public void delete(){
        Node newlast = first;
        while (newlast != null){
            if(newlast.next == last){
                newlast.next = null;
                break;
            }
            newlast = newlast.next;
        }
    }

    public void show(){
        while (first != null){
            System.out.println(first.item + " ");
            first = first.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("to");
        linkedList.add("be");
        linkedList.add("or");
        linkedList.add("not");
        linkedList.add("to");
        linkedList.add("be");
        linkedList.add("go");
        linkedList.delete();
        linkedList.show();
    }

}
