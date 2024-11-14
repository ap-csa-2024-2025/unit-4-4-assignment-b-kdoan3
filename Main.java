import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int count = 0;

  // This stops at the Nth to last letter, where N is the
  // length of the target.  As in, I am checking N letters
  // at a time.
  for (int i = 0; i < word.length() - (target.length() - 1); i++)
  {
    String sub = word.substring(i, i + target.length());
    if (sub.equals(target))
    {
      count++;
    }
  }
  return count;
  }

  public static int countSub(String word, String target)
  {
    return 0;
  }

  public static int countProperContains(String word, String target)
  {
    int count = 0;
    int N = target.length();
    for (int i = 0; i < word.length() - (N-1); i++)
    {
      String sub = word.substring(i, i+N);
      boolean beginOrSpaceBefore;
      boolean endOrSpaceAfter;
      boolean properlyContained = beginOrSpaceBefore && endOrSpaceAfter;
      if (sub.equals(target) && properlyContained)
      {
        count++
      }
    }
    return count;
  }

  public static String deleteSub(String word, String target)
  {
    return null;
  }
}
