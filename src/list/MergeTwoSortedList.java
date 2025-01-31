package list;

public class MergeTwoSortedList {
    public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(-1);
        SinglyLinkedListNode temp = node;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if(head1 != null){
            temp.next = head1;
        }else temp.next = head2;

        return node.next;
    }
    public void printList(SinglyLinkedListNode node){
        while (node != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    public static void main(String[] args) {

        MergeTwoSortedList list = new MergeTwoSortedList();

        SinglyLinkedListNode node = new SinglyLinkedListNode(1);
        node.next = new SinglyLinkedListNode(3);
        node.next.next = new SinglyLinkedListNode(7);

        SinglyLinkedListNode node1 = new SinglyLinkedListNode(1);
        node1.next = new SinglyLinkedListNode(2);

        SinglyLinkedListNode mergeLists = mergeLists(node, node1);
        list.printList(mergeLists);
    }
}
