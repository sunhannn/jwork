package javautilEx;

public class Book implements Cloneable {
	private String bookName;
	private String author;

	public Book() {

	}

	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void showBookInfo() {
		System.out.println(bookName + "," + author);
	}

	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}

	static void arrayPrint(String s, Book[] a) {
		System.out.println(s);
		for (Book i : a) {
			i.showBookInfo();
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		book1[0] = new Book("동백꽃필무렵", "김유정");
		book1[1] = new Book("태백산맥", "조정래");
		book1[2] = new Book("수난이대", "하근찬");
		System.arraycopy(book1, 1, book2, 0, 2);
		book2[2] = new Book("진주목걸이", "모파상");
		arrayPrint("(1) book1 : ", book1);
		arrayPrint("(1) book1 : ", book1);
		System.out.println();

		book1[1].setBookName("운수좋은날");
		book1[1].setAuthor("현진건");
		arrayPrint("(2) book1 : ", book1);
		arrayPrint("(2) book2 : ", book2);
		System.out.println();

		book2[2] = (Book) book1[1].clone(); // clone() 복제한 내용을 새로운 객체로 생성
		arrayPrint("(3) book1 : ", book1);
		arrayPrint("(3) book2 : ", book2);
		System.out.println();

		book1[1].setBookName("그많던싱아는누가다먹었을까");
		book1[1].setAuthor("박완서");
		arrayPrint("(4) book1 : ", book1);
		arrayPrint("(4) book2 : ", book2);
		System.out.println();

		book2[0] = (Book) book2[2].clone();
		arrayPrint("(5) book1 : ", book1);
		arrayPrint("(5) book2 : ", book2);
		System.out.println();
	}

}
