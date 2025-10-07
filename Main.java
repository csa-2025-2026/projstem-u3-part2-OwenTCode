import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    //Problem 1
    double blub = 12.345;
    Scanner blub2 = new Scanner(System.in);
    System.out.println("Insert a double: ");
    double blub3 = blub2.nextDouble();
    Boolean blub4 = (blub == blub3);
    if (blub4)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }


    //Problem 2
    int blah = 48;
    Scanner blah2 = new Scanner(System.in);
    System.out.println("Insert an int: ");
    int blah3 = blah2.nextInt();
    Boolean blah4 = (blah == blah3);
    if (blah4)
    {
      System.out.println("Yes");
    }
    else
    {
      System.out.println("No");
    }

    //Problem 3
    Scanner grr = new Scanner(System.in);
    System.out.println("Insert 2 ints: ");
    int grr2 = grr.nextInt();
    int grr3 = grr.nextInt();
    Boolean grr4 = (grr2 == grr3);
    if (grr4)
    {
      System.out.println("Yes");

    }
    else
    {
      System.out.println("No");
    }

    //Problem 4
    System.out.println("Insert an int: ");
    int ahh = grr.nextInt();
    Boolean ahh2 = (ahh%2 == 0);
    Boolean ahh3 = (ahh%3 == 0);
    Boolean ahh4 = (ahh2 && ahh3);

    if (ahh4)
    {
      System.out.println("Divisible by 2!");
      System.out.println("Divisible by 3!");

    }
    else if (ahh3)
    {
      System.out.println("Divisible by 3!");
    }
    else if (ahh2)
    {
      System.out.println("Divisible by 2!");
    }

    //Problem 5
    

    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
