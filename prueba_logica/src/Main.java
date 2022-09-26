import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while (true){
            System.out.println("Enter a number");
            String number = userInput.next();
            if(number.equals("0,0")) break;
            int numberOfRepetitions=Integer.parseInt(number.split(",")[0]);
            String decimals = number.split(",")[1];
            int i;
            String [][] displayArray = new String[decimals.length()][7];
            int [] arrayOfCiphers= new int[decimals.length()];
            for(i=0;i<decimals.length();i++){
                arrayOfCiphers[i] = Integer.parseInt(String.valueOf(decimals.charAt(i)));
            }

            for(i=0;i<decimals.length();i++){
                displayArray[i][0] = "---";
                displayArray[i][1] = "|";
                displayArray[i][2] = "|";
                displayArray[i][3] = "---";
                displayArray[i][4] = "|";
                displayArray[i][5] = "|";
                displayArray[i][6] = "---";
                switch (arrayOfCiphers[i] ){
                    case 0:{
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = " ";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = " ";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 1:{
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = " ";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 2:{
                        displayArray[i][1] = " ";
                        displayArray[i][5] = " ";
                        break;
                    }
                    case 3:{
                        displayArray[i][1] = " ";
                        displayArray[i][4] = " ";
                        break;
                    }
                    case 4:{
                        displayArray[i][0] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 5:{
                        displayArray[i][2] = " ";
                        displayArray[i][4] = " ";
                        break;
                    }
                    case 6:{
                        displayArray[i][2] = " ";
                        break;
                    }
                    case 7:{
                        displayArray[i][1] = " ";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 8:{
                        break;
                    }
                    case 9:{
                        displayArray[i][4] = " ";
                        break;
                    }
                    default: break;
                }
            }
            for(int k=0;k<numberOfRepetitions;k++){
                for(int a=0;a<5;a++){
                    for(i=0;i<decimals.length()&&i<5;i++){
                        if(a%2==0)System.out.printf(" %s  ", displayArray[i][3*a/2]);
                        else System.out.printf("%s   %s ", displayArray[i][a+(a-1)/2], displayArray[i][a+(a-1)/2+1]);
                    }
                    System.out.println("");
                }
                System.out.println("");
            }
        }
    }
}