import java.util.*;
public class Shop
{
    private String shopName,shopAddress;
    private String products[];
    public Shop(String shopName,String shopAddress,String products[])
    {
        this.shopName=shopName;
        this.shopAddress=shopAddress;
        this.products=products;
    }
    public void setShopName(String shopName)
    {
        this.shopName=shopName;
    }
    public String getShopName()
    {
        return shopName;
    }
    public void setShopAddress(String shopAddress)
    {
        this.shopAddress=shopAddress;
    }
    public String getShopAddress()
    {
        return shopAddress;
    }
    public void setProducts(String products[])
    {
        this.products=products;
    }
    public String[] getProducts()
    {
        return products;
    }
    public boolean checkProductAvailability(String productname)
    {
        String item;int found=0;
        for(int i=0;i<products.length;i++)
        {
            item=products[i];
            if(item.equalsIgnoreCase(productname))
            {
                found=1;
                break;
            }
        }
        if(found==1)
        return true;
        else
        return false;
    }
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String[] products;
        System.out.println("Enter the shopname:");
        String name=sc.nextLine();
        System.out.println("Enter the address:");
        String address=sc.nextLine();
        System.out.println("Enter no of products:");
        int num=sc.nextInt();
        sc.nextLine();
        String item;
        if(num>0)
        {
            products=new String[num];
            for(int i=0;i<num;i++)
            products[i]=sc.nextLine();
            System.out.println("Enter the product to be searched:");
            item=sc.nextLine();
            Shop obj=new Shop(name,address,products);
            if(obj.checkProductAvailability(item))
            System.out.println("Product is available at "+obj.getShopName()+", "+obj.getShopAddress()+".");
            else
            System.out.println("Product is not available at "+obj.getShopName()+", "+obj.getShopAddress()+".");
        }
    }
}