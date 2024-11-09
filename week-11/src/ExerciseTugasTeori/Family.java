package ExerciseTugasTeori;

import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class Family {
    private Set<Uncle> uncles;
    private Set<Niece> nieces;

    public Family() {
        this.uncles = new TreeSet<>();
        this.nieces = new TreeSet<>();
    }

    public boolean addUncle(String name) {
        Uncle uncle = new Uncle(name,this);
        uncles.add(uncle);
        return true; 
    }

    public boolean addNiece(String name, int day, int month) {
        Niece niece = new Niece(name,day,month,this);
        nieces.add(niece);
        return true; 
    }

    public Uncle findUncle(String name){
        Iterator<Uncle> iterator = uncles.iterator();
        while (iterator.hasNext()) {
            Uncle uncle = iterator.next();
            if(uncle.getName().equals(name)){
                return uncle;
            }
        }

        return null;

    }

    public Niece findNiece(String name){
        Iterator<Niece> iterator = nieces.iterator();
        while (iterator.hasNext()) {
            Niece niece = iterator.next();
            if(niece.getName().equals(name)){
                return niece;
            }
        }

        return null;

    }

    public void listUncle() {
        System.out.println("List Uncle Ordered alphabetical by name: ");
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }

    public void listNiece() {
        System.out.println("List Niece Ordered by birtday: ");
        for (Niece niece : nieces) {
            System.out.println(niece.getName() + " - Birthdate: " + niece.getMonth() + "/" + niece.getDay());
        }
    }
    
    public Set<Uncle> getUncles() {
        return uncles;
    }

    public Set<Niece> getNieces() {
        return nieces;
    }

    

    
}
