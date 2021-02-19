import com.example.demo.Address;
import com.example.demo.Efficiency;
import com.example.demo.Employee;

public class Rep extends Employee {
    private Efficiency efficiency;
    private double commission;

    public Rep(int id, String name, String lastname, int age, int experience, double commission, Efficiency efficiency, Address address) {
        super(id, name, lastname, age, experience, address);

        this.commission = commission;
        this.efficiency = efficiency;

    }

    public Efficiency getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(Efficiency efficiency) {
        this.efficiency = efficiency;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commision) {
        this.commission = commision;
    }


    @Override
    public double getCorporationValue() {
        return super.getExperience() * efficiency.getValue();
    }

    @Override
    public String toString() {
        return "Rep{" +
                "efficiency=" + efficiency +
                ", commission=" + commission +
                "} " + super.toString();
    }
}
