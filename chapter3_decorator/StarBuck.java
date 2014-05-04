package chapter3_decorator;

public class StarBuck {
	public static void main(String[] args){
		Beverage beverage=new Espresso();
		beverage=new Mocha(beverage);
		beverage=new Soy(beverage);
		System.out.println(beverage.getDescription()+":$"+beverage.cost());
	}
}
