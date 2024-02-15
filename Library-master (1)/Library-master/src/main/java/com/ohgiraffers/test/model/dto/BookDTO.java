package com.ohgiraffers.test.model.dto;

public class BookDTO {

  private int bNo;

  private int category;

  private String title;

  private String author;


  public BookDTO(){}

  public BookDTO(int category, String title, String author) {
    this.category = category;
    this.title = title;
    this.author = author;
  }


  public void setbNo(int bNo) {
    this.bNo = bNo;
  }

  public int getbNo() {
    return this.bNo;
  }


  public void setCategory(int category) {
    this.category = category;
  }

  public int getCategory() {
    return this.category;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTitle(){
    return this.title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }




  @Override
  public String toString() {
    return category +" : " + (category == 1 ? "인문" : category == 2 ? "자연과학" : category == 3 ? "의료" : "기타") +
            ", 도서 제목 : '" + title + '\'' +
            ", 도서 저자 : '" + author + '\'';
  }

}
