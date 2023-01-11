public class Book {
    private String title;
    private String author;
    private int edition;
    private int year;
    private Chapters chapters;

    Book(String title,String author,int edition,int year) {
        this.title = title;
        this.author = author;
        this.edition = edition;
        this.year = year;
    }

    void setChapters(String[] names) {
        this.chapters = new Chapters(names);
    }

    String getTitle() {
        return this.title;
    }
    String getAuthor() {
        return this.author;
    }
    int getEdition() {
        return this.edition;
    }
    int getyear() {
        return this.year;
    }
    int getChaptersNumber() {
        return this.chapters.chaptersNumber;
    }
    String[] getChaptersNames() {
        return this.chapters.chaptersNames;
    }
}
