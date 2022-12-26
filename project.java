import java.util.Scanner;

class project{
     public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String vraie="Hope";
        System.out.println("What is your name please : ");
        String name=input.next();
        if(name.equalsIgnoreCase(vraie)){
            System.out.println("Welcome" + vraie);
        }else{
            System.out.println(name +" is invalid to our database");
            System.exit(1);
        }
        input.close();
        
    }

}