import java.util.*;
class Solution {
    public String convert(String s, int numRows) {
        if(s.length()==0||numRows==0||s.isEmpty()){
            return "";
        }
        if(s.length()==1||numRows==1){
            return s;
        }
        StringBuilder result = new StringBuilder();
        int step = 2*numRows-2;
        for(int i = 0; i<numRows;i++){
            for(int j = i;j<s.length();j= j+(step)){
                result.append(s.charAt(j));
                if(i!=0&&i!=numRows-1&&(j+step-2*i)<s.length()){
                    result.append(s.charAt(j+step-2*i));
                }
            }
        }
        return result.toString();
        
    }
}
