package com.ohgiraffers.test.view;

import com.ohgiraffers.test.controller.BookManager;
import com.ohgiraffers.test.model.dto.BookDTO;

import java.util.Scanner;

public class BookMenu {

  Scanner sc = new Scanner(System.in);
  BookManager bm = new BookManager();


  public BookMenu() {
  }

  public void menu() {

    while (true) {
      System.out.println("=========== 도서관리 프로그램 ==========");
      System.out.println("1. 도서 추가하기\n2. 도서 삭제하기\n3. 도서 검색하기\n4. 도서 정보 출력하기\n5. 도서목록 전체 출력하기\n6. 도서 분류코드로 도서 목록 출력하기");
      System.out.print("해당하는 메뉴를 선택하세요 : ");
      int menuNum = sc.nextInt();
      switch (menuNum) {
        case 1:
          bm.addBook(this.inputBook());
          break;
        case 2:
          System.out.print("삭제하실 도서 번호를 입력해주세요 : ");
          int bNum = sc.nextInt();
          bm.deleteBook(bNum);
          break;
        case 3:
          int result = bm.searchBook(inputBookTitle());

          System.out.println("검색하신 도서의 결과값 : " + result);
          break;
        case 4:
          System.out.print("도서 정보를 출력할 도서 번호를 입력해주세요 : ");
          int bNum2 = sc.nextInt();
          bm.printBook(bNum2);
          break;
        case 5:
          bm.displayAll();
          break;
        case 6:
          System.out.print("도서 분류코드를 입력해주세요 : ");
          int bNum3 = sc.nextInt();
          bm.sortedBookList(bNum3);
          bm.printBookList(bm.sortedBookList(bNum3));
          break;

        default :
          System.out.println("메뉴를 잘못 입력하셨습니다. 다시 입력해주세요.");
      }
    }
  }

  public BookDTO inputBook() {

    BookDTO bookDTO = new BookDTO();

    System.out.print("도서 분류코드를 입력해주세요 : ");
    bookDTO.setCategory(sc.nextInt());



    System.out.print("도서 제목을 입력해주세요 : ");
    bookDTO.setTitle(sc.next());

    System.out.print("도서 저자를 입력해주세요 : ");
    bookDTO.setAuthor(sc.next());

    return bookDTO;
  }




  public String inputBookTitle() {
    System.out.print("검색할 도서제목을 입력해주세요 : ");
    String title = sc.next();

    return title;
  }

}
