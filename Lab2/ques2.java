package Lab2;



import java.util.Scanner;

class Book {
	private String bookTitle;
	private String author;
	private String ISBN;
	private int numOfCopies;

	public Book(String bookTitle, String author, String iSBN, int numOfCopies) {
		this.bookTitle = bookTitle;
		this.author = author;
		this.ISBN = iSBN;
		this.numOfCopies = numOfCopies;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public String getISBN() {
		return ISBN;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}

	public void DisplayBook() {
		System.out.println("Book Title : " + bookTitle);
		System.out.println("Book Author : " + author);
		System.out.println("Book ISBN : " + ISBN);
		System.out.println("Book No. of Copies : " + numOfCopies);
	}

}

class BookStore {
	private Book[] books = new Book[10];
	private int typesOfBooks = -1;

	public void sell(String bookTitle, int noOfCopies) {
		boolean bookfound = false;
		for (int i = 0; i <= typesOfBooks; i++) {
			Book book = books[i];
			if (book.getBookTitle().equals(bookTitle)) {
				bookfound = true;
				if (book.getNumOfCopies() < noOfCopies) {
					System.out.println(
							"Not Enough Book in Stock to sell, we only have " + book.getNumOfCopies() + " books");
				} else {
					book.setNumOfCopies(book.getNumOfCopies() - noOfCopies);
					System.out.println(noOfCopies + " Copies of " + bookTitle + " is sold Successfully");
				}
			}
		}
		if (!bookfound) {
			System.out.println("No Book with title " + bookTitle + " is present in the Store :)");
		}
	}

	public void order(String ISBN, int numOfCopies) {
		boolean bookfound = false;
		for (int i = 0; i <= typesOfBooks; i++) {
			Book book = books[i];
			if (book.getISBN().equals(ISBN)) {
				bookfound = true;
				book.setNumOfCopies(book.getNumOfCopies() + numOfCopies);
			}
		}
		if (!bookfound) {
			System.out.println("This book is not in the List please Enter the Book Details : ");
			System.out.print("Enter Book Title : ");
			Scanner sc = new Scanner(System.in);
			String newBookTitle = sc.next();
			System.out.print("Enter Book Author : ");
			String newBookAuthor = sc.next();

			Book newbook = new Book(newBookTitle, newBookAuthor, ISBN, numOfCopies);
			books[++typesOfBooks] = newbook;
			System.out.println("Book added to the Book Store ");
			sc.close();
		}
		
	}

	public void Display() {
		if (typesOfBooks == -1)
			System.out.println("No Book is there in Book Store ");
		else {
			System.out.println("There are " + (typesOfBooks+1) + " Books in Book Store ");
			for (int i = 0; i <= typesOfBooks; i++) {
				Book book = books[i];
				book.DisplayBook();
				System.out.println();
			}
		}
	}

}
public class ques2 {

	public static void main(String[] args) {
		BookStore bookstore = new BookStore();
		Scanner sc = new Scanner(System.in);
		optionchooser();
		int prompt = sc.nextInt();
		while (prompt != 0) {
			switch (prompt) {
			case 1:
				bookstore.Display();
				break;
			case 2:
				System.out.print("Enter the isbn Value of book :");
				String isbn = sc.next();
				System.out.print("Enter the no of Copies you want to order : ");
				int noofcopies = sc.nextInt();
				bookstore.order(isbn, noofcopies);
				break;
			case 3:
				System.out.print("Enter the title of book :");
				String title = sc.next();
				System.out.print("Enter the no of Copies you want to Sell : ");
				noofcopies = sc.nextInt();
				bookstore.sell(title, noofcopies);
			}

			optionchooser();
			prompt = sc.nextInt();
		}
		sc.close();
	}
	
	public static void optionchooser() {
		System.out.println("Enter '1', to display the Books: ");
		System.out.println("Enter '2', to order the Books: ");
		System.out.println("Enter '3', to sell the Books: ");
		System.out.println("Enter '0', to exit the system : ");
	}
}
