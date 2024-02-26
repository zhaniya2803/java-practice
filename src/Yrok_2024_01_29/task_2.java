package Yrok_2024_01_29;

import java.util.Arrays;

public class task_2 {
    public static void main(String[] args) {
        User[] users = {
                new User("Igor", 19, new Post[]{
                        new Post("igor пост 1", "2023-01-15 15:12"),
                        new Post("igor пост 2", "2022-09-09 18:45"),
                }),
                new User("Alexey", 23, new Post[]{
                        new Post("Alexey пост 1", "2023-01-15 15:12"),
                }),
                new User("Misha", 18, new Post[]{
                        new Post("Misha пост 1", "2023-01-15 15:12"),
                        new Post("Misha пост 2", "2022-09-09 18:45"),
                        new Post("Misha пост 2", "2022-09-09 18:45"),
                }),
                new User("Dima", 25, new Post[]{}),
        };

        String json = "users=[";
        StringBuilder bilder = new StringBuilder(json);

        for (User user : users) {
            bilder.append("{name=");
            bilder.append(user.getName());
            bilder.append(", age=");
            bilder.append(user.getAge());
            bilder.append(", posts=[{");
            bilder.append(Arrays.toString(user.getPosts()));
            bilder.append("}");
        }
        bilder.append("]");
        json = bilder.toString();
        System.out.println(json);

    }
}

class User {
    private String name;
    private int age;
    private Post[] posts;

    public User(String name, int age, Post[] posts) {
        this.name = name;
        this.age = age;
        this.posts = posts;
    }

    public Post[] getPosts() {
        return posts;
    }

    public void setPosts(Post[] posts) {
        this.posts = posts;
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

class Post {
    private String title;
    private String postedAt;

    public Post(String title, String postedAt) {
        this.title = title;
        this.postedAt = postedAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(String postedAt) {
        this.postedAt = postedAt;
    }
}
