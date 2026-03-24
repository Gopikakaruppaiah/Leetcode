class MyLinkedList {
    class Node{
    int val;
    Node prev;
    Node next;
    Node(int val){
        this.val=val;
        next=null;
        prev=null;
    }
    }
    Node head,tail;
    int count;
    public MyLinkedList() {
        head=tail=null;
        count=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=count){
            return -1;
        }
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=tail=nn;
        }
        else{
            nn.next=head;
            head.prev=nn;
            head=nn;
        }
        count++;
    }
    
    public void addAtTail(int val) {
        Node nn=new Node(val);
        if(head==null){
            head=tail=nn;
        }
        else{
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
        }
        count++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>count){
            return;
        }
        if(index==0) addAtHead(val);
        else if(index==count) addAtTail(val);
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node nn=new Node(val);
            nn.prev=temp;
            nn.next=temp.next;
            temp.next=nn;
            nn.next.prev=nn;
            count++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>=count){
            return;
        }
        if(index==0){
            head=head.next;
            if(head!=null) head.prev=null;
            else tail=null;
            count--;
        }
        else if(index==count-1){
            tail=tail.prev;
            if(tail==null){
                head=null;
            }else{
                tail.next=null;
            }
            count--;
        }
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;
            count--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */