package com.ohgiraffers.hw1.view;

import com.ohgiraffers.hw1.controller.BookManager;
import com.ohgiraffers.hw1.model.dto.BookDTO;

import java.util.List;
import java.util.Scanner;

public class BookMenu {

    Scanner sc = new Scanner(System.in);

    public void BookMenu(){}        //기본생성자

    BookManager bm = new BookManager();

    public void mainMenu(){

        // 1. 새 도서 추가       addBook (inputBook()이 리턴한 객체) 실행
        // 2.  도서정보 정렬 후 출력 // printBookList() 실행 =>인자로 selectSortedBook()하여 리턴받은 리스트 객체사용
        // 3. 도서 삭제 // deleteBook (inputBookNo()이 리턴한 도서 번호) 실행
        // 4. 도서 검색출력 // searchBook (inputBookTitle()이 리턴한 도서 제목) => 결과가 있는경우 해당 도서를 출력하고, 결과가 없는 경우 “조회한 도서가 목록에 없습니다.”
        // 5. 전체 출력 // displayAll() 실행=> 비어있을 경우 “출력결과가 없습니다.” 비어있지 않은 경우 전체 출력
        // 6. 끝내기 // main()으로 리턴

        //메뉴 번호 선택 : >> 입력 받음
        // 메뉴 화면 반복 실행 처리
        // 해당 메뉴 번호에 따라 BookManager 클래스 메소드 실행

        label:
        while (true){

            System.out.println("*** 도서 관리 프로그램 ***");
            System.out.println("1. 새 도서 추가 ");
            System.out.println("2. 도서정보 정렬 후 출력 ");
            System.out.println("3. 도서 삭제 ");
            System.out.println("4. 도서 검색출력 ");
            System.out.println("5. 전체 출력 ");
            System.out.println("6. 끝내기 ");
            System.out.println("메뉴 번호 선택 : ");
            int num = sc.nextInt();

            switch (num) {

                case 1 : bm.addBook(inputBook());          // 새 도서 추가
                    break;

                case 2 : bm.printBookList(selectSortedBook());    // 도서정보 정렬 후 출력
                    break;

                case 3 : bm.deleteBook(inputBookNo());       // 삭제할 도서 찾고 실행
                    break;

                case 4 :
                    bm.searchBook(inputBookTitle());       // 도서 검색 -> bm.searchBook으로 넘어가서 반환
                    break;

                case 5 : bm.displayAll();       // "비어있을 경우 "출력 결과가 없습니다." , 그렇지 않은 경우 전체 출력
                    break;

                case 6 :
                    System.out.println("프로그램을 종료합니다.");
                    break label;

                default:
                    System.out.println("잘못된 번호를 입력하셨습니다.");
                    break;
            }
        }

    }


    public BookDTO inputBook(){
        // "도서 제목 : " >> 입력 받음
        // "도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : " >> 입력 받음 (숫자로)
        // "도서 저자 : " >> 입력 받음
        // 매개변수 생성자를 이용하여 위의 초기값을 이용한 BookDTO객체 리턴
        System.out.println("번호를 입력해주세요 : ");
        int bNo = sc.nextInt();

        System.out.println("제목을 입력해주세요 : ");
        String title = sc.next();

        sc.nextLine();

        System.out.println("장르 1: 인문 / 2: 자연과학 / 3: 의료 / 4 : 기타 ");
        int category = sc.nextInt();

        sc.nextLine();

        System.out.println("저자를 입력해주세요 : ");
        String author = sc.nextLine();


        BookDTO bookDTO = new BookDTO(bNo, title, category, author);

        return bookDTO;
    }


    public int inputBookNo(){

        // "도서 번호 : " >> 입력 받음 >> 리턴

        System.out.println("도서 번호 : ");


        return inputBookNo();
    }


    public String inputBookTitle(){

        // "도서 제목 : " >> 입력받음 >> 리턴


        System.out.println("검색할 도서 제목을 입력하세요 : ");
        String title = sc.nextLine();

        sc.nextLine();

        return title;
    }


    public List<BookDTO> selectSortedBook(){

        // 도서 정렬방식을 정수로 입력받아서
        // 1. 도서번호(ISBN)으로 오름차순정렬
        // 2. 도서번호(ISBN)으로 내림차순정렬
        // 3. 책 제목으로 오름차순 정렬
        // 4. 책 제목으로 내림차순 정렬

        // BookManager 객체의 sortedBookList() 메소드를 이용하여 출력


        return selectSortedBook();
    }

}
