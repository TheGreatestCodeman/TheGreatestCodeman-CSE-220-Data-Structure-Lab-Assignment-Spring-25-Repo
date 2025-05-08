// Task04: Word Decoder
public class Task2 {

    public static Node wordDecoder( Node head ){
        
        //You're suppose to create a new Dummy headed Singly Linked List in this method
        //Dummy head is basically a head Node where the elem is null
        // Node dHead = new Node(null, null); here the dHead is a Dummy Head

        //TO DO

        //remove the following line when you're ready to return the new head
        Node temp = head;
        int count = 0;
        int multiples = 0;
        String str = "";
        Node dHead = new Node(null, null);
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        multiples = 13 % count;
        for(int j = 0; j<count; j++){
            if(j !=0){
                if(j%multiples ==0 && j <count){
                str += temp.elem;
                }
        }
            temp = temp.next;
        }
        Character [] charr = new Character[str.length()];
        for(int i =0; i<str.length(); i++){
            charr[i] = str.charAt(str.length()-i-1);
        }
        Node head1 = LinkedList.createList(charr);
        dHead.next = head1;
        return dHead;
    }

    //NOTE: if you find any issue with the driver code please inform AIB
    //DO NOT TOUCH THE DRIVER CODE BELOW
    public static void main(String[] args){
        System.out.println("==============Test Case 1=============");
        Node head = LinkedList.createList(new Character[]{'B', 'M', 'D', 'T', 'N', 'O', 'A', 'P', 'S', 'C'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> C -> A -> T");
        Node result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> C -> A -> T
        System.out.println();
        System.out.println("==============Test Case 2=============");
        head = LinkedList.createList(new Character[]{'Z', 'O', 'T', 'N', 'X'});
        System.out.print("Encoded Word: ");
        LinkedList.printLL(head);
        System.out.println("\nExpected output: null -> N");
        result = wordDecoder(head);
        System.out.println( "Your output: ");
        LinkedList.printLL(result); //This should print null -> N
        System.out.println();
    }
}
