Class Dog{
    String name;
    
    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}

Class Greyhound extends Dog{
    String Color;
    int age;
    
    public Greyhound(String name, String color, int age){
        super(name);
        this.color = color;
        this.age = age;
    }

    public String getColor(){
        return this.color;
    }

    public int getAge(){
        return this.age;
    }
}