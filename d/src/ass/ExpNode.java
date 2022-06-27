/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * 
 * This class is an abstact class created by COMP610 
 * The constructor receive a string value
 * toString method returns a string symbol
 */

package ass;
/**
 *
 * @author Seth @author hazelsoyeonahn
 */
public abstract class ExpNode {
    //declare leftChild and rightChild
	public ExpNode leftChild;
    public ExpNode rightChild;
    
    protected String symbol;
    
    //constructor
    public ExpNode(String value)
    {
        this.symbol = value;
    }
    
    //return a string of symbol
    @Override
    public String toString()
    {
        return symbol;
    }
    
    //abstact method to return double evaluated value
    public abstract double evaluate() throws ArithmeticException;
}