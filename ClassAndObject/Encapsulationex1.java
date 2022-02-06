/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
public class Encapsulationex1 {
    public static void main(String[] args) {
        // TODO code application logic here
        MovieTicket obj=new MovieTicket(112,3);
        System.out.print("Total charge:$");
        obj.calculateAmount();
        
    }
    
}
class MovieTicket
{
    private int movieId;
    private int  noOfSeats;
    private double costPerTicket;
     public MovieTicket(int movieId,int noOfSeats)
    {
        this.movieId=movieId;
        this.noOfSeats=noOfSeats;
    }
    public int getMovieId()
    {
        return movieId;
    }
    public void setMovieId(int movieId)
    {
        this.movieId=movieId;
    }
    public int getNoOfSeats()
    {            
            return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats)
    {
        this.noOfSeats=noOfSeats;
    }
    public double getcostPerTicket()
    {
        return costPerTicket;
    }
    public void setcostPerTicket(double costPerTicket)
    {
        this.costPerTicket=costPerTicket;
    }
    public void calculateAmount()
    {
        if(this.movieId==111 && this.noOfSeats<=3)
        {
            double tax1=(7*this.noOfSeats)* 0.02;
            System.out.println(7*this.noOfSeats+tax1);
        }
        else if(this.movieId==112 && this.noOfSeats<=3)
        {
            double tax2=(8*this.noOfSeats)* 0.02;
            System.out.println(8*this.noOfSeats+tax2);
        }
        else if(this.movieId==113 && this.noOfSeats<=3)
        {
            double tax3=(8.5*this.noOfSeats)*2/100;
            System.out.println((8.5*this.noOfSeats) + tax3);
        }
            else
            {
                    System.out.println("Sorry!please enter valid movie Id and number of seats");
                    }
        }
    }
   
