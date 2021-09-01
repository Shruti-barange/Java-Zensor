package area;

public class CalculateAreaRSC  extends Shape{
	
	void reactangleArea(int L,int B)
	{
		System.out.println("Area of Reactangle:" +(L*B));
	}
	void squareArea(int s)
	{
		System.out.println("Area of Square: "+(s*s));
	}
	
	void circleArea(int r)
	{
		System.out.println("Area of Circle: " +(3.14*r*r));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		CalculateAreaRSC ca=new CalculateAreaRSC();
        ca.reactangleArea(10,20);
        ca.squareArea(12);
        ca.circleArea(4);


	}

}
