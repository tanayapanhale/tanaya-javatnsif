package day1;
import java.util.Scanner;

public class SUPPLY {
	int Code;
	String FoodName,Sticker,FoodType;
	public void GetType() {
		switch(Sticker.toLowerCase()) {
		case "yellow": FoodType="Contains Egg";
		break;
		case "green": FoodType="Vegetarian";
		break;
		case "red": FoodType="Non Vegetarian";
		break;
		default: FoodType="None";
		break;
		}
	}
	
	public void FoodIn() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Code: ");
		Code = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter FoodName: ");
		FoodName = sc.nextLine();
		System.out.print("Enter Sticker: ");
		Sticker = sc.nextLine();
		GetType();
	}
	
	public void FoodOut() {
		System.out.println("Code:"+Code+", Foodname:"+FoodName+", Sticker:"+Sticker+", FoodType:"+FoodType);
	}
	
	public static void main(String[] args) {
		SUPPLY sp = new SUPPLY();
		sp.FoodIn();
		sp.FoodOut();
	}

}
