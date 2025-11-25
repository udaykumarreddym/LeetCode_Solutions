bool isSameAfterReversals(int num) {
    if(num==0) return true;
    num=num%10;
    if(num==0)
    return false;
    else
    return true;
}