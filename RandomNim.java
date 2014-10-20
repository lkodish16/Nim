public class RandomNim
{
  int pieces, guess;
  public RandomNim() 
  {
    pieces = 13;  // default number of pieces
  }
  public RandomNim(int s) 
  {
    pieces = s;  // number of pieces can be changed when a new RandomNim object is created. 
  } 
  public int play(int p) 
  {
    if (p % 3 == 0)  // if number of pieces is divisible by 3, the computer takes 2 pieces.
    {
      return 2;
    } 
    else if (p % 3 == 2) // if number of pieces divided by 3 has a remainder of 2, the computer takes 1 piece.
    {
      return 1;
    } 
    else  
    {
      if (Math.random() < .5)  // if the number of pieces divided by 3 has a remainder of 1, the computer will randomly take 1 or 2 pieces.
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
