class Solution {
    public String longestPalindrome(String s) {
        boolean b=true;
        int l=s.length();
        if(s==null || l<2){
            return s;
        }
        int t=0,u=0;
        int max=0;
        boolean[][] isPal=new boolean[l][l];
        for(int j=1;j<l;j++){
            for(int i=0;i<j;i++){
                boolean isInnerPal=isPal[i+1][j-1] || j-i<=2;
                if(s.charAt(i)==s.charAt(j) && isInnerPal){
                    isPal[i][j]=true;
                    if(j-i>u-t){
                        u=j;
                        t=i;
                    }
                }
            }
        }
        
        return s.substring(t,u+1);
    }
}
