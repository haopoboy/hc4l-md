package hc4l.course.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert @DynamicUpdate
public class User implements Serializable {
	private static final long serialVersionUID = 7958396973313544129L;

	private Long id;
	private String name;
	
	@Id
	public Long getId() {
		return id;
	}
	
	public User setId(Long id) {
		this.id = id;
		return this;
	}
	
	public String getName() {
		return name;
	}
	
	public User setName(String name) {
		this.name = name;
		return this;
	}
}