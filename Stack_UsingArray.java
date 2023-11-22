
class Stack_UsingArray{
  //Leana 22csu106
  public static void main (String args[])
  {
    Stack stk = new Stack ();
      stk.push (1);
      stk.push (2);
      stk.push (3);
      System.out.println ("element poped out : " + stk.pop ());
      
      System.out.println ("Peeked element: " + stk.peek());

  }
}
class Stack
{
  static int MAX = 100;
  int top;
  int a[] = new int[MAX]; 
boolean isEmpty ()
  {
    return (top < 0);
  }
  Stack ()
  {
    top = -1;
  }

  boolean push (int x)
  {
    if (top >= (MAX - 1))
      {
  System.out.println ("Overflow condition reached");
  return false;
      }
    else
      {
  a[++top] = x;
  System.out.println ( " pushed into stack" + x);
  return true;
      }
  }
int pop ()
  { if (top < 0){
  System.out.println ("Underflow condition reached");
  return 0;
      }
    else
      {
  int x = a[top--];
  return x;}  }
int peek ()
  {
    if (top < 0)
      {
  System.out.println ("Underflow condition");
  return 0;
      }
    else
      {
  int x = a[top];
  return x;
      }
  }
}
