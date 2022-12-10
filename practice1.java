class MyStack {
    Queue<Integer> q = new LinkedList<>();
    /** Menginisiasi data structur kita di dalam function */
    public MyStack() {
        
    }
    
    /**push element into stack. */
    public void push(int x) {
        q.add(x);
        int k = q.size();
        for(int i = 0; i < k - 1; i++)
        {
            Integer first = q.remove();
            q.add(first);
        }
    }
    
    /** Menghapus elemen ke atas pada yang macet dan mengembalikan elemen itu. */
    public int pop() {
        return q.remove();
    }
    
    /** Mengambil data dari element tsb */
    public int top() {
        return q.peek();
    }
    
    /** retutns weatherthe stuck is empty */
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */