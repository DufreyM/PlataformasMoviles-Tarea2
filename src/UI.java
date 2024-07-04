import java.util.Scanner;

public class UI {
Scanner scanner = new Scanner(System.in);
Calc calc = new Calc();

public void printmenu(){

    System.out.println("Bienvenido a la calculadora");
    System.out.println("1. Sumar");
    System.out.println("2. Resta.r");
    System.out.println("3. Multiplicar");
    System.out.println("Salir");
}
//Función que llama a la calculadora y realiza la suma

public void calcular(){
    System.out.println("Ingrese el primer numero");
    int n1 = scanner.nextInt();
    System.out.println("Ingrese el segundo numero");
    int n2 = scanner.nextInt();
    System.out.println("Ingrese el numero de la operacion que desea realizar");
    printmenu();

    int choice = scanner.nextInt(); 
    switch(choice){
        case 1:
        System.out.println("Suma");
        System.out.println(calc.suma(n1,n2));
        break;
        case 2:
        System.out.println("Resta");
        System.out.println(calc.resta(n1,n2));
        break;
        case 3:
        System.out.println("Multiplicacion");
        System.out.println(calc.multiplicacion(n1,n2));
        break;
    }
    }


public static void main(String[] args){
    UI ui = new UI();
    ui.calcular();
}
}