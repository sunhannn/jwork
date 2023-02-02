package methodex;

 class Point07 {
		private int x;
		private int y;
		public void setX(int x) { this.x=x;  }
		public void setY(int y) { this.y=y;  }
		public int getX( ) { return x; }
		public int getY( ) { return y; }
	}
	
	public class Ex07 {
		public static void main(String[] args) {
			Point07 pt02 = new Point07();
			pt02.setX(10);
			pt02.setY(20);
			System.out.println(pt02.getX() + ", "+pt02.getY());
		}
	}
	



