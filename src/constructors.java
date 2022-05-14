class product
{
    private String itemno;
    private String name;
    private double price;
    private int qty;

    // below constructor has same name as class name ie product with 1 parameter
    public product(String itemNo){
        itemno=itemNo;
    }
    public product(String itemNo,String name){
        itemno=itemNo;
        this.name=name;
    }
    public product(String itemNo,String name,double price,int qty){
        itemno=itemNo;
        this.name=name;
        setPrice(price);
        setQuantity(qty);
    }
    public String getItemNo()
    {
        return  itemno;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public int getQuantity()
    {
        return qty;
    }

    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setQuantity(int qty)
    {
        this.qty=qty;
    }
}

public class constructors {
    public static void main(String args[])
    {
        product a= new product("A21");// new object is created and value is assigned
        product b = new product("A17","Santoor",18.9,4);
        product c = new product("A21","AloFruit");
        System.out.println(a.getItemNo());
        System.out.println(b.getQuantity());
        System.out.println(a.getClass());
        System.out.println(c.getName());

    }

}
