package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 1;
        if(floorNum==1){
            System.out.println("Floor 1 selectedLobby, verizon , starbucks");
        }else if ( floorNum==2){
            System.out.println("Floor 2 selected . companies Cybertek , NASA ");

        }else if( floorNum==3){
            System.out.println("Floor 2 selected companies. steak house" );
        }else{
            System.out.println("Invalid floor- " + floorNum );
            System.out.println("=======SWITCH STATEMENT VERSION==========");
            floorNum =2 ;
            switch(floorNum){
                case 1 :
                    System.out.println(" verizon , starbucks");
                case 2:
                    System.out.println("Floor 2 selected companies. steak house");
            }
        }

        }

        }


