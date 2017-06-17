package android;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/4/14.
 * 双向链表
 */
public class DoubleLinkedlist implements Iterable{
    public static void main(String[] args) {
        DoubleLinkedlist datas=new DoubleLinkedlist();
        datas.add("aaa");
        datas.add("bbb");
        datas.add("ccc");
        datas.add("ddd");
        System.out.println(datas);
        datas.remove("bbb");
        System.out.println(datas);
    }

    @Override
    public Iterator iterator() {

        return null;
    }

    private class Node{
        Object data;//存储数据
        Node prev;//指向前一个结点
        Node next;//指向后一个结点
        public Node(Object data){
            this.data=data;
        }
    }

    private Node head;//头结点
    private Node rear;//尾结点

    /**
     * Object data添加数据
     * @param data
     */
    public void add(Object data){
        //把数据防盗结点中
        Node node=new Node(data);
        //把结点链接到链表中

        if (head==null){
            //链表为空
            head=node;//头结点
            rear=node;//尾结点
        }else {
            //从链表尾部添加数据
            //老的尾结点指向新的尾结点
            rear.next=node;
            //新的尾结点指向老的尾结点
            node.prev=rear;
            rear=node;
        }
    }

    //寻找数据所在的结点
    public Node find(Object data){
        Node temp=head;
        while (temp!=null){
            if (temp.data.equals(data) && temp.data.hashCode() == data.hashCode()){
                //找到数据
                break;
            }
            temp=temp.next;
        }
        return temp;
    }
    /**
     * 删除数据
     * @param data
     */
    public void remove(Object data){
        Node temp=find(data);
        if (temp !=null){
            if (head==temp && rear ==temp){
                //只有一个数据的时候
                head=null;
                rear=null;
            }else if (head == temp){
                //删除头结点
                head=head.next;//第二个结点成为头结点
                head.prev=null;//断开前一个结点的引用
            }else if (rear == temp){
                //删除尾结点
                rear=rear.prev;//倒数第二个结点成为尾结点
                rear.next=null;
            }else {
                //删除中间结点
                temp.prev.next=temp.next;
                temp.next.prev=temp.prev;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        Node temp=head;//从头结点取数据
        while (temp!=null){
            sb.append(temp.data+", ");
            temp=temp.next;
        }

        return sb+"";
    }
}
