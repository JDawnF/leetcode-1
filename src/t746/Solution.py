package t746;
def minCostClimbingStairs(cost):
        dp=[0]*len(cost)
        dp[0],dp[1]=cost[0],cost[1]

        for i in range(0,len(cost)):
        dp[i]=min(dp[i-1],dp[i-2])+cost[i]
        return min(dp[-2],dp[-1])

        if __name__=='__main__':
        cost=map(int,raw_input().split())
        print minCostClimbingStairs(cost)