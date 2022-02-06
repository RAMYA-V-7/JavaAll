/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Participant {
    //Implement your code here
    private static int counter;
    private String registrationId;
    private String name;
    private long contactNumber;
    private String city;
   
    public Participant(String n,long co,String ci)
    {
        this.name=n;
        this.contactNumber=co;
        this.city=ci;
        this.registrationId="D1000"+(++Participant.counter);
    }
     static
    {
        counter=0;
        
    }
    public String getRegistrationId()
    {
        return registrationId;
    }
    public static int getCounter()
    {
        return counter;
    }
    public static void setCounter(int counter)
    {
        Participant.counter=counter;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public long getContactNumber()
    {
        return contactNumber;
    }
    public void setContactNumber(long contactNumber)
    {
        this.contactNumber=contactNumber;
    }
    public String getCity()
    {
        return city;
    }
    public void setCity(String getCity)
    {
        this.city=city;
    }
    
}

class Static2 {
	public static void main(String[] args) {
		
		Participant participant1 = new Participant("Franklin", 7656784323L, "Texas");
		Participant participant2 = new Participant("Merina", 7890423112L, "New York");
		
		//Create more objects and add them to the participants array for testing your code
		
		Participant[] participants = { participant1, participant2 };
		
		for (Participant participant : participants) {
			System.out.println("Hi "+participant.getName()+"! Your registration id is "+participant.getRegistrationId());
		}

	}
} 