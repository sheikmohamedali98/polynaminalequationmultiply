/**
 * 
 */
/**
 * @author ELCOT
 *
 */
package polynominalequation;
public class Node{
	int coeff;
	int power;
	//int power2;
	//int power3;
	Node nextNode;
	

public Node(int coeff, int power){
this.coeff = coeff;
this.power = power;
this.nextNode = null;
}

public int getCoeff(){
	return coeff;
}
public int getPower(){
	return power;
}
public Node getNextNode(){
	return nextNode;
}

public void setNextNode(Node nextNode ){
	this.nextNode = nextNode;
}
}