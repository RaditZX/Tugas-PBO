package task3;

import java.util.Calendar;
import java.util.GregorianCalendar;

class Manager extends Employee implements Sortable {
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    public void raiseSalary(double byPercent) {
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }

    @Override
    public int compare(Sortable o) {
        if (o instanceof Manager) {
            Manager eb = (Manager) o;
            if (super.getSalary() < eb.getSalary())
                return -1;
            if (super.getSalary() > eb.getSalary())
                return +1;
        } else if (o instanceof Employee) {
            Employee other = (Employee) o;
            return other.compare((Employee)o);
        }
        return 0; 
    }

    public String getSecretaryName() {
        return secretaryName;
    }

    private String secretaryName;
}
