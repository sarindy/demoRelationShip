package com.example.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book_detailsssss")
public class BookDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "number_of_pages")
	private Integer numberOfPages;

	/*@OneToOne(mappedBy="bookDetail")
	private Book book;*/
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="book_id")
	private Book book;
	//Explanation :  This field will not create in the Database table it mapped with the correspondent table Book and bookDetail is the property field
	//in the Book Table
	//If we don't specify the mappedBy it will create field book_id in the database table.
	

	public BookDetail() {

	}

	public BookDetail(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookDetail(Integer numberOfPages, Book book) {
		super();
		this.numberOfPages = numberOfPages;
		this.book = book;
	}
	

}
