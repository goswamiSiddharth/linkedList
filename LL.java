package LinkedList;
// import java.util.*;
class Main{
public static class Node{
    int data;
    Node next;
}
public static class LL {
    Node head;
    Node tail;
    int size;

    void addLast(int val){
        Node temp=new Node();
        temp.data=val;
        temp.next=null;
        if(size==0){
            head=tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
        }

        public int size(){
            return size;
        }

        public void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println();
        }

        public void removeFirst(){
            if(size==0){
                System.out.println("list is empty");
            }else if(size==1){
                head=tail=null;
                size=0;
            }else{
                head=head.next;
                size--;
            }
        }

        public int getFirst(){
            if(size==0){
                System.out.println("list is empty");
                return -1;
            }
            else{
                return head.data;
            }
        }

        public int getLast(){
            if(size==0){
                System.out.println("list is empty");
                return -1;
            }else{
                return tail.data;
            }
        }

        public int getAt(int idx){
            Node temp=new Node();
            if(size==0){
                System.out.println("list is empty");
            }else if(idx<0 || idx>=size){
                System.out.println("Invalid arguments");
                return -1;
            }else{
                 temp=head;
                for(int i=0;i<idx;i++){
                    temp=temp.next;
                }
            }
            return temp.data;
        }

        public void addFirst(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=head;
            head=temp;
            if(size==0){
                tail=temp;
            }
            size++;
        }

        public void addAt(int idx, int val){
            if(idx<0 || idx>=size){
                System.out.println("Invalid Argument");
            }else if(idx==0){
                addFirst(val);
            }else if(idx==size){
                addLast(val);
            }else{
                Node node=new Node();
                node.data=val;
                Node temp=head;
                for(int i=0;i<idx-1;i++){
                    temp=temp.next;
                }

                node.next=temp.next;
                temp.next=node;
                size++;
            }
        }

        public void removeLast(){
            if(size==0){
                System.out.println("Invalid argument");
            }else if(size==1){
                head=tail=null;
                size=0;
            }else{
                Node temp=head;
                for(int i=0;i<size-2;i++){
                    temp=temp.next;
                }
                tail=temp;
                temp.next=null;
                size--;
            }
        }
    }

    public static void main(String args){
        LL l=new LL();
        l.addLast(9);
        l.addLast(10);
        l.addLast(11);
        System.out.println(l.size());
        l.display();
    }
}



