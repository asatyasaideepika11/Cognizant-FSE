class Book {
    int bookId;
    String title;
    String author;

    Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }
}
public class ex6
{
    public static int binarySearch(Book[] books, String title) 
    {
        int l = 0;
        int r = books.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            int cmp = books[m].title.compareTo(title);

            if (cmp == 0)
                return m;

            if (cmp < 0)
                l = m + 1;
            else
                r = m - 1;
        }

        return -1;
    }
}