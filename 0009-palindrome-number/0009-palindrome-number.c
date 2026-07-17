bool isPalindrome(int x) {
    if (x < 0) return false;
    int num=0;
    long int rev=0;
    int temp=x;

    while(x != 0){
        num=x%10;
        rev=rev*10+num;
        x=x/10;
    }
     return temp == rev;
}