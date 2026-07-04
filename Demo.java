import java.util.Scanner; 

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        if (sc.hasNextInt()) {
            int age = sc.nextInt();
            if (age >= 20) {
                System.out.println("Person is Adult");
            } else {
                System.out.println("Minor");
            }
        } else {           
            System.out.println("Error: Please enter a valid numerical age.");
        }
        
        sc.close();
    }
}
