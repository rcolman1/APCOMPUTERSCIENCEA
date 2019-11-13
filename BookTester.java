

public class BookTester
{
 public static void main(String[] args)
 {
     Books b1 = new Books("Old Man and the Sea", "Ernest Hemingway", 345);
     Books b2 = new Books("The Highly Sensitive Person", "Elaine Aron", 200);
     System.out.println(b1);
     System.out.println(b2);
     b1.setTitle("Invisible Man");
     System.out.println(b1);
     b1.setAuthor("Ralph Ellison");
     System.out.println(b1);
     b1.setpageNumbers(500);
     System.out.println(b1);
     b2.setTitle("Their Eyes were Watching God");
     System.out.println(b2);
     b2.setAuthor("Zora Neale Hurston");
     System.out.println(b2);
     b2.setpageNumbers(499);
     System.out.println(b2);
     
     
    }
}
