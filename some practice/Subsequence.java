import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Subsequence {
    static  Stack<String> list = new Stack<>();
    static void sub(int index,String arr []){
        if(list.size()!= 0){
            System.out.println(list);

        }
        if(arr.length == index){
            return;
        }

        for(int i =index;i<arr.length;i++){
            list.push(arr[i]);
            sub(i+1,arr);
            list.pop();
        }



    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String [] str = input.nextLine().split("");

        sub(n,str);
       for(String i: list){
          System.out.println(i);
       }

    }

}
