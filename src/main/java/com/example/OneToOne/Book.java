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
@Table(name = "booksss")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "book_name")
	private String name;
	
	@OneToOne(mappedBy="book")
	//@JoinColumn(name = "book_detail_id")
	private BookDetail bookDetail;
	
	//Explanation: @OneToOne defines a one-to-one relationship with another entity.
	//@JoinColumn indicates the entity is the owner of the relationship: the corresponding table has a column with a foreign key to the referenced table.
	

	public Book() {

	}

	public Book(String name) {
		this.name = name;
	}

	public Book(String name, BookDetail bookDetail) {
		this.name = name;
		this.bookDetail = bookDetail;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BookDetail getBookDetail() {
		return bookDetail;
	}

	public void setBookDetail(BookDetail bookDetail) {
		this.bookDetail = bookDetail;
	}

	@Override
	public String toString() {
		return String.format("Book[id=%d, name='%s', number of pages='%d']", id, name, bookDetail.getNumberOfPages());
	}

}
