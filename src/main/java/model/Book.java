package model;

//잘 설계된 DTO 객체
public class Book {

    // 멤버변수, 상태정보, 속성
    private String title;
    private int price;
    private  String company;
    private  String author;

    //디폴트 생성자
    public Book() {
    }


    //중복 정의 : 생성자 메서드의 오버로딩
    public Book(String title, int price, String company, String author) {
        this.title = title;
        this.price = price;
        this.company = company;
        this.author = author;
    }

    //getter, setter


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
