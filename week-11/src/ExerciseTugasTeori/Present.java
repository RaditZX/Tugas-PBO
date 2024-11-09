package ExerciseTugasTeori;

import java.util.Objects;

public class Present  {
    private Uncle giver;
    private Niece recipient;
    private String description;

    public Present(Uncle giver,Niece recipient, String description) {
        this.giver = giver;
        this.recipient = recipient;
        this.description = description;
    }

    public Niece getRecipient() {
        return recipient;
    }

    public Uncle getUncleWhoGave(){
        return giver;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Present for " + recipient.getName() + ": " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Present Present = (Present) o;
        return Objects.equals(this.description, Present.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }
}
