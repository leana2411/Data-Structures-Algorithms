
public class ReverseWordsInString 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    System.out.printf("1. Enter string to reverse : ");
    String inputString = scanner.nextLine();

    if (inputString == null || inputString.length() == 0) 
    {
      System.out.println("Enter the valid string");
      return;
    }
    String reverse = reverseStringWordWise_Stack(inputString);
    System.out.printf("\n3. Reverse string using stack is : %s", reverse);
  } 
  private static String reverseStringWordWise_Stack(String inputString) 
   {
     String[] arrString = inputString.trim().split(Pattern.quote(" "));
     Stack stack = new Stack();
     for(String input : arrString) 
     {
       stack.push(input);
     }
    StringBuilder builder = new StringBuilder();
    while( !stack.isEmpty()) 
    {
      builder.append(stack.pop()).append(" ");
    }
    return builder.toString();
  }
}