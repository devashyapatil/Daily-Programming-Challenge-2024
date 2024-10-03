class Day25 {

    public boolean isValidBST(TreeNode root) {
        return CheckBST(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean CheckBST(TreeNode root,long MinValue,long MaxValue){
        if(root==null){
            return true;
        }

        if(root.val>=MaxValue || root.val<=MinValue) 
            return false;

        else{
            return CheckBST(root.left,MinValue,root.val) 
                && CheckBST(root.right,root.val,MaxValue);  
        }
    }
}