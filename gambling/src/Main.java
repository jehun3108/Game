import java.awt.*;
import java.awt.print.Paper;
import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    void game1(){
        System.out.println("\nChoose among Rock, Scissor and paper!");
        System.out.println("Rock = [a]\nScissor = [b]\nPaper = [c]");

        String[] a = {"Rock", "Scissor", "Paper"};
        Random random = new Random();
        int rock = random.nextInt(3);

        String rcp = scanner.next();
        if (rcp.equals("a")){
            System.out.println("Rock\n....\nScissor\n....\nPaper\n");
            if (rock == 0){
                System.out.println(a[0]);
                System.out.println("\nTie");
            } else if (rock == 1) {
                System.out.println(a[1]);
                System.out.println("\nYou Lose");
            } else if (rock == 2) {
                System.out.println(a[2]);
                System.out.println("\nYou Win");
            }
        } else if (rcp.equals("b")) {
            System.out.println("Rock\n....\nScissor\n....\nPaper\n");
            if (rock == 0){
                System.out.println(a[0]);
                System.out.println("\nYou WIn");
            } else if (rock == 1) {
                System.out.println(a[1]);
                System.out.println("\nTie");
            } else if (rock == 2) {
                System.out.println(a[2]);
                System.out.println("\nYou Lose");
            }
        } else if (rcp.equals("c")) {
            System.out.println("Rock\n....\nScissor\n....\nPaper\n");
            if (rock == 0){
                System.out.println(a[0]);
                System.out.println("\nYou Win");
            } else if (rock == 1) {
                System.out.println(a[1]);
                System.out.println("\nYou Lose");
            } else if (rock == 2) {
                System.out.println(a[2]);
                System.out.println("\nTie");
            }
        }else {
            System.out.println("Error");
        }

    }
    void game2(){
        System.out.println("1/2 probability game");
        System.out.println("Choose between 1 and 2");
        Scanner scanner1 = new Scanner(System.in);
        int game2 = scanner1.nextInt();

        Random game = new Random();
        int b = game.nextInt(2);

        if (game2 ==b){
            System.out.println("You Win");
        } else if (game2 !=b) {
            System.out.println("You Lose");
        }
    }


    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);

        //Start
        System.out.println("\nWrite down \"1\" to start game");

        int start = scanner.nextInt();
        if (start == 1){
            System.out.println("Game starting");
            System.out.println("\n\n--Loading--\n\n");
            System.out.println("Complete\n\n");

            System.out.println("Which game do you want to play?\n");
            System.out.println("1.Rock Scissor Paper game");
            System.out.println("2.1/2 probability game");
            System.out.println("\nWrite down number among 1, 2");
            System.out.println("[1],[2]");

            int numberAmong = scanner.nextInt();

            if (numberAmong == 1){
                System.out.println("\nRock Scissor Paper game Starting!");
                main.game1();
            }else if (numberAmong == 2){
                System.out.println("\n1/2 probability game Starting!");
                main.game2();
            }else {
                System.out.println("Error don't write other word expect 1,2");
            }

        }else {
            System.out.println("Restart Game");
            System.out.println("Only \"1\" is allowed!!");
        }
    }
}
