/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with user:
  java GuessNumber
  Guess a number fr 1-100: 50
  Too high
  Guess a number fr 1-49: 25
  Too low
  Guess a number fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/

public class GuessNumber {

    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
            _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) {
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
                        Uses recursion.
      ==================================================*/
    public void playRec() {
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
                         Uses iteration.
      ==================================================*/
    public void playIter() {

    }


    //wrapper for playRec/playIter to simplify calling
    public void play() { 
	//use one or the other below:
	//playRec();
	playIter();
    }


    //main method to run it all
    public static void main( String[] args ) {

	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();
    }

}//end class GuessNumber
