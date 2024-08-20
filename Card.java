public class Card{
	private String suit;
	private String rank;
	private int pointValue;
	
	public Card(String r, String s, int v){
    suit = s;
    rank = r;
    pointValue = v;
  }
  
  public String getSuit(){
    return suit;
  }
  
  public String getRank(){
    return rank;
  }
  
  public int getPointValue(){
    return pointValue;
  }

  public boolean equals(Card c){
    if (this.getSuit().equals(c.getSuit()) && this.getRank().equals(c.getRank()) && this.getPointValue() == c.getPointValue()){
      return true;
    }
    return false;
  }
  
  public String toString(){
    return rank + " of " + suit + " (point value = " + pointValue + ")";
  }
}