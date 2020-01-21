package Lesson34;

public class Cat {
    private String name;
    private Integer age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public boolean equals(Object object) {
        if(object == this)return true;

        if(object instanceof Cat){
            if(((Cat)object).getAge() == age && ((Cat)object).getName().equals(name)){
                return true;
            }return false;
        }
        return false;
    }
}
