/*
   Team SMilyFace --  Nobel Gautam, Maddie Ostergaard
   APCS1 pd9
   HW33 -- Do you even add, bro?
   2015-11-18
*/

class Rational
{
    //attributes
    private int p, q; //p = numerator; q = denominator (q!=0)

    //constructors
    public  Rational()
    {
        p = 0;
        q = 1;
    }

    public Rational(int numerator, int denominator)
    {
        p = numerator;
        q = denominator;
        if (q==0){
            p = 0;
            q = 1;
            System.out.println("Invalid demoninator submitted. Number set to 0/1");
        }
        reduce();
    }

    //accessors
    public int getNumerator()
    {
        return p;
    }

    public int getDenominator()
    {
        return q;
    }

    //methods
    public String toString()
    {

        String s = "";

        s += p;
        s += "/";
        s += q;

        return s;  
    }

    public float floatValue()
    {
        return (float)(p/q);
    }

    public static int gcd(int a, int b)
    {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    public void reduce()
    {
        int g = gcd(p, q);
        p /= g;
        q /= g;
    }
    public int compareTo(Rational other)
    {
        if (floatValue() == other.floatValue()) return 0;
        if (floatValue() < other.floatValue()) return -1;
        return 1;
    }

    public void multiply(Rational r)
    {
        this.p *= r.getNumerator();
        this.q *= r.getDenominator();
        reduce();
    }


    public void divide(Rational r)
    {
        this.p *= r.getDenominator();
        this.q *= r.getNumerator();
        reduce();
    }

    public void add(Rational r)
    {
        this.p = this.p * r.q + this.q * r.p;
        this.q *= r.q;
        reduce();
    }

<<<<<<< HEAD
    public boolean equals(Object x){
	if (x instanceof Rational){
	    return (double)(this.p)/this.q == (double)(x.p)/x.q;
	}
	return false;
=======
    public void subtract(Rational r)
    {
        this.p = this.p * r.q - this.q * r.p;
        this.q *= r.q;
        reduce();
>>>>>>> 6bfb4bca604244d43a9402e9c63df4c2ae53e02b
    }

    // main
    public static void main(String[] args)
    {
        Rational r = new Rational(2,17);
        Rational s = new Rational(1,31);
        Rational w = new Rational();

        System.out.println(r + ", " + s + ", " + w);

        r.add(s);
        s.subtract(new Rational(1,4));

        System.out.println(r);
        System.out.println(s);
    }
}

