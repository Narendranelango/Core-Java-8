public class Movie
{
    private String movieName,movieCategory;
    private int ticketCost;
    public void setMovieName(String movieName)
    {
        this.movieName=movieName;
    }
    public String getMovieName()
    {
        return movieName;
    }
    public void setMovieCategory(String movieCategory)
    {
        this.movieCategory=movieCategory;
    }
    public String getMovieCategory()
    {
        return movieCategory;
    }
    public void setTicketCost(int ticketCost)
    {
        this.ticketCost=ticketCost;
    }
    public int getTicketCost()
    {
        return ticketCost;
    }
    public int calculateTicketCost(String circle)
    {
        String cat=getMovieCategory();
        if(!(circle.equalsIgnoreCase("gold") || circle.equalsIgnoreCase("silver")) && !(cat.equalsIgnoreCase("2d") || cat.equalsIgnoreCase("3d")))
        return -3;
        if(!(circle.equalsIgnoreCase("gold") || circle.equalsIgnoreCase("silver")))
        return -2;
        if(!(cat.equalsIgnoreCase("2d") || cat.equalsIgnoreCase("3d")))
        return -1;
        if(circle.equalsIgnoreCase("gold") && cat.equalsIgnoreCase("2d"))
        setTicketCost(300);
        else if(circle.equalsIgnoreCase("gold") && cat.equalsIgnoreCase("3d"))
        setTicketCost(500);
        else if(circle.equalsIgnoreCase("silver") && cat.equalsIgnoreCase("2d"))
        setTicketCost(250);
        else if(circle.equalsIgnoreCase("silver") && cat.equalsIgnoreCase("3d"))
        setTicketCost(450);
        return 0;
    }
}