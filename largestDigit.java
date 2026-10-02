
//hello
public class largestDigit {
    public static void main(String[] args) {
        int i=9382;
        int last=0;
        int max=Integer.MIN_VALUE;
        while(i>0){
            last=i%10;
            if(last>max){
                max=last;
            }
            i=i/10;
        }
        System.out.println(max);
    }
}
