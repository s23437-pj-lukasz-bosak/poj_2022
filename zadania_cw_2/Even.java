package zadanka.domowe;

import java.util.Scanner;
 // zadanie 2.14
public class Even {

    int ifEven;


    public void dataInput() {
        Scanner skaner = new Scanner(System.in);
        System.out.println("Podaj Dowolną liczbe: ");
        ifEven = skaner.nextInt();
        System.out.println("twoja liczba: " + ifEven);
    }

    public boolean dataProcessing() {
        if(ifEven%2 == 0){
            return true;
             }else {
            return false;
        }
    }

    public void output(){
        if(dataProcessing() == true){
            System.out.println(ifEven + " Jest parzysta");
        }else{
            System.out.println(ifEven + " Jest nieparzysta");
        }
    }



}
