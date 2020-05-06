import java.util.*;
public class Book
{
        
        private String bookName,authorName;
        private int bookPrice;
        public void setBookName(String bookName)
        {
            this.bookName=bookName;
        }
        public void setAuthorName(String authorName)
        {
            this.authorName=authorName;
        }
        public void setBookPrice(int bookPrice)
        {
            this.bookPrice=bookPrice;
        }
        public String getBookName()
        {
            return bookName;
        }
        public String getAuthorName()
        {
            return authorName;
        }
        public int getBookPrice()
        {
            return bookPrice;
        }
}