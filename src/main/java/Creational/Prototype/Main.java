package Creational.Prototype;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //PROTOTYPE CLONING HAPPENING AT ROWS 17, 29 & 127.

        Book book = new Book("Book #1", "Author #1", "Genre #1", 2005);
        Recommendation recommendation = new Recommendation("Audience #1");
        recommendation.addBook(book);

        //CLONE BOOKS & ADD THEM UNDER A RECOMMENDATION
        for (int i = 2; i < 6; i++) {
                Book cloneBook = book.clone();
                cloneBook.setTitle( "Book #" + i);
                cloneBook.setAuthor("Author #" + i);
                cloneBook.setGenre("Genre #" + i);

                recommendation.addBook(cloneBook);
        }

        //CLONE RECOMMENDATIONS
        Recommendation recommendation2 = recommendation.clone();
        recommendation2.setTargetAudience("Audience #2");

        Recommendation recommendation3 = recommendation.clone();
        recommendation3.setTargetAudience("Audience #3");

        System.out.println("\n" + recommendation + "\n" + recommendation2 + "\n" + recommendation3 + "\n\n\n\n### Books and Recommendations created, input 'q' to exit. ###");






        //AWFUL COMMAND-LINE INTERFACE, SHOULD HAVE IMPLEMENTED WITH JAVAFX...
        Scanner input = new Scanner(System.in);
        String choice = "";

        Recommendation currentRecommendation  = null;
        Book currentBook = null;

        while (!choice.equals("q")){
            if(currentBook == null && currentRecommendation == null){
                System.out.println("\nChoose a book or recommendation to view:\n1. " + recommendation.getTargetAudience() + "\n2. " + recommendation2.getTargetAudience() + "\n3. " + recommendation3.getTargetAudience());
                choice = input.nextLine();

                switch (choice) {
                    case "1" -> {
                        currentRecommendation = recommendation;
                        continue;
                    }
                    case "2" -> {
                        currentRecommendation = recommendation2;
                        continue;
                    }
                    case "3" -> {
                        currentRecommendation = recommendation3;
                        continue;
                    }
                }

                System.out.print("Invalid input. Try again.");

            }

            if(currentBook == null && currentRecommendation != null){
                System.out.println("\nYou are now browsing " + currentRecommendation.getTargetAudience() + ". What you would like to do?" + "\n1. View books\n2. Change recommendation target audience\n3. Add a new book\n4. Go Back");

                choice = input.nextLine();

                switch (choice) {
                    case "1" -> {
                        System.out.println("Books in the recommendation:");

                        if(currentRecommendation.getBookList().isEmpty()){
                            System.out.println("No books found.");
                            continue;
                        }

                        for (int i = 0; i < currentRecommendation.getBookList().size(); i++) {
                            System.out.println(i + 1 + ". " + currentRecommendation.getBookList().get(i).toString());
                        }

                        System.out.println("\nEnter the number to select a book:");

                        int bookNumber = 0;
                        try {bookNumber = Integer.parseInt(input.nextLine()); } catch (NumberFormatException e) { /* empty */ }


                        if(bookNumber > 0 && bookNumber <= currentRecommendation.getBookList().size()) {
                            currentBook = currentRecommendation.getBookList().get(bookNumber - 1);
                        } else {
                            System.out.println("No book selected.");
                        }

                        continue;
                    }
                    case "2" -> {
                        System.out.println("Enter new target audience:");
                        String newTargetAudience = input.nextLine();
                        currentRecommendation.setTargetAudience(newTargetAudience);
                        currentRecommendation = null;
                        continue;
                    }
                    case "3" -> {
                            //PROTOTYPE CLONING!!!
                            Book cloneBook = book.clone();

                            System.out.println("Enter book title:");
                            cloneBook.setTitle(input.nextLine());

                            System.out.println("Enter book author:");
                            cloneBook.setAuthor(input.nextLine());

                            System.out.println("Enter book genre:");
                            cloneBook.setGenre(input.nextLine());

                            System.out.println("Enter book publication year:");
                            cloneBook.setPublicationYear(Integer.parseInt(input.nextLine()));

                            currentRecommendation.addBook(cloneBook);
                            continue;
                    }
                    case "4" -> {
                        currentBook = null;
                        currentRecommendation = null;
                        continue;
                    }
                }

                System.out.print("Invalid input. Try again.");
            }

            if(currentBook != null && currentRecommendation != null){
                System.out.println("You are browsing book " + currentBook.getTitle() + ". What would you like to do?:\n1. Go Back to recommendation\n2. View book details \n3. Delete book");

                choice = input.nextLine();

                switch (choice) {
                    case "1" -> {
                        currentBook = null;
                        continue;
                    }
                    case "2" -> {
                        System.out.println(currentBook);
                        continue;
                    }
                    case "3" -> {
                        currentRecommendation.removeBook(currentBook);
                        currentBook = null;
                        continue;
                    }
                }

                System.out.print("Invalid input. Try again.");
            }

        }
    }
}
