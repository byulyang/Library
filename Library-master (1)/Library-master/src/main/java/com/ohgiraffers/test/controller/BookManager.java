package com.ohgiraffers.test.controller;

import com.ohgiraffers.hw2.model.comparator.AscCategory;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookManager {

  public BookManager(){
    List<BookDTO> bookDTOList = new ArrayList<BookDTO>();
  }

  ArrayList<BookDTO> bookList = new ArrayList<BookDTO>();

  public void addBook(BookDTO book) {
    this.bookList.add(new BookDTO(book.getCategory(), book.getTitle(), book.getAuthor()));
    this.bookList.sort(new AscCategory());
    for (BookDTO bookDTO : bookList) {
      System.out.println( "bookList after add : " + bookDTO);
    }
  }

  public void deleteBook(int index) {
    this.bookList.remove(index);
    for (BookDTO bookDTO : bookList) {
      System.out.println( "bookList after delete : " + bookDTO);
    }
  }

  public int searchBook(String bTitle) {
    int bookIndex = 0;

    for (int i = 0; i < this.bookList.size(); i++) {

      if (this.bookList.get(i).getTitle().equals(bTitle)) {
        System.out.println("입력한 도서 제목 : " + bTitle + "이고, 해당 도서의 검색결과 : " + this.bookList.get(i).getTitle().equals(bTitle));
        bookIndex = i;
      }
    }
    return bookIndex;
  }

  public void printBook(int index) {
    System.out.println(this.bookList.get(index));
  }

  public void displayAll() {
    System.out.println( "현재 전체 도서 목록 : " + this.bookList.size() + "권 입니다.");

    this.printBookList(this.bookList);
  }


  public ArrayList<BookDTO> sortedBookList(int select) {
    ArrayList<BookDTO> sortedList = new ArrayList<>();
    System.out.println("입력한 번호 : "+ select + "이고, 해당 카테고리 : "+(select == 1 ? "인문" : select == 2 ? "자연과학" : select == 3 ? "의료" : "기타")+"입니다. ");
    for (int i = 0; i < this.bookList.size(); i++) {


      if (this.bookList.get(i).getCategory() == select) {
        sortedList.add(this.bookList.get(i));
      }
    }

    return sortedList;
  }
  public void printBookList(ArrayList<BookDTO> br) {
    br.sort(new AscCategory());
    for (BookDTO book : br) {
      System.out.println(book);
    }
  }

}
