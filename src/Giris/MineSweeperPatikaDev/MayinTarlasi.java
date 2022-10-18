package MineSweeperPatikaDev;

import java.util.Scanner;

public class MayinTarlasi {
    public static void main(String[] args) {
        int rowNumber, columnNumber;
		Scanner input = new Scanner(System.in);
		System.out.print("Mayin tarlasi satir sayisini giriniz: ");
		rowNumber = input.nextInt();
		System.out.print("Mayin tarlasi sutun sayisini giriniz: ");
		columnNumber = input.nextInt();
		
		if(rowNumber > 1 && columnNumber > 1 ) {
			MineSweeper mine = new MineSweeper(rowNumber, columnNumber);
			mine.run();	
		}
		else {
			System.out.println("Gecersiz satir sutun sayisi girdiniz.");
		}
    }
}
