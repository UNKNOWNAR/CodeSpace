class Detail
{
    String name,address,telno;
    long rent;
    Detail(String a,String b,String c,long d)
    {
        name=a;
        address=b;
        telno=c;
        rent=d;
    }
    void show()
    {
        System.out.println("Name of the customer : "+name);
        System.out.println("Address : "+address);
        System.out.println("Phone number : "+telno);
        System.out.println("Monthly rental charge : "+rent);
    }
}
class Bill extends Detail
{
    int n;
    double amt;
    Bill(String a,String b,String c,long d,int e)
    {
        super(a,b,c,d);
        this.n=e;
        this.amt=0.0;
    }
    void cal()
    {
        if(n<=100)
            amt=rent;
        else if(n>100 && n<=200)
            amt=rent+(n-100)*0.60;
        else if(n>200 && n<=300)
            amt=rent+100*0.60+(n-200)*0.80;
        else
            amt=rent+100*0.60+100*0.80+(n-300)*1.00;
    }
    void show()
    {
        super.show();
        System.out.println("Number of calls : "+n);
        System.out.println("Total Amount to be paid : Rs."+amt);
    }
}