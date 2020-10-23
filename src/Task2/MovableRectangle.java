package Task2;
import java.util.Scanner;

    public class MovableRectangle extends Rectangle implements Movable{
        MovablePoints left=new MovablePoints();
        MovablePoints right=new MovablePoints();
        Scanner sc=new Scanner(System.in);
        public MovableRectangle(int a, int b) {
            super(a, b);
            input();
        }
        void input(){
            System.out.print("x_left=");
            left.x=sc.nextInt();
            System.out.print("y_left=");
            left.y=sc.nextInt();
            System.out.print("x_right=");
            right.x=sc.nextInt();
            System.out.print("y_right=");
            right.y=sc.nextInt();
            reassign(left);
            reassign(right);
        }
        void reassign(MovablePoints mp){
            mp.lastx=mp.x;
            mp.lasty=mp.y;
        }
        @Override
        public void move(int x,int y,MovablePoints mp) {
            reassign(mp);
            mp.x+=x;
            mp.y+=y;
        }

        @Override
        public boolean speed() {
            return left.x-left.lastx==right.x-right.lastx && left.y-left.lasty==right.y-right.lasty;
        }
    }