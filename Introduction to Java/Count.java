import java.util.*;
class Count{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the standard: ");
        int st=sc.nextInt();
        switch(st){
            case 1:
                System.out.println("Nila gets 1 pencil");
                break;
                case 2:
                    System.out.println("Nila gets 5 pencils");
                    break;
                case 3:
                    System.out.println("Nila gets 14 pencils");
                    break;
                case 4:
                    System.out.println("Nila gets 30 pencils");
                    break;
                case 5:
                    System.out.println("Nila gets 55 pencils");
                    break;
                case 6:
                    System.out.println("Nila gets 91 pencils");
                    break;
                case 7:
                    System.out.println("Nila gets 140 pencils");
                    break;
                case 8:
                    System.out.println("Nila gets 204 pencils");
                    break;
                case 9:
                    System.out.println("Nila gets 285 pencils");
                    break;
                case 10:
                    System.out.println("Nila gets 385 pencils");
                    break;
                case 11:
                    System.out.println("Nila gets 506 pencils");
                    break;
                case 12:
                    System.out.println("Nila gets 650 pencils");
                    break;
                default :
                    System.out.println("Invalid Standard");
        }
    }
}