/*
Team SMilyFace --  Shaumik Ashraf, Maddie Ostergaard
APCS1 pd9
HW32 -- Irrationality stops here
2015-11-16
*/

class Rational {
    
    //attributes
    private int p, q; //p = numerator; q = denominator (q!=0)
    
    //constructors
    public  Rational() {
        p = 0;
        q = 1;
    }
    
    public Rational(int numerator, int denominator) {
        p = numerator;
        q = denominator;
	if (q==0){
	    p = 0;
	    q = 1;
	    System.out.println("Invalid demoninator submitted. Number set to 0/1");
	}
    }
    
    //accessors
    public int getNumerator() {
        return p;
    }
    
    public int getDenominator() {
        return q;
    }
    
    //methods
    public String toString() {
	
        String s = "";
        
        s += p;
        s += "/";
        s += q;
        
        return s;  
    }
    
    public float floatValue() {
        
        return (float)(p/q);
        
    }
    
    public void multiply(Rational r) {
        
        this.p *= r.getNumerator();
        this.q *= r.getDenominator();
        
    }
    
    //
    public void divide(Rational r) {
        this.p *= r.getDenominator();
        this.q *= r.getNumerator();
    }
    
    



    public static void main(String[] args){
	Rational r = new Rational(2,3);
	Rational s = new Rational(1,2);
	Rational w = new Rational();

	System.out.println(r + ", " + s + ", " + w);

	r.multiply(s);
	s.divide(new Rational(1,4));

	System.out.println(r);
	System.out.println(s);
    }

}
    
