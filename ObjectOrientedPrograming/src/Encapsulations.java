class Book{
	private int page=1;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if(page >= 0) {
			this.page = page;
		}
		else {
			System.out.println("Invalid Value");
		}
	}
}
public class Encapsulations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		b.setPage(100);
		System.out.println(b.getPage());
	}
}
