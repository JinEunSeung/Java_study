class Marine {
   int x = 0, y = 0;
   int hp = 60;
   static int weapon = 6;
   static int armor = 0;
  
   void weaponup() {
       weapon++;
   }
  
   void armorUp() {
       armor++;
   }
  
   void move(int x, int y){
       this.x = x;
       this.y = y;
   }
}
