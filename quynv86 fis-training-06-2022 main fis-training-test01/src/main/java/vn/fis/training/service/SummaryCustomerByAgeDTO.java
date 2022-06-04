package vn.fis.training.service;

public class SummaryCustomerByAgeDTO {
    private int age;
    private int count;
    //TODO: Setters, Getter, Constructors
    public SummaryCustomerByAgeDTO(int age, int count) {
        this.age = age;
        this.count = count;
    }
    public String getAge() {
        return age;
    }
    public String setAge(int age) {
        return this.age = age;
    }
    public String getCount() {
        return count
    }
    public String setCount(int count) {
        return this.count = count;
    }
    @Override
    public String toString() {
        return "SummaryCustomerByAgeDTO{" +
                "age=" + age +
                ", count=" + count +
                '}';
    }
}
