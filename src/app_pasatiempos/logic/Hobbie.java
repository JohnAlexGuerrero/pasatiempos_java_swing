/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app_pasatiempos.logic;

/**
 *
 * @author JOHN
 */
public class Hobbie {
    private int id;
    private String name;
    private String createdAt;
    private boolean is_enabled = true;
    private String description;

    public Hobbie(int id, String name, String description) {
        this.id = id;
        this.name = name;
        //this.createdAt = createdAt;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setIs_enabled(boolean is_enabled) {
        this.is_enabled = is_enabled;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public boolean isIs_enabled() {
        return is_enabled;
    }

    public String getDescription() {
        return description;
    }
    
}
