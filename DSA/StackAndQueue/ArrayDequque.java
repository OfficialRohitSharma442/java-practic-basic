import java.util.*;
public class ArrayDequque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for(int i=1; i<=20; i++){
            if(i<=10){
                ad.offerFirst(i);
            }else{
                ad.offerLast(i);
            }
        }
        for(int i=0; i<10; i++){
            if(i%2==0){
                ad.pollFirst();
            }else{
                ad.pollLast();
            }
        }
        System.out.println(ad);
    }
}
