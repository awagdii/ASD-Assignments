package day05.strategy;

public class Application
{
    public static void main(String[] args)
    {
        Order order = new Order(120, 220);

    	EducationalDiscount educationalDiscount = new EducationalDiscount();
    	GovernmentDiscount governmentDiscount = new GovernmentDiscount();
    	CharitableDiscount charitableDiscount = new CharitableDiscount();

    	// No discount first
        System.out.println(order.show());
        
    	order.setDiscountStrategy(educationalDiscount);
    	System.out.println(order.show());
        
    	order.setDiscountStrategy(governmentDiscount);
    	System.out.println(order.show());

    	order.setDiscountStrategy(charitableDiscount);
    	System.out.println(order.show());

        Order order2 = new Order(300, 700);
        order2.addDiscountStrategy(educationalDiscount);
//        order2.addDiscountStrategy(governmentDiscount);
//        order2.addDiscountStrategy(charitableDiscount);
        System.out.println(order2.show());


        System.out.println();
    }
    
 }
