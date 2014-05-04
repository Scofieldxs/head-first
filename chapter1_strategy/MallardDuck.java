package chapter_1;

public class MallardDuck extends Duck{
	public MallardDuck(){
		quackBehavior =new Quack();
		flyBehavior=new FlyWithWings();
	}
	
	public void display(){
		System.out.println("I'm a mallardDuck.");
	}
	
	public static void main(String[] args){
		Duck marrlDuck=new MallardDuck();
		marrlDuck.performFly();
		marrlDuck.performQuack();
		marrlDuck.swim();
		
		System.out.println();
		marrlDuck.setFlyBehavior(new FlyNoWay());
		marrlDuck.performFly();
	}
	
}
