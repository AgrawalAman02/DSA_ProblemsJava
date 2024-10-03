class Solution {
    
    Node merge(Node l1, Node l2) {
        Node dummy = new Node(-1);
        Node res = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                dummy.bottom = l1;
                l1 = l1.bottom;
            } else {
                dummy.bottom = l2;
                l2 = l2.bottom;
            }
            dummy = dummy.bottom;
        }
        
        dummy.bottom = (l1 != null) ? l1 : l2;
        
        return res.bottom;
    }
    
    // Function to flatten a linked list
    Node flatten(Node root) {
        if (root == null || root.next == null) {
            return root;
        }
        
        root.next = flatten(root.next);
        
        root = merge(root, root.next);
        
        return root;
    }
}
