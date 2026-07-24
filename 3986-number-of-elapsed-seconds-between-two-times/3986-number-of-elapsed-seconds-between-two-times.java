class Solution {
    public int secondsBetweenTimes(String s1, String s2) {

        int t1 = (Integer.parseInt(s1.substring(0,2))*3600 + Integer.parseInt(s1.substring(3,5)) * 60 + Integer.parseInt(s1.substring(6)));

        int t2 = (Integer.parseInt(s2.substring(0,2))*3600 + Integer.parseInt(s2.substring(3,5)) * 60 + Integer.parseInt(s2.substring(6)));


        return Math.abs(t2-t1);


        
    }
}