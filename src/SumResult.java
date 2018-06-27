import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SumResult {
    public static void main(String[] args) {
        Queue<Integer> queue = createQueue();
        SumResult.printQueue(queue);
        SumResult.printSum(queue);

    }

    static Queue<Integer> createQueue(){
        Queue<Integer> queue = new LinkedList <>();
        Scanner scn = new Scanner(System.in);
        int nb = 0;
        boolean flag = false;


        while (!flag) {

            try {
                if (nb < 10) {System.out.println("Podaj liczbę: ");
                    queue.offer(scn.nextInt());
                    nb++;}
                else flag = true;
            }
            catch (InputMismatchException ex) {
                System.out.println("To nie jest liczba, spróbuj ponownie: ");
                scn.nextLine();
            }
        } return queue;
    }



    static void printQueue(Queue<Integer> queue) {
        System.out.print(queue);
    }


    static void printSum(Queue<Integer> queue) {
        System.out.println();
        int sizeQueue = queue.size();
        int sum = 0;
        System.out.print("Suma liczb:  ");
        for(int i = 0; i<sizeQueue; i++) {
            int j = queue.poll();
            if (i == 0) {
                sum = sum + j;
                System.out.print(j);
            } else {     sum = sum + j;
                System.out.print(" + " + j);}
        }

        System.out.print(" = " + sum);
    }





}