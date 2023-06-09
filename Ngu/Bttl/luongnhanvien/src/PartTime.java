public class PartTime extends Employee {
    int workTime;

    public PartTime(int id, String name, int age, int workTime) {
        super(id, name, age);
        this.workTime = workTime;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "PartTime{" +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", workTime=" + workTime +
                '}';
    }
}
