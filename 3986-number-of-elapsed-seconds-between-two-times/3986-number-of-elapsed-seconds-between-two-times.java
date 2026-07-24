class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] a1=startTime.split(":");
        int h1=(Integer.parseInt(a1[0]))*3600;
        int m1=(Integer.parseInt(a1[1]))*60;
        int s1=(Integer.parseInt(a1[2]));
        int sum1=h1+m1+s1;
        String[] a2=endTime.split(":");
        int h2=(Integer.parseInt(a2[0]))*3600;
        int m2=(Integer.parseInt(a2[1]))*60;
        int s2=(Integer.parseInt(a2[2]));
        int sum2=h2+m2+s2;
        return Math.abs(sum1-sum2);
        
        
    }
}