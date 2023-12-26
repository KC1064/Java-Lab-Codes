// Write a program to implement multiple inheritance using interface.


interface College {
    void eat();
    void sleep();
}

interface School {
    void study();
}


class boy implements College,School {
    public void eat() {
        System.out.println("Just Eat");
    }

    public void sleep() {
        System.out.println("Just Sleep");
    }

    public void study() {
        System.out.println("Used to Study");
    }
}

class Q4_Life_test {
    public static void main(String[] args) {
        
        College me = new College();

        me.eat();
        me.sleep();
        me.giveBirth();
    }
}
