import java.util.*;
class HandCricket{
    static Random randomObj = new Random();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        HandCricket obj = new HandCricket();

        int ch,num,cnum;
        System.out.println("Enter player name : \n");
        String name = sc.next();

        System.out.println("Enter choice : \n0.Even\t1.Odd\n");
        ch = sc.nextInt();
        System.out.println("Enter a number(1-6):");
        num = sc.nextInt();
        cnum = randomObj.nextInt(1,6);
        System.out.println("Your choice is "+num);
        System.out.println("Computer choice is "+cnum);
        if((num+cnum)%2==ch){
            System.out.println("Choose Bat or Bowl:\n0.Bat\t1.Bowl");
            ch = sc.nextInt();
            if(ch==0){
                System.out.println("Your's is Batting");
                obj.batting(name);
            }
            else{
                System.out.println("Your's is Bowling");
                obj.bowling(name);
            }
        }
        else{
            ch = randomObj.nextInt(0,1);
            if(ch==0){
                System.out.println("Your's is Bowling");
                obj.bowling(name);
            }
            else{
                System.out.println("Your's is Batting");
                obj.batting(name);
            }
        }
    }
    void batting(String name){
        int num,cnum,score=0,cscore=0;
        System.out.println("Hit a number(1-6) :");
        num = sc.nextInt();
        cnum = randomObj.nextInt(1,6);
        System.out.println("Your choice is "+num);
        System.out.println("Computer choice is "+cnum);
        while(num!=cnum){
            score += num;
            System.out.println("Hit a number(1-6) :");
            num = sc.nextInt();
            cnum = randomObj.nextInt(1,6);
            System.out.println("Your choice is "+num);
            System.out.println("Computer choice is "+cnum);
        }
        System.out.println("Your Score is "+score);
        System.out.println("Your's is Bowling");
        System.out.println("Throw a number(1-6) :");
        num = sc.nextInt();
        cnum = randomObj.nextInt(1,6);
        System.out.println("Computer choice is "+cnum);
        System.out.println("Your choice is "+num);
        while(num!=cnum){
            cscore += num;
            System.out.println("Throw a number(1-6) :");
            num = sc.nextInt();
            cnum = randomObj.nextInt(1,6);
            System.out.println("Computer choice is "+cnum);
            System.out.println("Your choice is "+num);
        }

        System.out.println("Your score : "+score+"\nComputer score : "+cscore);
        if(score>cscore){
            System.out.println(name+" wins");
        }
        else if(score<cscore){
            System.out.println("Computer wins");
        }
        else{
            System.out.println("It's a Draw");
        }
    }
    void bowling(String name){
        int num,cnum,score=0,cscore=0;
        System.out.println("Throw a number(1-6) :");
        num = sc.nextInt();
        cnum = randomObj.nextInt(1,6);
        System.out.println("Computer choice is "+cnum);
        System.out.println("Your choice is "+num);
        while(num!=cnum){
            cscore += num;
            System.out.println("Throw a number(1-6) :");
            num = sc.nextInt();
            cnum = randomObj.nextInt(1,6);
            System.out.println("Computer choice is "+cnum);
            System.out.println("Your choice is "+num);
        }
        System.out.println("Your's is Batting");
        System.out.println("Hit a number(1-6) :");
        num = sc.nextInt();
        cnum = randomObj.nextInt(1,6);
        System.out.println("Your choice is "+num);
        System.out.println("Computer choice is "+cnum);
        while(num!=cnum){
            score += num;
            System.out.println("Hit a number(1-6) :");
            num = sc.nextInt();
            cnum = randomObj.nextInt(1,6);
            System.out.println("Your choice is "+num);
            System.out.println("Computer choice is "+cnum);
        }
        System.out.println("Your score : "+score+"\nComputer score : "+cscore);
        if(score>cscore){
            System.out.println(name+" wins");
        }
        else if(score<cscore){
            System.out.println("Computer wins");
        }
        else{
            System.out.println("It's a Draw");
        }
    }
}