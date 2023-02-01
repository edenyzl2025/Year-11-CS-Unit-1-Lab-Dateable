

import java.util.Scanner;

public class Dateable {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        double age = scanner.nextInt();


        double dateAge = 7+age/2;
        System.out.println(age+" year olds should date somebody who is at least "+ dateAge+" years old! >:(");
    }

}
