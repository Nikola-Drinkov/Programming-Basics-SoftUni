package ForLoops;

import java.util.Scanner;

public class NumbersN1_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for(int i =n; i>0; i--){
            System.out.println(i);
        }
    }
}
