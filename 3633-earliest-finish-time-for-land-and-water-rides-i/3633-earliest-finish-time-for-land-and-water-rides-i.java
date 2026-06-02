class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n=landStartTime.length;
        int m=waterStartTime.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int firstride=landStartTime[i]+landDuration[i];
            for(int j=0;j<m;j++){
                int secondride=Math.max(firstride,waterStartTime[j]);
                int finish=secondride+waterDuration[j];
                ans=Math.min(ans,finish);
            }

        }
        for(int i=0;i<m;i++){
            int firstride=waterStartTime[i]+waterDuration[i];
            for(int j=0;j<n;j++){
                int secondride=Math.max(firstride,landStartTime[j]);
                int finish=secondride+landDuration[j];
                ans=Math.min(ans,finish);
            }

        }
        return ans;
    }
}