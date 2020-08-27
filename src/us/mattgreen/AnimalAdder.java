package us.mattgreen;

import java.util.*;
/**
 * Created by whuck on 8/26/20.
 */
public class AnimalAdder {
    //ArrayList<Talkable> zoo = new ArrayList<>();

    private Scanner sc;
    
    public AnimalAdder() {
        this.sc = new Scanner(System.in);
    
    }
    
    public void addFromInput(ArrayList<Talkable> zoo) {
        String input = "";
        System.out.print("What type of animal do you want to create [Cat or Dog]?");
        input=this.sc.nextLine();
        while (!input.equals("Cat") && !input.equals("Dog") ) {
            System.out.print("Cat or Dog only please enter one or the other!");
            input=this.sc.nextLine();
        }
       if(input.equals("Cat")){
           String name = "";
           int mouseKills = 0;
           System.out.print("What is the kitty's name?");
           name=this.sc.nextLine();
           while (name.equals("")) {
               System.out.print("Please enter in a kitty name");
               name=this.sc.nextLine();
           }
           System.out.print("What is the kitty's mouse kill count?");
           mouseKills=this.sc.nextInt();
           zoo.add(new Cat(mouseKills,name));

       }
       else if (input.equals("Dog")){
        String name = "";
        String friendly = "";
        boolean isFriendly = false;
        System.out.print("What is the doggy's name?");
        name=this.sc.nextLine();
        while (name.equals("")) {
            System.out.print("Please enter in the doggy's name");
            name=this.sc.nextLine();
        }
        System.out.print("Is this dog friendly? Yes/No");
        friendly=this.sc.nextLine();
        while (friendly.equals("") || (!friendly.equals("Yes") && !friendly.equals("No"))) {
            System.out.print("Please enter Yes/No");
            friendly=this.sc.nextLine();
        }
        if(friendly.equals("Yes")) {isFriendly = true;}
        else if (friendly.equals("No")) {isFriendly = false;}
        zoo.add(new Dog(isFriendly,name));

       }
    }
}

