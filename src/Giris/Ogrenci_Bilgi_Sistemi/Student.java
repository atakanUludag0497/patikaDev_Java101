package Ogrenci_Bilgi_Sistemi;

public class Student {
    String name,studentNo;
    int classes;
    Course math;
    Course physics;
    Course chemistry;
    double average;
    boolean isPass;
    Student(String name,int classes,String studentNo,Course math,Course physics,Course chemistry){
        this.name = name;
        this.classes = classes;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        calculateAvarage();
        this.isPass = false;
    }
    public void addBulkExamNote(int mathPreExamNote,int mathExamNote,int physicsPreExamNote,int physicsExamNote,int chemistryPreExamNote,int chemistryExamNote){
        if(mathPreExamNote >= 0 && mathPreExamNote <= 100){
            this.math.preNote = mathPreExamNote;
        }
        if(mathExamNote >= 0 && mathExamNote <= 100){
            this.math.note = mathExamNote;
        }
        if(physicsPreExamNote >= 0 && physicsPreExamNote <= 100){
            this.physics.preNote = physicsPreExamNote;
        }
        if(physicsExamNote >= 0 && physicsExamNote <= 100){
            this.physics.note = physicsExamNote;
        }
        if(chemistryPreExamNote >= 0 && chemistryPreExamNote <= 100){
            this.chemistry.preNote = chemistryPreExamNote;
        }
        if(chemistryExamNote >= 0 && chemistryExamNote <= 100){
            this.chemistry.note = chemistryExamNote;
        }
    }
    public void isPass(){
        if(this.math.note == 0 || this.physics.note == 0 || this.chemistry.note == 0){
            System.out.println("Notlar tam olarak girilmemis.");
        }else{
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + String.format("%.1f",this.average));
            if(this.isPass){
                System.out.println("Sinifi gectiniz tebrikler !");
            }else{
                System.out.println("Sinifta kaldiniz tekrar calismalisiniz.");
            }
        }
    }
    public void calculateAvarage(){
        this.average = ((this.physics.note*0.80 + this.physics.preNote*0.20) + (this.chemistry.note*0.80 + this.chemistry.preNote*0.20) + (this.math.note*0.80 + this.math.preNote*0.20)) / 3;
    }
    public boolean isCheckPass(){
        calculateAvarage();
        return this.average > 55;
    }
    public void printNote(){
        System.out.println("= = = = = = = = = = = = = = =");
        System.out.println("Ogrenci : " + this.name);
        System.out.println("Matematik Sozlu notu : " + this.math.preNote + " -> Matematik Sinav Notu : " + this.math.note);
        System.out.println("Fizik Sozlu notu : " + this.physics.preNote + " -> Fizik Sinav Notu : " + this.physics.note);
        System.out.println("Kimya Sozlu notu : " + this.chemistry.preNote + " -> Kimya Sinav Notu : " + this.chemistry.note);
    }
}
