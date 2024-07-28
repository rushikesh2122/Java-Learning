import java.util.*;

// Age Problem
// public class Conditions {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if (age>=18){
//             System.out.println("Adult");
//         }else {
//             System.err.println("Not an Adult");
//         }
//     }
// }

// Even Odd 
// public class Conditions {
//     public static void main (String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();

//         if (a % 2 == 0){
//             System.err.println("Even");
//         }else {
//             System.err.println("Odd");
//         }
//     }
// }

// // Greater then or less 
// public class Conditions{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();

//         if (x == y){
//             System.err.println("Equal");
//         }else if (x > y){
//             System.err.println("a is Greater");
//         }else {
//             System.err.println("a is lesser");
//         }
//     }
// }

// Buttons Game 
// public class Conditions{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int Button = sc.nextInt();

//         if (Button == 1){
//             System.out.println("Hello");
//         } else if (Button == 2){
//             System.err.println("Namaste");
//         }else if (Button == 3){
//             System.err.println("Bonjour");
//         }else {
//             System.err.println("Invalid Button");
//         }
//     }
// }

// Switch case 
public class Conditions{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1: System.out.println("hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }
    }
}