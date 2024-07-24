
class point{
	private int x;
	private int y;
	public point(int x , int y){
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj){
		point p = (point)obj;
		if(x == p.x && y == p.y) return true;
		else return false;
	}
	}

public class GoodCalc{
public static void main(String[] args) {
point a = new point(2,3);
point b = new point(2,3);
point c = new point(3,4);

if(a==b)
System.out.println("a==b");
if (a.equals(b))
System.out.println("a is equal to b");
if(a.equals(c))
System.out.println("a is equal to c");
}


}