public class FullTime extends Employee{
    int yearsOfExperience;

    @Override
    public String toString() {
        return "FullTime{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public FullTime(int id, String name, int age, int yearsOfExperience) {
        super(id, name, age);
        this.yearsOfExperience = yearsOfExperience;


    }
}

