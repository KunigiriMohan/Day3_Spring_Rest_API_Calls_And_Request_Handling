package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @Bean Class defining values
 * @Table: Defining Table
 * @Entity : Defining class as Entity
 * @Id : Representing which variable can be taken as Id in table
 */
@Entity
@Table(name="GREETINGS")
public class Greeting {
	@Id
	private long id;
    private String template;
    
    public Greeting(){}
    
    /**
     * getters and setters for initializing and getting the values
     * @return
     */
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getContent() {
        return template;
    }
    public void setContent(String template) {
        this.template = template;
    }
    
    /**
     * Constructor of Greeting Class
     * @param id
     * @param template
     */
    public Greeting(long id, String template) {
        this.id = id;
        this.template = template;
    }
}