package com.example.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;

	@ManyToOne(cascade = CascadeType.ALL) // This happens because you have a
											// collection in your entity, and
											// that collection has one or more
											// items which are not present in
											// the database. By specifying the
											// above options you tell hibernate
											// to save them to the database when
											// saving their parent.
	@JoinColumn(name = "book_category_id")
	private BookCategory bookCategory;

	/*
	 * @OneToMany and @ManyToOne defines a one-to-many and many-to-one
	 * relationship between 2 entities. @JoinColumn indicates the entity is the
	 * owner of the relationship: the corresponding table has a column with a
	 * foreign key to the referenced table. mappedBy indicates the entity is the
	 * inverse of the relationship.
	 */
	@JoinColumn(name = "author_id")
	@ManyToOne(cascade = CascadeType.ALL)
	private Author authorId;

	public Author getAuthorId() {
		return authorId;
	}

	public void setAuthorId(Author authorId) {
		this.authorId = authorId;
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

	public BookCategory getBookCategory() {
		return bookCategory;
	}

	public void setBookCategory(BookCategory bookCategory) {
		this.bookCategory = bookCategory;
	}

	public Book() {

	}

	public Book(String name, BookCategory bookCategory) {
		this.name = name;
		this.bookCategory = bookCategory;
	}

	public Book(String name, BookCategory bookCategory, Author authorId) {
		
		this.name = name;
		this.bookCategory = bookCategory;
		this.authorId = authorId;
	}
	
	

}
