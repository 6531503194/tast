package recursion;

public class Test1 {
    public static int count8(int n){
        int i = 0;
        if(n==i){
            return 0;
        }else if((n%10) == 8){
            i++;
            if((n/10)%10 == 8){
                i*=2;//fix here
            }
        }
        return i + count8(n/10);
    }
    public static void main(String[] args){
        System.out.println(count8(80258));
        System.out.println(count8(8818));
    }
}

/*

Given a non-negative int n,
compute recursively (no loops) the count of the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double,
so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count8(😎 → 1
count8(818) → 2
count8(8818) → 4

 */