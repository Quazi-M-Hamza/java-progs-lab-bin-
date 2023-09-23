import java.util.Scanner;
class Question2
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter String ending with dot(.)");
    String s = sc.nextLine().trim();
    int l = s.length();
    if(s.charAt(l-1) != '.')
    {
      System.out.println("INVALID STRING");
      System.exit(0);
    }
    int count = 0, sum = 0, index = 0;
    String str = "", add = "", w = "";
    for (int i = 0; i < l; i++)
      if (s.charAt(i) == ' ' || s.charAt(i) == '.') count++;
    String[] words = new String[count];
    for (int i = 0; i < l; i++)
    {
      char ch = s.charAt(i);
      if (ch == ' ' || ch == '.')
      {
        words[index++] = w;
        w = "";
      }
      else w += ch;
    }
    for (int i = 0; i < count; i++)
    {
      String token = words[i]; String n = "0", wd = "";
      for (int j = 0; j < token.length(); j++)
      {
        char ch = token.charAt(j);
        if (ch >= '0' && ch <= '9')
          n += ch;
        else
        {
          int num = Integer.parseInt(n);
          if (num != 0)
          {
            add += num + "+";
            sum += num;
            n = "0";
          }
          wd += ch;
        }
      }
      int num = Integer.parseInt(n);
      if (num != 0)
      {
        add += num + "+";
        sum += num;
      }
      words[i] = wd;
    }
    System.out.println(add.substring(0, add.length()-1) + " : " + sum);
    for (int i = 0; i < count; i++)
      str += words[i] + " ";
    System.out.print("Sentence without Digits : ");
    System.out.println(str);
    str = "";
    for (int i = 0; i < count-1; i++)
    {
      String token = words[i];
      int sel = i;
      for (int j = i + 1; j < count; j++)
      {
        String s1 = token.toUpperCase();
        String s2 = words[j].toUpperCase();
        if (s1.compareTo(s2) > 0)
        {
          token = words[j];
          sel = j;
        }
      }
      words[sel] = words[i];
      words[i] = token;
    }
    for (int i = 0; i < count; i++)
     str += words[i] + " ";
    System.out.print("Words of line in Ascending Order : ");
    System.out.println(str);
  }
}
