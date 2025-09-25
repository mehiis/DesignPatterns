package Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private List<Book> bookList;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        this.bookList = new ArrayList<Book>();
    }

    //DEEP CLONE
    @Override
    public Recommendation clone() throws CloneNotSupportedException{
        Recommendation clonedRecommendation = (Recommendation) super.clone();
        clonedRecommendation.setTargetAudience(targetAudience);

        clonedRecommendation.bookList = new ArrayList<Book>();

        for(Book book : this.bookList){
            clonedRecommendation.addBook(book.clone());
        }

        return clonedRecommendation;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public void addBook(Book book){
        bookList.add(book);
    }

    public void removeBook(Book book){
        bookList.remove(book);
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "targetAudience='" + targetAudience + '\'' +
                "list of books: " + bookList +
                '}';
    }
}
