/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassAndObject;
class Bill{
    //Implement your code here
    private static int counter;
    private String billid;
    private String paymentMode;
    public Bill(String paymentMode)
            {
                this.billid="B900"+(++Bill.counter);
                this.paymentMode=paymentMode;
            }
    static
    {
        counter=0;
    }
    public String getBillId()
    {
        return billid;
    }
    public void setbillid(String billid)
    {
        this.billid=billid;
    }
    public String getPaymentMode()
    {
        return paymentMode;
    }
    public void setPaymentMode(String paymentMode)
    {
        this.paymentMode=paymentMode;
    }
    public static int getCounter()
    {
        return counter;
    }
 
    
}

class StaticExercise {
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");
        
        //Create more objects and add them to the bills array for testing your code
              
        Bill[] bills = { bill1, bill2 };
              
        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
       }
    }
}

