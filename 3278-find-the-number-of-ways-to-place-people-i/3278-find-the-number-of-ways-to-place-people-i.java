class Solution {
    public int numberOfPairs(int[][] points) {
        Arrays.sort(points,(a,b)->
        a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        int n=points.length;
        int solution=0;
        for(int i=0;i<n;i++)
        {
            int []c=points[i];
            int current=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++)
            {
                int[] d=points[j];
                if(c[1]<d[1]) continue;
                if(current>=d[1]) continue;
                current=Math.max(current,d[1]);
                solution++;
            }
        }
        return solution;
    }
}