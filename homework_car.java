import java.net.SocketOption;
import java.util.Scanner;
import java.util.Random;
class Car {
   String carNo;
   String model;
   String color;
   static int weight = 100;


   static void checkWeight() {
       System.out.println("차들의 무게는 "+ weight + "입니다.");
   }
   public void getModel() {
       System.out.println("이 차의 모델은 " + model +"입니다.");
   }
}
public class Main {
   public static void main(String[] args) {
       Car[] cars = new Car[3];
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<cars.length;i++) {
           cars[i] = new Car();
           cars[i].carNo = sc.nextLine();
           cars[i].model = sc.nextLine();
           cars[i].color = sc.nextLine();
       }
       for(int i=0; i<cars.length; i++){
           System.out.println(cars[i].carNo);
           System.out.println(cars[i].model);
           System.out.println(cars[i].color);
       }
       Car.checkWeight();
       cars[0].getModel();
   }//end
}
