package JunitTesting;

public class quadratic 
{
	private float a,b,c;
	public float x1,x2;
	public quadratic(float a,float b,float c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int solve()
	{
		float delta=b*b-4*a*c;
		if(a==0) {System.out.println("day khong phai phuong trinh bac 2");return -1;}
		else
		if(delta<0) {System.out.println("Phuong trinh vo nghiem!");return 0;}
		else if(delta==0){
			x1=x2=(-b)/(2*a);
			System.out.println("Phuong trinh co nghiem kep : x1=x2 ="+-b/(2*a));
			return 1;
			}
		else {
			x1=(float) ((-b-Math.sqrt(delta))/(2*a));
			x2=(float) ((-b+Math.sqrt(delta))/(2*a));
			System.out.println("Phuong trinh co 2 nghiem phan biet x1 = "+x1+" x2 = "+x2);}
		return 2;
		
	}
	public static void main(String[] args)
	{
		quadratic a=new quadratic(1,4,4);
		a.solve();
	}
}