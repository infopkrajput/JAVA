// Write a program to remove duplicate characters from the string.

class Solution {
    public static String removeDuplicates(char[] str,int n)
    {
        String temp = "";
        int i,j;
        // Your code here
        for(i = 0; i < n; i++)
        {
            for( j = 0; j < i; j++)
            {
                if(str[i] == str[j])
                {
                    break;
                }
            }
            if(i==j)
            {
                temp = temp + str[i];
            }
        }
        return temp;
    }
    public static void main(String args[]) {
        char str[] = "Hello, world".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicates(str,n));
    }

}