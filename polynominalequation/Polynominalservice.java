package polynominalequation;

public class Polynominalservice {
	Node head;
	Node tail;
	int deg = 0;
	private int degree;
	public Node getHead(){
		return head;
	}
	public boolean isOperator(char c){
		
		return (c == '+'||c =='-');
	}
	
	public  void stringToLinkList(String equation)
	{ 
	int coeff;
	int power;
	//int power2;
	//int power3;
	int previous = 0;
	String term = null;
	for (int i=1;i<equation.length();i++){
		if(isOperator(equation.charAt(i))||(i == equation.length()-1)){
			term = equation.substring(previous, i);
		
		if(i == equation.length()-1){
			term = term + equation.charAt(equation.length()-1);
		}
		String c = term.substring(0, term.indexOf('X'));
		
		if((c == " ")||(c == "+")||(c == "-")){
			c+="1";
		}
		coeff = Integer.parseInt(c);
		power = Integer.parseInt(term.substring(term.indexOf('x')+2));
		  
		previous = i;
	}
}}
	public int degree(){
		return degree;
	}
	public void addEquation(Polynominalservice poly1,Polynominalservice poly2){
	
		Node ptr1;
		Node ptr2;
		
		
	}
	
}
