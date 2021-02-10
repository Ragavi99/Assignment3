package shape;

public class Square implements Polygon {
	float side;
	
	public Square(float side)
	{
		super();
		this.side=side;
	}

	public void calcArea() {
		float area = side*side;
		System.out.println("area of the square ="+area);
		
	}

	public void calcPeri() {
		float peri=4*side;
		System.out.println("perimeter of the square =" +peri);
		
	}

	

}
