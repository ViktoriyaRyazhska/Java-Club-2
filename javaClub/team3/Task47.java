package javaClub.team3;
//
public class Task47 extends Task{
    @Override
    void execute() {
        System.out.println("Nothing to output");
    }
}

class God {
    public Human[] create(){
        Human[] humans = new Human[2];
        humans[0] = new Man("Adam");
        humans[1] = new Woman("Eve");
        return humans;
    }
}

class Human {
    private String name;

    Human(String name) {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Man extends Human {

    Man(String name) {
        super(name);
    }
}

class Woman extends Human {
    Woman(String name) {
        super(name);
    }
}


//code

