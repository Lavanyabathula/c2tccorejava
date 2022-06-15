
class A
{
    public void VehicleType()
    {
    	System.out.println("Maruti");
    }
}
class B extends A
{
	public void speed()
	{
    	System.out.println("The speed is 120");

	}
}
class C extends B
{
	public void mileage()
	{
    	System.out.println("The mileage is 25 per 100km");

	}
}
public class CarDemo extends C {

	public static void main(String[] args)
	{
        CarDemo obj=new CarDemo();
        obj.speed();
        obj.mileage();
        obj.VehicleType();

	}

}
