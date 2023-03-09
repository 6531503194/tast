class Main{
    public static  int factorial(int n) {
        if(n==1){
            return 1;
        }else{
            return n * factorial(n-1);

        }

    }
    public static int bunnyEars(int n){
        int ears = 2;
        if(n==1){
            return 2;
        }else{
            return ears + bunnyEars(n-1);
        }
    }
    public static int finobachi(int n){
        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else{
            return finobachi(n-1) + finobachi(n-2);
        }
    }
    public static int bunnyEars2(int n){
        if(n==0){
            return 0;
        }else if((n%2)==0){
            return 3+bunnyEars2(n-1);
        }else{
            return 2 + bunnyEars2(n-1);
        }
    }
    public static int triangle(int rows){
        if(rows ==1){
            return 1;
        }else{
            return rows + triangle(rows - 1);
        }
    }
    public static int sumDigits(int n){
        int i = 0;
        if(n == i){
            return 0;
        }else{
            i++;
            return (n%10) + sumDigits(n/10);
        }
    }
    public static int count7(int n){
        int i = 0;
        if(n==i){
            return 0;
        }
        else if((n%10) == 7){
            i++;

        }
        return i+count7(n/10);

    }
    public static int count8(int n){
        int i = 0;
        if(n==i){
            return 0;
        }else if((n%10) == 8){
            i++;
            if((n/10)%10 == 8 ){
                i*=2;
                n = n/100;
            }
        }
        return i + count8(n/10);
    }
    public static void main(String[] args){

        System.out.println(factorial(5));
        System.out.println(bunnyEars(4));
        System.out.println(finobachi(5));
        System.out.println(bunnyEars2(3));
        System.out.println(triangle(3));
        System.out.println(sumDigits(105));
        System.out.println(count7(277057));
        count8(88);
    }
}

/*
Given a non-negative int n,
compute recursively (no loops) the count of the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double,
so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count8(8) → 1
count8(818) → 2
count8(8818) → 4

 */