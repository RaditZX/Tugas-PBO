package ExerciseTugasTeori;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Uncle implements Comparable<Uncle> {
    private String name;
    private Map<Niece, Set<Present>> presents;
    private Family family;

    Uncle(String name, Family family) {
        this.name = name;
        this.family = family;
        this.presents = new HashMap<>();
    }

    boolean isUniquePresent(Niece recipient, String description) {
        for (Uncle uncle : family.getUncles()) {
            Set<Present> presents = uncle.getPresents().get(recipient);
            if (presents != null) {
                Iterator<Present> iterator  = presents.iterator();
                while(iterator.hasNext()){
                    Present present = iterator.next();
                    if (present.getDescription().equals(description)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    public boolean addPresent(Niece recipient, String description) {
        if (!isUniquePresent(recipient, description)) {
            return false;
        }
    
        Present newPresent = new Present(this, recipient, description);
        Set<Present> recipientPresents = presents.get(recipient);
    
        if (recipientPresents == null) {
            recipientPresents = new HashSet<>();
            presents.put(recipient, recipientPresents);
        }
    
        recipientPresents.add(newPresent);
        return true;
    }
    
    
    

    public void listPresent() {
        System.out.println(name + " has given the following presents:");

        Iterator<Niece> iterator1 = presents.keySet().iterator();
        while (iterator1.hasNext()) {
            Niece niece = iterator1.next(); 
            Set<Present> recipientPresents = presents.get(niece);
            for (Present present : recipientPresents) {
                System.out.println(present.getRecipient().getName() + " received: " + present.getDescription());
            }
        }

        
        System.out.println("Nieces who have not received presents from " + name + ":");
        Iterator<Niece> itertor = family.getNieces().iterator();
        while(itertor.hasNext()){
            Niece niece = itertor.next();
            if (!presents.containsKey(niece)) {
                System.out.println(niece.getName());
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Niece, Set<Present>> getPresents() {
        return presents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uncle uncle = (Uncle) o;
        return Objects.equals(this.name, uncle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Uncle other) {
        return this.name.compareTo(other.name);
    }

    


}
