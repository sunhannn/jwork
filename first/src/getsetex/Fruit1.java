package getsetex;

  class Fruit1 {
    private int apple;
    private int straw;
    private int grape;
    private int sum;
	
    
    Fruit1(int apple, int straw, int grapes){
    	this.apple = apple;
    	this.straw = straw;
    	this.grape = grapes;
    	count(); //카운트라는 메소드를 호출해라
    }
    
    private void count() { 
    	sum = apple + straw + grape;	
    }
    public int gettotal() {
    	return sum;
    }
    //getter, setter만들기
    public int getApple() {
    	return apple;
    }
    public int getStraw() {
    	return straw;
    }
    public int getGrape() {
    	return grape;
    }
    public int Sum() {
    	return sum;
    }
    
    public void setApple(int apple) {
    	this.apple = apple;
    }
    public void setStraw(int straw) {
    	this.straw = straw;
    }
    public void setGrape(int grape) {
    	this.grape = grape;
    }	
    public void setSum(int sum) {
    	this.sum = sum;    	
    }
    
}
