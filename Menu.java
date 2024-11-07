package Pokedex;

import java.util.Scanner;

public class Menu {


    Scanner scan = new Scanner(System.in);
    Pokedex pDex = new Pokedex();
    int menuSelect = 9;
    String pokeName;

    public void displayMenu(){

        boolean keepGoing = true;

        while(keepGoing){

            System.out.println("Please make a selection");
            System.out.println("1) Add a Pokemon");
            System.out.println("2) Delete a Pokemon");
            System.out.println("3) Display Pokemon info");
            System.out.println("4) Display all Pokemon info");
            System.out.println("5) Exit");

            menuSelect = Integer.parseInt(scan.nextLine());

            if(menuSelect == 1){
                createPokemon();
            }
            else if(menuSelect == 2){
                deletePokemon();
            }
            else if(menuSelect == 3){
                displayPokemon();
            }
            else if(menuSelect == 4){
                displayAllPokemon();
            }
            else if(menuSelect == 5){
                break;
            }
            else {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private void createPokemon(){
        System.out.println("What is the name of the Pokemon you wish to create?");
        pokeName = scan.nextLine();
        System.out.println("What is it's HP?");
        int healthPoints = Integer.parseInt(scan.nextLine());
        Pokemon poke = new Pokemon(pokeName, healthPoints);
        pDex.addPokemon(poke);
        while (true){
            System.out.println("What is the name of the Move? otherwise input q if finished.");
            String moveName = scan.nextLine();
            if (moveName.equalsIgnoreCase("q")){
                break;
            }
            else {
                System.out.println("Please enter the move's power: ");
                int movePower = Integer.parseInt(scan.nextLine());
                System.out.println("Please enter the move's speed: ");
                int moveSpeed = Integer.parseInt(scan.nextLine());
                Move mova = new Move(moveName, movePower, moveSpeed);
                poke.addMove(mova);
            }
        }
        System.out.println("Pokemon has been added to the Pokedex.");
    }

    private void deletePokemon(){
        System.out.println("Which Pokemon do you want to delete?");
        pokeName = scan.nextLine();
        poke = Pokemon(pokeName);
        if (pokeName == null){
            System.out.println("Pokemon does not exist.");
        }
        else{
            pDex.removePokemon(pokeName);
            System.out.println("Pokemon removed.");
        }
    }

    private void displayPokemon(){
        System.out.println("Which Pokemon do you want to view?");
        pokeName = scan.nextLine();
        System.out.println(pDex.getPokemon(pokeName));
    }

    private void displayAllPokemon(){
        System.out.println(pDex.getAllPokemon());
    }
}
