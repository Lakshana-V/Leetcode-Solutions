class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int j=0,i=0,c=0;
        while(i<fruits.length && j<baskets.length)
        {
            if(fruits[i]<=baskets[j])
            {
                baskets[j]=0;
                i++;
                j=0;
            }
            else
            {
                j++;
            }
            if(j==baskets.length)
            {
                c++;
                if(i<fruits.length)
                {
                    i++;
                    j=0;
                }
            }
        }
        return c;

    }
}