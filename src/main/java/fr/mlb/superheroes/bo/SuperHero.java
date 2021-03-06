package fr.mlb.superheroes.bo;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class SuperHero {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message="{bean.field.notempty}")
	private String nickname;
	
	@NotNull(message="{bean.field.notnull}")
	@ManyToOne
	private SuperPower superpower;
	
	@NotBlank(message="{bean.field.notempty}")
	private String firstname;
	
	@NotBlank(message="{bean.field.notempty}")
	private String lastname;
	
	@NotNull(message="{bean.field.notnull}")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dateOfBirth;
	
	@NotNull(message="{bean.field.notnull}")
	@ManyToOne
	private Category category;
	
	/**
	 * Contructor empty
	 */
	public SuperHero() {
		super();
	}

	/**
	 * constructor without id
	 * @param nickname
	 * @param superpower
	 * @param firstname
	 * @param lastname
	 * @param dateOfBirth
	 * @param category
	 */
	public SuperHero(String nickname,
			SuperPower superpower,
			String firstname,
			String lastname,
			LocalDate dateOfBirth,
			Category category) {
		super();
		this.nickname = nickname;
		this.superpower = superpower;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.category = category;
	}

	/**
	 * constructor with id
	 * @param id
	 * @param nickname
	 * @param superpower
	 * @param firstname
	 * @param lastname
	 * @param dateOfBirth
	 * @param category
	 */
	public SuperHero(Long id,
			String nickname,
			SuperPower superpower,
			String firstname,
			String lastname,
			LocalDate dateOfBirth,
			Category category) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.superpower = superpower;
		this.firstname = firstname;
		this.lastname = lastname;
		this.dateOfBirth = dateOfBirth;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public SuperPower getSuperpower() {
		return superpower;
	}

	public void setSuperpower(SuperPower superpower) {
		this.superpower = superpower;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "SuperHero [id=" + id + ", nickname=" + nickname + ", firstname="
				+ firstname + ", lastname=" + lastname + ", dateOfBirth=" + dateOfBirth
				+ "]";
	}
}
