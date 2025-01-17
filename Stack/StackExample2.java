package Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next=null;
    }
}
public class StackExample2 {

    public Node head=null;

    public boolean iEmpty()
    {
        return head==null;
    }
    //Push
    public void push(int data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    //pop
    public int pop()
    {
        if(this.iEmpty())
        {
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }

    //Peek
    public int peek()
    {
        if(this.iEmpty())
        {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        StackExample stk=new StackExample();
        stk.push(10);
        stk.push(20);
        stk.push(25);
        stk.push(40);

        System.out.println(stk.peek());
    }
}
