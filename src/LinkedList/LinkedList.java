package LinkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * 尾部删除结点
 * 尾部添加结点
 * 查找结点
 * @author Avatar
 * @param <Item>
 */
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

    //查找结点
    public List<Item> search(Item item){
        Node index = first;
        ArrayList<Item> list = new ArrayList<>();
        while (index != null){
            if(index.item.equals(item)){
                list.add(item);
            }
            index = index.next;
        }
        return list;
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
                N--;
                break;
            }
            newlast = newlast.next;
        }
    }

    //输出所有结点
    public void show(){
        Node print = first;
        while (print != null){
            System.out.print(print.item + " ");
            print = print.next;
        }
        System.out.println();
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
        List list = linkedList.search("or");
        if(list.size() > 0 && list != null) {
            for (Object bean : list) {
                System.out.print(bean + " ");
            }
        }else{
            System.out.println("not this Node");
        }
        System.out.println();
    }

}
