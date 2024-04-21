package Conversion;

import Api.CurrencyConverter;

import java.util.ArrayList;
import java.util.Scanner;

public class MoneyConversorUI {

    private ArrayList<Money> arrayMoney;

    public MoneyConversorUI(){
        this.arrayMoney = new ArrayList<>();
        this.arrayMoney.add(new Money("ARS","Peso argentino"));
        this.arrayMoney.add(new Money("BOB","Boliviano boliviano"));
        this.arrayMoney.add(new Money("BRL","Real brasileño"));
        this.arrayMoney.add(new Money("CLP","Peso chileno"));
        this.arrayMoney.add(new Money("COP","Peso colombiano"));
        this.arrayMoney.add(new Money("USD","Dólar estadounidense"));

    }
    public void view(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Money>[] possibilities = currencyPossibilities();
        int size = possibilities.length;
        int r= 0;
        double amount = 0;

            do{
                System.out.println("*******************************************");
                System.out.println("Sea bienvenido/a al Convertidor de Moneda =]");
                for (int i = 0; i < size; i++) {
                    ArrayList<Money> p = possibilities[i];
                    System.out.println((i + 1) + " ) " + p.get(0).getText() +
                            "  =>>  " +p.get(1).getText());

                }
                System.out.println((size + 1) + ") " + "Salir");
                System.out.print("Elija una opcion valida : ");

                try{
                    r = Integer.parseInt(scanner.nextLine());
                    if (r>0 || r<size){
                        System.out.print("Ingrese el valor que deseas convertir : ");
                        amount = Double.parseDouble(scanner.nextLine());
                        ArrayList<Money> p = possibilities[r-1];
                        String fromCurrency = p.get(0).getCode();
                        String toCurrency =p.get(1).getCode();
                        double result =MoneyConversor.Coversor(fromCurrency,
                                toCurrency,amount);
                        System.out.println("El valor " + amount + " [" + fromCurrency
                                        + "]" + " corresponde al valor final de =>>> "
                                        + result + " [" + toCurrency + "]"
                                );

                    }
                }catch (NumberFormatException e){
                    System.out.println("Ingrese solo numeros");
                    r=0;
                }

                System.out.println("*******************************************");

            }while(r != (size + 1));
    }
    public ArrayList<Money>[] currencyPossibilities(){

        int size = this.arrayMoney.size();
        ArrayList<Money>[] possibilities = new ArrayList[size*(size-1)];
        int count =0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (this.arrayMoney.get(i)!=this.arrayMoney.get(j)){
                    possibilities[count]=new ArrayList<>();
                    possibilities[count].add(arrayMoney.get(i));
                    possibilities[count].add(arrayMoney.get(j));
                    count++;
                }
            }
        }
        return possibilities;
    }
}
