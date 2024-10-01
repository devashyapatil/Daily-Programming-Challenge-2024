class Day23 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] r = new int[n -k + 1];
        int ri = 0;

        Deque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<n ;i++){
            if(!deque.isEmpty() && deque.peek() == i-k){
                deque.poll();
            }

            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();
            }

            deque.offer(i);
            if(i >= k-1){
                r[ri++] = nums[deque.peek()];
            }
        } 
        return r;
    }    
}