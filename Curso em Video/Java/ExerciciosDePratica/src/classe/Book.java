package classe;

public class Book implements Publication {
    private String title;
    private String author;
    private int totalPages;
    private int actualPage;
    private boolean open;
    private Person reader;

    public Book(String title, String author, int totalPages, Person reader) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.reader = reader;
    }

   public String detalhes() {
        return "Book{" +
                "title='" + title + '\'' +
                ",\n author='" + author + '\'' +
                ",\n totalPages=" + totalPages +
                ", actualPage=" + actualPage +
                ", open=" + open +
                ",\n reader=" + reader.getName() +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getActualPage() {
        return actualPage;
    }

    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    public void setReader(Person reader) {
        this.reader = reader;
    }
    //=========================================
    @Override
    public void toOpen() {
        this.setOpen(true);
    }

    @Override
    public void toClose() {
       this.setOpen(false);
    }

    @Override
    public void nextPage() {
        this.setActualPage(getActualPage()+1);
    }

    @Override
    public void leafTroughBook(int page) {
        if (page > this.getTotalPages()) {
            this.setActualPage(0);
        } else {
            this.setActualPage(page);
        }
    }
    @Override
    public void previousPage() {
        this.setActualPage(this.getActualPage()-1);
    }
}
