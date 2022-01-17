class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int parenthesis=0;
        for(Character ch: s.toCharArray())
        {
            if(ch=='(')
            {
                parenthesis++;
            }
            else if(ch==')')
            {
                parenthesis--;
            }
            depth=Math.max(depth, parenthesis);
        }
        return depth;
    }
}
