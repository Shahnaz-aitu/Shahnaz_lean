package Massive.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Food {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter # of food: ");
        int numFood = sc.nextInt();

        for (int i =1; i<=numFood; i++ ){
            System.out.print("Enter food #"+i+": ");
            String food = sc.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
    }

}
