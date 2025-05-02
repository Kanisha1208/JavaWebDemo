package se.kanisha.javawebdemostefan.models;


import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;

@Entity
@Table(name="HockeyPlayer")
public class HockeyPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id", nullable = false)
    private int id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Age")
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

