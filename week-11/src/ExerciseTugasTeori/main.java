package ExerciseTugasTeori;



public class main {
    public static void main(String[] args) {
        Family family = new Family();
        
        family.addUncle("John");
        family.addUncle("Paul");
        family.addUncle("Paul");
        family.addUncle("Aceng");

        family.addNiece("Eve", 10, 10);  
        family.addNiece("Alice", 5, 5);  
        family.addNiece("Eve", 10, 10); 
       
        
        Uncle john = family.findUncle("John");
        Uncle paul = family.findUncle("Paul");

        Niece alice = family.findNiece("Alice");
        Niece eve = family.findNiece("Eve");
        family.listNiece();
        System.out.print("\n");
        family.listUncle();

        john.addPresent(alice, "Toy Car");
        john.addPresent(eve, "Puzzle");

        paul.addPresent(alice, "Book");
        paul.addPresent(eve, "Puzzle");
        
        System.out.print("\n");
        john.listPresent();
        System.out.print("\n");
        paul.listPresent();

        System.out.print("\n");
        alice.listPresent();
        System.out.print("\n");
        eve.listPresent();
        
        System.out.print("\n");
        System.out.println("Clearing presents for Alice: " + alice.clearPresent());
        System.out.print("\n");
        System.out.println("Clearing presents for Eve: " + eve.clearPresent());
        
        System.out.print("\n");
        alice.listPresent();
        System.out.print("\n");
        eve.listPresent();
    }
}

