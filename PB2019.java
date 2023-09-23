import java.util.Scanner;
class PB2019
{
  static String lVow = "aeiou";
  static String uVow = "AEIOU";
  static String cons = "";
  static String all = "";
  public static void allVow(String w)
  {
    for (int i = 0; i < 5; i++)
    {
      if ((w.indexOf(lVow.charAt(i)) == -1) &&
          (w.indexOf(uVow.charAt(i)) == -1)) return;
    }
    all += w + " ";
  }
  public static void consVow(String w)
  {
    int index = -1; int lastIndex = -1;
    for (int i = 0; i < w.length(); i++)
    {
      char ch = w.charAt(i);
      lastIndex = index;
      if (lVow.indexOf(ch) != -1)
        index = lVow.indexOf(ch);
      else if (uVow.indexOf(ch) != -1)
        index = uVow.indexOf(ch);
      if (lastIndex != -1 && lastIndex != 4)
      {
        if (index == lastIndex + 1)
        {
          cons += w + " ";
          return;
        }
      }
    }
  }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the sentence ending with dot(.): ");
    String s = sc.nextLine().trim();
    if (s.charAt(s.length() - 1) != '.')
    {
      System.out.println("Sorry!!! Sentence is not ending with Fill Stop");
      System.exit(0);
    }
    String w = "";
    for (int i = 0; i < s.length(); i++)
    {
      char ch = s.charAt(i);
      if (ch == ' ' || ch == '.')
      {
        if (s.charAt(i-1) == ' ') continue;
        else
        {
          allVow(w);
          consVow(w);
          w = "";
        }
      }
      else w += ch;
    }
    if (cons.length() != 0)
    {
      System.out.println("Words with consecutive Vowels: " + cons);
    }
    else
    {
      System.out.println("Sorry!!! NO Words with consecutive Vowels:");
    }
    if (all.length() != 0)
    {
      System.out.println("Words with all Vowels: " + all);
    }
    else
    {
      System.out.println("Sorry!!! NO Words with all Vowels:");
    }
  }
}
