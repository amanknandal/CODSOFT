import java.util.*;
class Number_Game{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        int user_num;
        char play_again;
        int number,count=0;
        Random random = new Random();
        do{
        do{
            System.out.print("Please enter a number between 0 to 100 = ");
            user_num=input.nextInt();
            number=random.nextInt(2, 3);
            System.out.println("Random number is = "+number);
            if(number == user_num){
                System.out.println("congratulations you guess it right both number is same ");
            }
            else if(user_num<0||user_num>100){
                System.out.println("please enter number between 0 to 100");
            }
            else {
                System.out.println("please try again its not same ");
            }
            count+=1;
        }while(number!=user_num);
        System.out.print("if you want to play again press y if you dont want to play again press n ");
        play_again=input.next().charAt(0);
    }while(play_again=='y'||play_again=='Y');
        input.close();
        System.out.println("number of try is "+count);
    }
}