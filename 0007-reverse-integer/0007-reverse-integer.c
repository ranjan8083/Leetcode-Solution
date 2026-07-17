int reverse(int x){
    int num;
    long rev=0;
    while(x != 0){
        num=x%10;
        rev=rev*10+num;
        x=x/10;
    }
    if (rev>=INT_MAX){
        return 0;
    }
     if (rev<=INT_MIN){
        return 0;
    }
    return rev;
}