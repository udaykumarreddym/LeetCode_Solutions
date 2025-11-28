int tribonacci(int n) {
    int F[100],i;
    if(n<1)
        return 0;
    else if(n<2)
        return 1;
    else if(n<3)
        return 1;
    else if(n<4)
        return 2;
    else
    {
        F[0]=0;
        F[1]=1;
        F[2]=1;
        F[3]=2;
        for(i=4;i<=n;i++)
        {
            F[i]=F[i-1]+F[i-2]+F[i-3];
        }
        return F[n];    
        }
    
}