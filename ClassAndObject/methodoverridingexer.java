/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class User{
    //Implement your code here
    private int id;
    private String userName;
    private String emailId;
    private double walletBalance;
    User(int i,String u,String e,double w)
    {
        this.id=i;
        this.userName=u;
        this.emailId=e;
        this.walletBalance=w;
    }
    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public String getEmailId()
    {
        return emailId;
    }
    public void setEmailId(String emailId)
    {
        this.emailId=emailId;
    }
    public double getWalletBalance()
    {
        return walletBalance;
    }
    public void setWalletBalance(double walletBalance)
    {
        this.walletBalance=walletBalance;
    }
    public boolean makePayment(double billAmount)
    {
        if(this.walletBalance<=billAmount)
        {
            billAmount=this.walletBalance-billAmount;
            return true;
        }
        
        else
            return false;
    }
}

class PremiumUser extends User{
    //Implement your code here
    private int rewardPoint;
  
    PremiumUser(int id,String userName,String emailId,double walletBalnce)
    {
        super(id,userName,emailId,walletBalnce);
    }
    public int getRewardPoints()
    {
        return rewardPoint;
    }
    public void setRewardPoint(int rewardPoint)
    {
        this.rewardPoint=rewardPoint;
    }
    @Override
    public boolean makePayment(double billAmount)
    {
        billAmount=super.
    }
    
}

class methodoverridingexer {

    public static void main(String[] args) {

        User user = new User(101, "Joe", "joe@abc.com", 100);

		PremiumUser premiumUser = new PremiumUser(201, "Jill", "jill@abc.com", 300);

		processPayment(user, 70);

		processPayment(premiumUser, 150);

		processPayment(premiumUser, 80);

		processPayment(premiumUser, 120);

    }

    public static void processPayment(User user, double billAmount) {
        if (user.makePayment(billAmount)) {
			System.out.println("Congratulations " + user.getUserName() + ", payment of $" + billAmount + " was successful!");
		} else {
			System.out.println("Sorry " + user.getUserName() + ", you do not have enough balance to pay the bill!");
		}
		System.out.println("Your wallet balance is $" + user.getWalletBalance());

		if (user instanceof PremiumUser) {
			PremiumUser premiumUser = (PremiumUser) user;
			System.out.println("You have " + premiumUser.getRewardPoints() + " points!");
		}
		System.out.println();
    }
}

