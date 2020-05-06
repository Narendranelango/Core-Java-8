public class BusTicket
{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    
    public void setTicketNo(int ticketNo)
    {
        this.ticketNo=ticketNo;
    }
    public void setTicketPrice(float ticketPrice)
    {
        this.ticketPrice=ticketPrice;
    }
    public void setTotalAmount(float totalAmount)
    {
        this.totalAmount=totalAmount;
    }
    public void setPerson(Person person)
    {
        this.person=person;
    }
    public int getTicketNo()
    {
        return ticketNo;
    }
    public float getTicketPrice()
    {
        return ticketPrice;
    }
    public float getTotalAmount()
    {
        return totalAmount;
    }
    public Person getPerson()
    {
        return person;
    }
    public void calculateTotal()
    {
        int age=person.getAge();
        float d;
        if(age<16)
        d=(float)0.5;
        else if(age>=60)
        d=(float)0.75;
        else if(person.getGender()=='F' || person.getGender()=='f')
        d=(float)0.90;
        else
        d=(float)1.0;
        float amt=ticketPrice*d;
        setTotalAmount(amt);
    }
}