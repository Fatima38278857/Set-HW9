import java.util.Objects;

public class Mechanic {

    private String mechanicName;
    private String company;

    public Mechanic() {
    }

    public Mechanic(String mechanicName, String company) {
        this.mechanicName = mechanicName;
        this.company = company;
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String maintenance() {
        return "ТО проведен";
    }

    public String carRepairs() {
        return "Ремонт проведем";
    }
        public <T extends Transport> void performaMaintrnance(T t){
            System.out.println(t.toString() + " " + "обслуживается механиком " + this);
}

    @Override
    public String toString() {
        return "Mechanic{" + "Имя и фамилия механика='" + mechanicName + '\'' + ", Компания='" + company + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return mechanicName.equals(mechanic.mechanicName) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mechanicName, company);
    }
}


