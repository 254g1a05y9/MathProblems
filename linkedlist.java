class node{
    int data;
     node next;

    node(int data1, node next1){
        this.data =data1;
        this.next=next1;
    } 
    node(int data1){
        this.data =data1;
        this.next=null;

    }
};
public class linkedlist{
    public static void main(String[] args) {
        int[] arr={2,5,6,8};
        node y=new node(arr [3]);
        System.out.print(y.data);
    }
}