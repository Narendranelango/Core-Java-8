import java.util.*;
public class TestBook
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Book obj= new Book();
        System.out.println("Enter the Book name:");
        String bookName=sc.nextLine();
        obj.setBookName(bookName);
        System.out.println("Enter the price:");
        int bookPrice=sc.nextInt();
        sc.nextLine();
        obj.setBookPrice(bookPrice);
        System.out.println("Enter the Author name:");
        String authorName=sc.nextLine();
        obj.setAuthorName(authorName);
        System.out.println("Book Details");
        System.out.println("Book Name :"+obj.getBookName());
        System.out.println("Book Price :"+obj.getBookPrice());
        System.out.println("Author Name :"+obj.getAuthorName());
    }
}