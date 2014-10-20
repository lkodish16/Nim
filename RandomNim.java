public class RandomNim
{
  int pieces, guess;
  public RandomNim() 
  {
    pieces = 13;
  }
  public RandomNim(int s) 
  {
    pieces = s;
  } 
  public int play(int p) 
  {
    if (p % 3 == 0) 
    {
      return 2;
    } 
    else if (p % 3 == 2) 
    {
      return 1;
    } 
    else  
    {
      if (Math.random() < .5) 
      {
        return 1;
      }
      else 
      {
        return 2;
      }
    }
  }
}
