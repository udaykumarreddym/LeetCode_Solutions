class Solution {
    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            int Ax = points[i][0];
            int Ay = points[i][1];
            for(int j=0;j<n;j++){
                if(i == j) continue;
                int Bx = points[j][0];
                int By = points[j][1];
                if (Ax <= Bx && Ay >= By){
                    boolean valid = true;
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;
                        int Px = points[k][0];
                        int Py = points[k][1];

                        if (Ax <= Px && Px <= Bx && By <= Py && Py <= Ay) {
                            valid = false;
                            break;
                        }
                    }
                    if(valid) ans++;
                }
            }
        }
        return ans;
    }
}