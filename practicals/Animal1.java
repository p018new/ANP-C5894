package oops;

class Animal {
    private String name;
    private int age;

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

class Dogs extends Animal {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Wild {
    public static void main(String[] args) {

        Dogs d = new Dogs();

        d.setName("Casper");
        d.setAge(1);
        d.setBreed("Siberian Husky");

        System.out.println("Name: " +d.getName());
        System.out.println("Age: " +d.getAge());
        System.out.println("Breed: " +d.getBreed());
    }
}