import java.util.Scanner;

public class chengjitongji {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int num = scan.nextInt();
        double pass=0;
        double excellence = 0;
        for(int i = 0; i < num;i++){
            int a = scan.nextInt();
            if(a>=60){
                if(a>=85){
                    excellence++;
                }
                pass++;
            }
        }
        System.out.println(Math.round(pass*100/num)+"%");
        System.out.println(Math.round(excellence*100/num)+"%");
        scan.close();
    }
}
