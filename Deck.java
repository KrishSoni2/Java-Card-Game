public class Deck{
	
	private Card[] cards;
	private int size;
	
	public Deck(String[] ranks, String[] suits, int[] values){
	  
		cards = new Card[ranks.length * suits.length];
	  size = cards.length - 1;
    
		int index = 0;
	  
		for (int i = 0; i < suits.length; i++){  
			for (int j = 0; j < ranks.length; j++){
	      cards[index] = new Card(ranks[j], suits[i], values[j]);
	      index++;
	    }
		}
    shuffle();
	}

	public boolean isEmpty(){

		if(size == 0){
			
			return true;
		
		}
		else{
			
			return false;
			
		}
	}

	public int size(){
		return size;
	}

	public Card deal(){
		if(isEmpty()){
			return null;
		} else{
			size--;
			return cards[size];
		}
	}

	public void shuffle(){
		size = cards.length - 1;
		for(int k = size; k > 0; k--){
			int r = (int) (Math.random() * k+1);
      Card temp = cards[k];
      cards[k] = cards[r];
      cards[r] = temp;
		}
	}

	public String toString(){
		String Undealval= "";
    String Dealval = "";
    for (int n = 0; n < cards.length; n++){
      if (n <= size){
        Undealval += cards[n] + "\n";
      }
      else {
        Dealval += cards[n] + "\n";
      }
    }
		return "Undealt cards:\n" + Undealval + "\nDealt cards:\n" + Dealval;
	}
}
