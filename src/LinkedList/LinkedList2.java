package LinkedList;

import java.util.ArrayList;
import java.util.List;
/**
 * 头部删除结点
 * 头部添加结点
 * 查找结点
 * @author Avatar
 * @param <Item>
 */

public class LinkedList2<Item> {
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

    public void add(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public void delete(){
        Node newfirst = first;
        first = first.next;
        N--;
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
        LinkedList2 linkedList2 = new LinkedList2();
        linkedList2.add("to");
        linkedList2.add("be");
        linkedList2.add("or");
        linkedList2.add("not");
        linkedList2.add("to");
        linkedList2.add("be");
        linkedList2.add("go");
        linkedList2.show();//从右向左读
        linkedList2.delete();
        List list = linkedList2.search("or");
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
