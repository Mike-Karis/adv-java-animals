package us.mattgreen;
import java.util.Objects;
import java.util.Scanner;
/**
 * Created by mgreen14 on 12/27/17.
 */

public  class Pet {
    private Scanner scanner = new Scanner(System.in);
    protected String name;

    public Pet(){
        getType();

    }

    public void getType(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What type of animal do you want to create: ");
        String input = scanner.nextLine();

        if(input.equals("Dog")){
            String name = getName();
            System.out.print("Are they Friendly:  ");
            String input3 = scanner.nextLine();
            boolean friendly=false;
            if(input3.equals("Yes")){
                friendly=true;
            }
            Main.zoo.add(new Dog(friendly, name));
        }
        else if(input.equals("Cat")){
            String name = getName();
            System.out.print("How many mice have they killed:  ");
            int input2 = scanner.nextInt();
            Main.zoo.add(new Cat(input2,name));
            input=" ";
        }
        else{
            System.out.println("Invalid Entry");
        }

    }

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
         String name = scanner.nextLine();
        return name;
    }

}