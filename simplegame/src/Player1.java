import java.util.ArrayList;

class Player1 {

    public void position(int pos, char [][] board, ArrayList<Integer> p){
     switch (pos){
      case 1:
       board [0][0]='X';
       p.add(pos);
       break;
      case 2:
       board[0][2]= 'X';
       p.add(pos);
       break;
      case 3:
       board[0][4]= 'X';
       p.add(pos);
       break;
      case 4:
       board[2][0]= 'X';
       p.add(pos);
       break;
      case 5:
       board[2][2]= 'X';
       p.add(pos);
       break;
      case 6:
       board[2][4]= 'X';
       p.add(pos);
       break;
      case 7:
       board[4][0]= 'X';
       p.add(pos);
       break;
      case 8:
       board[4][2]= 'X';
       p.add(pos);
       break;
      case 9:
       board[4][4]= 'X';
       p.add(pos);
       break;
      default:
       break;
     }
    }


    /*private boolean helmet;
    private boolean vest;
    private String weapon ;
    private int health;
    private String name;

    public Player1(boolean helmet, boolean vest, String weapon, int health, String name) {
        this.helmet = helmet;
        this.vest = vest;
        this.weapon = weapon;
        this.name = name;
        if(health < 0 || health > 100){
            this.health = 100;
        }else{
            this.health = health;
        }
    }



     public void weapon1(String weapon){

        if(helmet) {
           this.health -= 90;
           if (this.health <=0){
               this.health =0;
           }
            System.out.println("health reduced by 90 "+ "new health is "+this.health);
        }if(!helmet){
            this.health -=30;
            if(this.health <=0 ){
                this.health =0;
            }
             System.out.println("health reduced by 30 "+ "new health is "+this.health);
         }
        if(this.health == 0){
             System.out.println(this.getName()+" is killed by "+weapon);
        }
    }
    public void weapon2(String weapon){
        if(helmet || vest) {
            this.health -= 20;
        }else{
            this.health -=40;
        }
        if(this.health == 0){
            System.out.println(this.getName()+"is die"+weapon);
        }
    }

     public boolean isHelmet() {
         return helmet;
     }

     public void setHelmet(boolean helmet) {
         this.helmet = helmet;
     }

     public boolean isVest() {
         return vest;
     }

     public void setVest(boolean vest) {
         this.vest = vest;
     }

     public String getWeapon() {
         return weapon;
     }

     public void setWeapon(String weapon) {
         this.weapon = weapon;
     }

     public int getHealth() {
         return health;
     }

     public void setHealth(int health) {
         this.health = health;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }*/
 }
