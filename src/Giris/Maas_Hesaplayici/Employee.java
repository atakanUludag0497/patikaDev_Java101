package Maas_Hesaplayici;
// not : sadece objeyi oluşturduğum anda classdaki diğer fonksiyonların otomatik olarak çağrılmasını sağla.
public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(double salary){
        double tax = 0;
        if(salary <= 1000){
            return tax;
        }else{
            tax = (salary * 0.03);
            return tax;
        }
    }
    public int bonus(int workHours){
        int bonusSalary = workHours;
        if(workHours > 40){
            return (bonusSalary - 40) * 30;
        }
        return 0;
    }
    public double raiseSalary(int hireYear){
        int currentYear = 2021;
        double raiseSalary = 0;
        if(currentYear - hireYear < 10 && currentYear - hireYear > 1){
            raiseSalary = (this.salary * 0.5);
            return raiseSalary;
        }else if(currentYear - hireYear > 9 && currentYear - hireYear < 20){
            raiseSalary = (this.salary * 0.10);
            return raiseSalary;
        }else if(currentYear - hireYear > 19 && currentYear - hireYear < 50){
            raiseSalary = (this.salary * 0.15);
            return raiseSalary;
        }else{
            return raiseSalary;
        }
    }
    public void toStrings(){
        System.out.println("Adi : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma saati : " + this.workHours);
        System.out.println("Baslangic yili : " + this.hireYear);
        System.out.println("Vergi : " + tax(this.salary));
        System.out.println("Bonus : " + bonus(this.workHours));
        System.out.println("Maas Artisi : " + raiseSalary(this.hireYear));
        System.out.println("Vergi ve bonuslar ile birlikte maas : " + (this.salary - tax(this.salary) + this.bonus(this.workHours)));
        System.out.println("Toplam maas : " + (this.raiseSalary(this.hireYear) + this.salary - tax(this.salary) + this.bonus(this.workHours)));
    }
}
