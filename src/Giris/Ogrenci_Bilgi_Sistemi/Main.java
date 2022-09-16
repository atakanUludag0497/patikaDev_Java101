package Ogrenci_Bilgi_Sistemi;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Matematik","MATH101","mat");
        Course physics = new Course("Fizik","PHY101","phy");
        Course chemistry = new Course("Kimya","CHEM101","chm");

        Teacher t1 = new Teacher("Mahmut Hoca","+90 533 419 7856","mat");
        Teacher t2 = new Teacher("Fatma Hoca","+90 532 179 3147","phy");
        Teacher t3 = new Teacher("Ayse Hoca","+90 553 184 14 76","chm");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        physics.addTeacher(t3); // burada prefixler uyuşmadığı için akademisyen ataması yapılamaz
        chemistry.addTeacher(t3);

        Student s1 = new Student("Inek saban",01,"140144015",math,physics,chemistry);
        s1.addBulkExamNote(30,50,70,20,15,40);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi",02,"2211133",math,physics,chemistry);
        s2.addBulkExamNote(50,100,60,50,70,40);
        s2.isPass();

        Student s3 = new Student("Hayta Ismail",03,"221212325",math,physics,chemistry);
        s3.addBulkExamNote(100,80,90,90,85,70);
        s3.isPass();
    }
}
