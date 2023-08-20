import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Scanner inppScanner = new Scanner(System.in);
        int sub_num, total_scoure, option, full_scoure;
        double total_marks = 0, add_marks,percentage;
        char option1, option2;
        do {
            System.out.print("enter how many subjects you hava = ");
            sub_num = inppScanner.nextInt();
            System.out.print("enter full marks of one subject  = ");
            total_scoure = inppScanner.nextInt();
            full_scoure = sub_num * total_scoure;
            for (int i = 0; i < sub_num; i++) {
                System.out.print("enter marks of your " + (i + 1) + " subject = ");
                add_marks = inppScanner.nextDouble();
                total_marks += add_marks;
            }
            percentage=total_marks / sub_num;
            do {
            System.out.print(
                    "what you want \nPress 1 to find toatal marks\nPress 2 to find percentage\nPress 3 to find your gread\nPress 4 to find avrg = ");
            option = inppScanner.nextInt();
            
                if (option == 1) {
                    System.out.println("Total marks of your exam = " + total_marks);
                } else if (option == 2) {
                    System.out.println("Percentage of your exam = " + ((total_marks / full_scoure) * 100) + "%");
                } 
                else if(option==3){
                    if(percentage>=90&&percentage<=100){
                        System.out.println("Your gread is A");
                    }
                    else if(percentage>=75&&percentage<90){
                        System.out.println("Your gread is B");
                    }
                     else if(percentage>=65&&percentage<75){
                        System.out.println("Your gread is C");
                    }
                     else if(percentage>=35&&percentage<65){
                        System.out.println("Your gread is D");
                    }
                     else if(percentage>35){
                        System.out.println("Your gread is F");
                    }
                    else{
                        System.out.println("Please enter a correct marks");
                    }
                } else if (option == 4) {
                    
                    System.out.println("Percentage of your exam = " + percentage);
                } else {
                    System.out.println("Please enter correct option ");
                }
                System.out.print("If you want to check more please enter y if not please enter n = ");
                option1 = inppScanner.next().charAt(0);
            } while (option1 == 'y' || option1 == 'Y');
            System.out.print("If you want to check more subjects please enter y if not please enter n = ");
            option2 = inppScanner.next().charAt(0);
        } while (option2 == 'y' || option2 == 'Y');
        inppScanner.close();
    }
}