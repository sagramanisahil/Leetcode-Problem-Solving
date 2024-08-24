class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s, int i, int j) {
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}




	//Another Approach to Solve This Problem

        // int count = s.length()-1;
        // boolean found = false;
        // for (int i=0;i<s.length()/2;++i){
        //     found = false;
        //     if (s.charAt(i)==s.charAt(count)){
        //         found = true;
        //         count--;
        //     } else {
        //         found  =false;
        //         break;
        //     }
        // }
        // boolean founder = false;
        // if (found){
        //     return true;
        // } else {
        //     int palindromeCounter=0;
        //     // int count = 0;
        //     String txt="";
        //     for (int i=0;i<s.length();++i){
        //         txt="";
        //         for (int j =0;j<s.length();++j){
        //             if (i==j){
        //                 continue;
        //             } else {
        //                 txt+=s.charAt(j);
        //             }
        //         }
        //         int counter = txt.length()-1;
        // founder = false;
        // for (int k=0;k<txt.length()/2;++k){
        //     founder = false;
        //     if (txt.charAt(k)==txt.charAt(counter)){
        //         founder = true;
        //         counter--;
        //     } else {
        //         founder  =false;
        //         break;
        //     }
        // }
        //     if (!founder){
        //        palindromeCounter++;
        //     }
        //     }
            
        // if (palindromeCounter==s.length()){
        //     return false;
        // }
        // }
        // return true;
//     }
// }