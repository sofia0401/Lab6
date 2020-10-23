package Task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovableRectangle mr =new MovableRectangle(3,9);
        Scanner sc=new Scanner(System.in);
        System.out.print("x_move_left=");
        int x_move=sc.nextInt();
        System.out.print("y_move_left=");
        int y_move=sc.nextInt();
        mr.move(x_move, y_move,mr.left);
        System.out.print("x_move_right=");
        x_move=sc.nextInt();
        System.out.print("y_move_right=");
        y_move=sc.nextInt();
        mr.move(x_move, y_move,mr.right);
        System.out.println(mr.speed());
    }
}
