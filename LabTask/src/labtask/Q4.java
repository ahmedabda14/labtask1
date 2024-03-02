/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labtask;

/**Using class, design a concept for Book in a library. Some of the
characteristics of a book are the title, author(s), publisher, ISBN, price, and year
of publication
 *
 * @author ahmed
 */
public class Q4 {
    public String title;
    public String author;
    public String publisher;
    public int ISBN;
    public double price;
    public int year;
    public int copies;

    public Q4(String title, String author, String publisher, 
            int ISBN, double price, int year, int copies) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.ISBN = ISBN;
        this.price = price;
        this.year = year;
        this.copies = copies;
    }
    
    public Q4(String title, int copies){
        this.copies=copies;
        this.title=title;
    }
    public void setTitle(String title){
        this.title=title;
    }
public void setCopies(int copies){
    this.copies=copies;
}
    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }
    public int addCopies(int more){
         return copies+=more;
    }
  public int removeCopies(int more){
      return copies-=more;
  }
    public void checktitle(String title2){
        if (title.equals(title2)){
            System.out.println("the titles match");
        }
       
    }
     public void displayCopies(){
System.out.println("number of copies: "+copies);
}
     public void displayTitle(){
         System.out.println("Title is: "+title);
     }
    
    
            public static void main(String[]Args){
               Q4 book1 = new Q4("asass",24);
               book1.addCopies(12);
               book1.displayCopies();
                
            }
}
