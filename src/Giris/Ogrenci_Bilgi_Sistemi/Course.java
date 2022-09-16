package Ogrenci_Bilgi_Sistemi;

public class Course {
    Teacher courseTeacher;
    String name;
    String lectureCode;
    String prefix;
    int note;
    int preNote;
    public Course(String name,String lectureCode,String prefix){
        this.name = name;
        this.lectureCode = lectureCode;
        this.prefix = prefix;
        this.note = 0;
    }
    public void addTeacher(Teacher t){
        if(this.prefix.equals(t.branch)){
            this.courseTeacher = t;
            System.out.println("Islem Basarili");
        }else{
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }
    public void printTeacher(){
        if(courseTeacher != null){
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        }else{
            System.out.println(this.name + " dersine Akademisyen atanmistir.");
        }
    }
}
