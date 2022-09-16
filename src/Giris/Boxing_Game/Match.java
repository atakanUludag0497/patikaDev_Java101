package Boxing_Game;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    boolean startCheck = true;

    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }
    void run(){
        if(isCheck()){
            startCheck = this.f1.startCheck();
            if(this.startCheck){
                System.out.println("Birinci dovuscu once basliyor !");
            }else{
                System.out.println("ikinci dovuscu once basliyor !");
            }
            while(this.f1.health > 0 && this.f2.health > 0 && this.startCheck){
                System.out.println("=====YENI RAUND=====");
                this.f2.health = this.f1.hit(this.f2);
                if(isWin()){
                    break;
                }
                System.out.println(this.f2.name + " saglik => " + this.f2.health);
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + " saglik => " + this.f1.health);
                if(isWin()){
                    break;
                }
            }
            while(this.f1.health > 0 && this.f2.health > 0 && !this.startCheck){
                System.out.println("=====YENI RAUND=====");
                this.f1.health = this.f2.hit(this.f1);
                if(isWin()){
                    break;
                }
                System.out.println(this.f1.name + " saglik => " + this.f1.health);
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + " saglik => " + this.f2.health);
                if(isWin()){
                    break;
                }
            }
        }else{
            System.out.println("Sporcularin sikletleri musabaka icin uyusmuyor.");
        }
    }
    boolean isCheck(){
        return ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight));
    }
    boolean isWin(){
        if(this.f1.health == 0){
            System.out.println(this.f2.name + " kazandi ! ");
            return true;
        }
        if(this.f2.health == 0){
            System.out.println(this.f1.name + " kazandi !");
            return true;
        }
        return false;
    }
}
