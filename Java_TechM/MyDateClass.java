
package Java_TechM;

public class MyDateClass {
    private int day;
    private int month;
    private int year;

    // Default constructor
    public MyDateClass() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    // Parameterized constructor
    public MyDateClass(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter for day
    public int getDay() {
        return day;
    }

    // Setter for day
    public void setDay(int day) {
        this.day = day;
    }

    // Getter for month
    public int getMonth() {
        return month;
    }

    // Setter for month
    public void setMonth(int month) {
        this.month = month;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    public void getDate()
    {
        System.out.println(this.day+" / "+ this.month + " / "+ this.year);
    }

    @Override
    public String toString() {
        return "MyDateClass{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
        MyDateClass date=new MyDateClass(12,02,2025);

        date.getDate();

        MyDateClass date1 =new MyDateClass();
        date1.setDay(07);
        date1.setMonth(06);
        date1.setYear(2004);

        date1.getDate();

        System.out.println(date);
        System.out.println(date1);



    }
}