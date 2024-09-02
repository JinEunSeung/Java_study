class Tv {
   int chan;
}


public class Main {


   public static void main(String[] args) {
       Tv[] tv = new Tv[3];


       for(int i = 0; i < 3; i++) {
           tv[i] = new Tv();
       }
       tv[0].chan = (int) (Math.random()*100)+1 ;
       tv[1].chan = (int) (Math.random()*200)+1 ;
       tv[2].chan = (int) (Math.random()*300)+1 ;


       for(int i = 0; i < 3; i++) {
           System.out.println("채널 " + i + " : " + tv[i].chan);
       }
   }
}
