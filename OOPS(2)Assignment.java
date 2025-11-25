class OOPS_Assignment {
    public static void main(String[] args) {
        Fraction f1=new Fraction(2,3);
        Fraction f2=new Fraction(5, 6);

        Fraction sum=f1.add(f2);
        sum.print();

        Fraction diff = f1.subtract(f2);
        diff.print();

        Fraction prod = f1.multiply(f2);
        prod.print();        
    }
}

class Fraction {
    int numerator, denominator;
		
	// Define constructor here
	Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    
    public int Simplify(int a,int b){
        while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
       }
       return a;
    }
	
    public void gcd(){
        int g = Simplify(Math.abs(numerator), Math.abs(denominator));
        numerator=numerator/g;
        denominator=denominator/g;
    }
	Fraction add(Fraction a){
		// Complete the function
		int newNumerator=this.numerator*a.denominator+a.numerator*this.denominator;
        int newDenominator=this.denominator*a.denominator;
        Fraction ans=new Fraction(newNumerator,newDenominator);
        ans.gcd();
        return ans;	
	}
		
	Fraction subtract(Fraction a){
		// Complete the function
		int newNumerator=this.numerator*a.denominator-a.numerator*this.denominator;
        int newDenominator=this.denominator*a.denominator;
        Fraction ans=new Fraction(newNumerator,newDenominator);
        ans.gcd();
        return ans;			
	}
		
	Fraction multiply(Fraction a){
		// Complete the function
		int newNumerator=this.numerator*a.numerator;
        int newDenominator=this.denominator*a.denominator;
        Fraction ans=new Fraction(newNumerator,newDenominator);
        ans.gcd();
        return ans;			
	}

    // PRINT METHOD
    void print() {
        System.out.println(numerator + "/" + denominator);
    }
}