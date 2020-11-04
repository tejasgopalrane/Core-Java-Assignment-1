class Expression
{
     public static void main(String args[])
{
     double x=5,a=2,y,z;
	y=Math.pow(x,a)+3*x-7;
      	System.out.println(y);
	y=x++ + ++x;
	System.out.println(y);
	z=x++ - --y - --x + x++;
	boolean d,c=true,b=false;
	d=((b && c) || (b || c));
	System.out.println(d);         
      
    }
}