package ExerciseTugasTeori;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;


public class Niece implements Comparable<Niece> {
    private String name;
    private int day;
    private int month;
    private Family family;

    Niece(String name, int day, int month, Family family) {
        this.name = name;
        this.day = day;
        this.month = month;
        this.family = family;
    }

    public int clearPresent() {
        int removedCount = 0;

        Iterator<Uncle> iterator1 = family.getUncles().iterator();
        while (iterator1.hasNext()) {
            Uncle uncle = iterator1.next();
            if (uncle.getPresents().containsKey(this)) {
                Set<Present> presentsGiven = uncle.getPresents().get(this);
                removedCount += presentsGiven.size();
                presentsGiven.clear(); 
                uncle.getPresents().remove(this);
            }
        }
    
        return removedCount;
    }
    
    public void listPresent() {
       System.out.println(name + " has got the following presents:");
        
        Iterator<Uncle> iterator1 = family.getUncles().iterator();
        while (iterator1.hasNext()) {
            Uncle uncle = iterator1.next();
            if (uncle.getPresents().containsKey(this)) {
                Set<Present> presentsGiven = uncle.getPresents().get(this);
                for (Present present : presentsGiven) {
                    System.out.println(uncle.getName() + " gave: " + present.getDescription());
                }
            }
        }
        
        System.out.println("Uncle who have not given presents for " + name + ":");
        Iterator<Uncle> iterator2 = family.getUncles().iterator();
        while(iterator2.hasNext()){
            Uncle uncle = iterator2.next();
            if (!uncle.getPresents().containsKey(this)) {
                System.out.println(uncle.getName());
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Niece niece = (Niece) o;
        return Objects.equals(this.name, niece.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


    @Override
    public int compareTo(Niece other) {
        int monthComparison = Integer.compare(this.month, other.month);
        
        if (monthComparison != 0) {
            return monthComparison;
        }
        return Integer.compare(this.day, other.day);
    }

}
