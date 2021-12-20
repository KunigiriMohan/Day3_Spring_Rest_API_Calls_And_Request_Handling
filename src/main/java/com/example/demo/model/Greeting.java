package com.example.demo.model;
/**
 * 
 * @Bean Class defining values
 *
 */

public class Greeting {
	private long id;
    private String template;
    
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