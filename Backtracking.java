

public class Backtracking{

    public static void perm(String str,String perm,int idx){
        if(str.length() == 0){
            //System.out.println(perm);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            char current = str.charAt(i);
            String newstr = str.substring(0,i);
            System.out.println("$" + newstr);
            perm(newstr,perm+current,idx+1);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        perm(str," ",0);
    }
}