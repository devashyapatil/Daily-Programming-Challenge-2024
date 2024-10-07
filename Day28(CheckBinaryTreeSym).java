class Day28{
    public boolean checkSymmetric(TreeNode root1, TreeNode root2){
        if(root1==null || root2==null){
            return root1==root2;
        }
        if(root1.val!=root2.val){
            return false;
        }
        
                    
        return checkSymmetric(root1.left,root2.right) && checkSymmetric(root1.right,root2.left);
 
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        
        return checkSymmetric(root.left,root.right);
    }
}
