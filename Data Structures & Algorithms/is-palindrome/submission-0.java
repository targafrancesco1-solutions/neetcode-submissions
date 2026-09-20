class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] palindrome = s.toCharArray();
        int i = 0; 
        int j = palindrome.length-1;

        while (i < j){
            if(!Character.isLetterOrDigit(palindrome[i])){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(palindrome[j])){
                j--;
                continue;
            }
            if(palindrome[i] != palindrome[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
