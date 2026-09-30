class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] != 0 || grid[n-1][n-1] != 0){
            return -1;
        }
        int ans = 0;
        int[][] directions = {
            {-1,-1},{-1,0},{-1,1},
            {0,-1},         {0,1},
            {1,-1},{1,0},{1,1}
        };
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,1});
        grid[0][0] = 1;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            int val = curr[2];
            if(row == n-1 && col == n-1){
                return val;
            }
            for(int[] dir : directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                if(newRow >= 0 && newRow < n &&
                    newCol >= 0 && newCol < n && 
                    grid[newRow][newCol] == 0){

                    grid[newRow][newCol] = 1;
                    q.offer(new int[]{
                        newRow,
                        newCol,
                        val + 1
                    });
                }
            }
        }
        return -1;
    }
}