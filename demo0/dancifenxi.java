import java.util.Scanner;

public class dancifenxi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String str = scan.nextLine();
        int[] a = new int[26];
        for (int i = 0; i < str.length(); i++) {
            a[str.charAt(i)-'a']++;
        }
        char ch='a';
        int max=0;
        for(int i=0;i<26;i++){
            if(a[i]>max){
                max=a[i];
                ch=(char) ('a'+i);
            }
        }
        System.out.println(ch);
        System.out.println(max);
        scan.close();
    }
}
