/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Booking{
    //Implement your code here
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;
    public Booking(String customerEmail,int seatsRequired)
    {
        this.customerEmail=customerEmail;
        this.seatsRequired=seatsRequired;
    }
    static
    {
        seatsAvailable=400;
    }
    public String getCustomerEmail()
    {
        return customerEmail;
    }
    public void setCustomerEmail(String customerEmail)
    {
        this.customerEmail=customerEmail;
    }
    public int getSeatsRequired()
    {
        return seatsRequired;
    }
    public void setSeatsRequired(int seatsRequired)
    {
        this.seatsRequired=seatsRequired;
    }
   public static int getSeatsAvailable()
   {
       return seatsAvailable;
   }
   public static void setSeatsAvalable(int seatsAvailable)
   {
       Booking.seatsAvailable=seatsAvailable;
   }
   public void setBooked(boolean isBooked)
   {
      if(true)
      {
         Booking.seatsAvailable=Booking.seatsAvailable-this.seatsRequired;
      }
       
   }
   public boolean isBooked()
   {
       if(this.seatsRequired<=Booking.seatsAvailable)
       {
           return true;
       }
       else
       {
           return false;
       }
   }
   }

class Static3{
    public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);

        //Create more objects and add them to the bookings array for testing your code
        
        Booking[] bookings = { booking1, booking2 };
              
        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
         }
    }
}

