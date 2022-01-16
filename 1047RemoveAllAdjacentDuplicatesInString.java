class Solution {
    public String removeDuplicates(String s) {
        //Creating an empty stack to store characters
        Stack<Character> charstack=new Stack<>();
        //String to char array
        char[] str=s.toCharArray();
        //Traverse through every char in array
        for(Character ch: str)
        {
            //if stack is not empty and the top element in stack == current element in array
            //pop the top element
            if(charstack.empty()==false && charstack.peek()==ch)
                charstack.pop();
            else
                charstack.push(ch);
        }
        //append the characters in a stack to a string
        String str1="";
        while(charstack.empty()==false)
        {
            str1=charstack.pop()+str1;
        }
        return str1;
    }
}
