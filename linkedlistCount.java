public class linkedlistCount {
    Node head;
    class Node{
        int data=0;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
        public void add(int data){
            Node n=new Node(data);
            if(head==null){
                head=n;
                return;
            }
            n.next=head;
            head=n;
        }
        public void delete(){
            if(head==null){
                System.out.println("the list is empty");
            }
            head=head.next;
        }
        public void print(){
            Node curr=head;
            while(curr!=null){
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.print(" "+null);
        }
        public void count(int index){
            Node curr=head;
            while(index!=0){
                curr=curr.next;
            }
            System.out.println(curr);
        }
        public static void main(String[] args) {
            linkedlistCount h=new linkedlistCount();
            h.add(1);
            h.add(2);
            h.add(3);
            h.add(4);
            h.print();
            h.delete();
            h.count(2);


        }
    }
    

