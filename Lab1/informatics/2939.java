import java.util.Scanner;
 
class Apple2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println((k%n));
    }
}