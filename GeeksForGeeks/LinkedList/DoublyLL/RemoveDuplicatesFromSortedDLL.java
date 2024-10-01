// class Solution{
//     Node removeDuplicates(Node head){
//         // Code Here.
        
//         Node curr= head;
//         int track= curr.data;
//         curr = curr.next;
//         while(curr!= null){
//             if(curr.data == track){
//                 if(curr.next == null){
//                     curr.prev.next = null;
//                 }
//                 else
//                 {
//                     curr.prev.next = curr.next;
//                     curr.next.prev = curr.prev;
//                 }
//             }else{
//                 track = curr.data;
//             }
//             curr = curr.next;
//         }
//         return head;
//     }
// }

// updated as there is no need of track var...
class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        
        Node curr= head;
        int track= curr.data;
        curr = curr.next;
        while(curr!= null){
            if(curr.data == curr.prev.data){
                if(curr.next == null){
                    curr.prev.next = null;
                }
                else
                {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
            }
            curr = curr.next;
        }
        return head;
    }
}
